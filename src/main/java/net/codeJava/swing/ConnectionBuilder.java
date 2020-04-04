package net.codeJava.swing;

import java.sql.DriverManager;
import java.sql.*;

import com.sun.corba.se.pept.transport.Connection;

public class ConnectionBuilder {
	 String username="system";
	 String password="root";
	 static Connection con=null;
	
	public static Connection buildConnection() {
	Connection con = null;
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/java_login", "root", "");
	}catch (Exception e){
		System.out.println(e.getMessage());
	}
	return con;

}
}
