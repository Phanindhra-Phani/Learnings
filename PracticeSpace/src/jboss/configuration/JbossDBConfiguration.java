package jboss.configuration;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class JbossDBConfiguration {
	//http://penguindreams.org/blog/running-beans-that-use-application-server-datasources-locally/
	//http://stackoverflow.com/questions/5861874/easy-way-to-start-a-standalone-jndi-server-and-register-some-resources
	public static void main(String[] args) throws NamingException, SQLException {
		InitialContext initCnxt = new InitialContext();
		DataSource ds = (DataSource)initCnxt.lookup("java:jboss/jbpm5XaDS");
		Connection con = ds.getConnection();
		
		Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select count(*) from  MFi_LICENSEE");
        
        System.out.println(rs.first());
	}

}
