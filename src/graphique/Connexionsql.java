package graphique;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class Connexionsql {
Connection conn =null ;
	
	public static  Connection ConnexionDB() {
		try {
			 
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection conn = DriverManager.getConnection("jdbc:sqlserver://KADIR\\SQLEXPRESS;" + "databaseName=Pgi;"
		            + "user=sa;password=sa");
			return conn ;
		
		}
		catch(Exception e)
		{ JOptionPane.showMessageDialog(null, e);
		return null;
		}
	}

}
