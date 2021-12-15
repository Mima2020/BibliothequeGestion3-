package testY;

import connexion.AccesJDBC;
import graphique.Authentification;

public class MainM {
	
	static String chaineconnexionJDBC = "jdbc:sqlserver://KADIR\\SQLEXPRESS;" + "databaseName=Pgi;"
			+ "user=sa;password=sa";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccesJDBC.initialiser(chaineconnexionJDBC);
		Authentification.main(null);

	}

}
