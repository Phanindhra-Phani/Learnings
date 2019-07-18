package encrypt;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.InputStream;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class RsaExample {

	public static KeyPair generateKeyPair() throws Exception {
		KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA");
		generator.initialize(4096, new SecureRandom());
		KeyPair pair = generator.generateKeyPair();

		return pair;
	}

	public static KeyPair getKeyPairFromKeyStore() throws Exception {

		InputStream ins = RsaExample.class.getResourceAsStream("keystore.jks");
		KeyStore keystore = KeyStore.getInstance(KeyStore.getDefaultType());
		keystore.load(ins, "changeit".toCharArray());

		String alias = "zgsdev.tfs.toyota.com";
		PublicKey publicKey = null;
		Key key = keystore.getKey(alias, "changeit".toCharArray());
		if (key instanceof PrivateKey) {
			// Get certificate of public key
			java.security.cert.Certificate cert = keystore.getCertificate(alias);

			// Get public key
			publicKey = cert.getPublicKey();
		}
		// System.out.println("Public Key ::::: "+publicKey);
		// System.out.println("Private Key ::::: "+ key);

		return new KeyPair(publicKey, (PrivateKey) key);
	}

//	  int keyLength = publicKey.getModulus().bitLength() / 16;
//    String[] datas = splitString(data, keyLength - 11);
//    String mi = ""//the data after encrypted;
//    for (String s : datas) {
//        mi += bcd2Str(cipher.doFinal(s.getBytes()));
//    }
//    return mi;

//	EncDecProcessor ac = new EncDecProcessor();
//    PublicKey publicKey = ac.getPublic(keyPath);
//    this.cipher.init(Cipher.DECRYPT_MODE, publicKey);
//    byte[] b = new byte[2048];
//    b = msg.getBytes("UTF-8");
//    byte[] byteStr = Base64.decodeBase64(b);
//    String Str = new String(cipher.doFinal(byteStr), "UTF-8");

	public static String encryptTest(String plainText, PublicKey publicKey) throws Exception {

		Cipher encryptCipher = Cipher.getInstance("RSA");// AES/CBC/NoPadding -- RSA
		encryptCipher.init(Cipher.ENCRYPT_MODE, publicKey);

		String encodedString = Base64.getEncoder().withoutPadding().encodeToString(plainText.getBytes());

		byte[] cipherText = encryptCipher.doFinal(encodedString.getBytes("UTF-8"));

//    	final Cipher symmetricCipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
//        symmetricCipher.init(Cipher.ENCRYPT_MODE, publicKey);
//        byte[] cipherText  = symmetricCipher.doFinal(plainText.getBytes());

//        Cipher encryptCipher = Cipher.getInstance("RSA");//AES/CBC/NoPadding -- RSA
//        encryptCipher.init(Cipher.ENCRYPT_MODE, publicKey);
//        
//        String encodedString =  Base64.getEncoder().withoutPadding().encodeToString(plainText.getBytes());
//        
//        byte[] cipherText = encryptCipher.doFinal(encodedString.getBytes("UTF-8"));

		// return Base64.getEncoder().encodeToString(cipherText);

		KeyGenerator generator = KeyGenerator.getInstance("AES");
		generator.init(128); // The AES key size in number of bits
		SecretKey secKey = generator.generateKey();

		Cipher aesCipher = Cipher.getInstance("AES");
		aesCipher.init(Cipher.ENCRYPT_MODE, secKey);
		byte[] byteCipherText = aesCipher.doFinal(plainText.getBytes());

		Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
		cipher.init(Cipher.PUBLIC_KEY, publicKey);
		byte[] encryptedKey = cipher.doFinal(secKey.getEncoded());

		return "";
	}

	public static String encrypt(String plainText, PublicKey publicKey) throws Exception {

		Cipher encryptCipher = Cipher.getInstance("RSA");
		encryptCipher.init(Cipher.ENCRYPT_MODE, publicKey);

		StringBuilder encryptedOutput = new StringBuilder();

		int length = plainText.length();

		System.out.println("Original Message length ::::: " + length);

		int startIndex = 0;
		int endIndex = 240;
		String subString = "";

		while (endIndex <= length) {

			subString = plainText.substring(startIndex, endIndex);
			byte[] byteCipherText = encryptCipher.doFinal(subString.getBytes());

			encryptedOutput.append(Base64.getEncoder().encodeToString(byteCipherText));
			encryptedOutput.append("encrypt");
			startIndex = endIndex;
			endIndex = endIndex + 240;
		}

		if (startIndex < length && length < endIndex) {

			subString = plainText.substring(startIndex, length);
			byte[] byteCipherText = encryptCipher.doFinal(subString.getBytes());

			encryptedOutput.append(Base64.getEncoder().encodeToString(byteCipherText));
			encryptedOutput.append("encrypt");
		}

		System.out.println("encrypted Message length::::: " + encryptedOutput.length());

		return encryptedOutput.toString();
	}

	public static String decryptUsingRSA(String cipherText, PrivateKey privateKey) throws Exception {
		byte[] bytes = Base64.getDecoder().decode(cipherText);
		Cipher decriptCipher = Cipher.getInstance("RSA");
		decriptCipher.init(Cipher.DECRYPT_MODE, privateKey);
		return new String(decriptCipher.doFinal(bytes), UTF_8);
	}

	public static String decrypt(String cipherText, PrivateKey privateKey) throws Exception {

		String[] encryptMessageArray = cipherText.split("encrypt");

		StringBuilder decryptedMessage = new StringBuilder();

		int i = 1;
		for (String string : encryptMessageArray) {
			System.out.println("String message ::: " + i + " ** " + string);
			i++;
			byte[] bytes = Base64.getDecoder().decode(string);
			Cipher decriptCipher = Cipher.getInstance("RSA");
			decriptCipher.init(Cipher.DECRYPT_MODE, privateKey);

			decryptedMessage.append(new String(decriptCipher.doFinal(bytes), UTF_8));
		}

		return decryptedMessage.toString();
	}

	public static void main(String... argv) throws Exception {
		// First generate a public/private key pair
		// KeyPair pair = generateKeyPair();
		KeyPair pair = getKeyPairFromKeyStore();

		// Our secret message
		String message = "<?xml version=\"1.0\" ?>\r\n"
				+ "<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\r\n" + "    <soap:Body>\r\n"
				+ "        <DecisionEngineEval xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns=\"http://www.experian.com/toyota_cap\">\r\n"
				+ "            <AppNbr>14807076</AppNbr>\r\n" + "            <AliasName>RETAIL</AliasName>\r\n"
				+ "            <Signature>TFSCAP</Signature>\r\n" + "            <ApplicationInfo>\r\n"
				+ "                <DSSO>3</DSSO>\r\n" + "                <ProductType>RTL</ProductType>\r\n"
				+ "                <AppRcvdDate>2018-04-23</AppRcvdDate>\r\n" + "<?xml version=\"1.0\" ?>\r\n"
				+ "<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\r\n" + "    <soap:Body>\r\n"
				+ "        <DecisionEngineEval xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns=\"http://www.experian.com/toyota_cap\">\r\n"
				+ "            <AppNbr>14807076</AppNbr>\r\n" + "            <AliasName>RETAIL</AliasName>\r\n"
				+ "            <Signature>TFSCAP</Signature>\r\n" + "            <ApplicationInfo>\r\n"
				+ "                <DSSO>3</DSSO>\r\n" + "                <ProductType>RTL</ProductType>\r\n"
				+ "                <AppRcvdDate>2018-04-23</AppRcvdDate>\r\n" + "<?xml version=\"1.0\" ?>\r\n"
				+ "<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\r\n" + "    <soap:Body>\r\n"
				+ "        <DecisionEngineEval xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns=\"http://www.experian.com/toyota_cap\">\r\n"
				+ "            <AppNbr>14807076</AppNbr>\r\n" + "            <AliasName>RETAIL</AliasName>\r\n"
				+ "            <Signature>TFSCAP</Signature>\r\n" + "            <ApplicationInfo>\r\n"
				+ "                <DSSO>3</DSSO>\r\n" + "                <ProductType>RTL</ProductType>\r\n"
				+ "                <AppRcvdDate>2018-04-23</AppRcvdDate>\r\n" + "<?xml version=\"1.0\" ?>\r\n"
				+ "<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\r\n" + "    <soap:Body>\r\n"
				+ "        <DecisionEngineEval xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns=\"http://www.experian.com/toyota_cap\">\r\n"
				+ "            <AppNbr>14807076</AppNbr>\r\n" + "            <AliasName>RETAIL</AliasName>\r\n"
				+ "            <Signature>TFSCAP</Signature>\r\n" + "            <ApplicationInfo>\r\n"
				+ "                <DSSO>3</DSSO>\r\n" + "                <ProductType>RTL</ProductType>\r\n"
				+ "                <AppRcvdDate>2018-04-23</AppRcvdDate>\r\n";

		// String message = "Hi ra. Thinnava raaa?";

		// Encrypt the message
		String cipherText = encrypt(message, pair.getPublic());

		System.out.println("Encrypted Message is :::" + cipherText);

		// Now decrypt it
		String decipheredMessage = decrypt(cipherText, pair.getPrivate());

		System.out.println("Decrypted Message is :::" + decipheredMessage);
	}

	/*
	 * public static void main(String[] args) {
	 * 
	 * final RandomSymmetricCipher cipher = new RandomSymmetricCipher();
	 * 
	 * // Encrypt the data and the random symmetric key. final CryptoPacket
	 * cryptoPacket = cipher.encrypt(inputData, PRIVATE_KEY_BASE64);
	 * 
	 * // Convert the CryptoPacket into a Base64 String that can be readily
	 * reconstituted at the other end. final CryptoPacketConverter
	 * cryptoPacketConverter = new CryptoPacketConverter(); final String
	 * base64EncryptedData = cryptoPacketConverter.convert(cryptoPacket);
	 * System.out.println("Base64EncryptedData=" + base64EncryptedData);
	 * 
	 * // Decrypt the Base64 encoded (and encrypted) String. final byte[] outputData
	 * = cipher.decrypt(base64EncryptedData, PUBLIC_KEY_BASE64); }
	 * 
	 */
}