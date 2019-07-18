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

        return new KeyPair(publicKey,(PrivateKey) key);
    }

    public static String encrypt(String plainText, PublicKey publicKey) throws Exception {
        Cipher encryptCipher = Cipher.getInstance("RSA");
        encryptCipher.init(Cipher.ENCRYPT_MODE, publicKey);
        
        //Base64.encodeBase64String(plainText);
        
        byte[] cipherText = encryptCipher.doFinal(plainText.getBytes(UTF_8));
        return Base64.getEncoder().encodeToString(cipherText);
    }

    public static String decrypt(String cipherText, PrivateKey privateKey) throws Exception {
        byte[] bytes = Base64.getDecoder().decode(cipherText);
        Cipher decriptCipher = Cipher.getInstance("RSA");
        decriptCipher.init(Cipher.DECRYPT_MODE, privateKey);
        return new String(decriptCipher.doFinal(bytes), UTF_8);
    }
    
    public static void main(String... argv) throws Exception {
        //First generate a public/private key pair
       // KeyPair pair = generateKeyPair();
        KeyPair pair = getKeyPairFromKeyStore();

        //Our secret message
        String message = "<?xml version=\"1.0\" ?>\r\n" + 
        		"<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\r\n" + 
        		"    <soap:Body>\r\n" + 
        		"        <DecisionEngineEval xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns=\"http://www.experian.com/toyota_cap\">\r\n" + 
        		"            <AppNbr>14807076</AppNbr>\r\n" + 
        		"            <AliasName>RETAIL</AliasName>\r\n" + 
        		"            <Signature>TFSCAP</Signature>\r\n" + 
        		"            <ApplicationInfo>\r\n" + 
        		"                <DSSO>3</DSSO>\r\n" + 
        		"                <ProductType>RTL</ProductType>\r\n" + 
        		"                <AppRcvdDate>2018-04-23</AppRcvdDate>\r\n";

        //Encrypt the message
        String cipherText = encrypt(message, pair.getPublic());

        System.out.println("Encrypted Message is :::" + cipherText);
        
        //Now decrypt it
        String decipheredMessage = decrypt(cipherText, pair.getPrivate());

        System.out.println("Decrypted Message is :::" +decipheredMessage);
    }
}