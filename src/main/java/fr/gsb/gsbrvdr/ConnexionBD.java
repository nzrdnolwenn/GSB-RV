package fr.gsb.gsbrvdr;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConnexionBD {

    private static String dbURL = "jdbc:mariadb://localhost:3306/gsbrv" ;
    private static String user = "gsb-rv" ;
    private static String password = "ArYlEaNN94" ;

    private static Connection connexion = null ;

    private ConnexionBD() throws ConnexionException {
        try {
            Class.forName( "org.mariadb.jdbc.Driver" ) ;
            connexion = (Connection) DriverManager.getConnection(dbURL, user, password) ;
        }
        catch( Exception e ){
            throw new ConnexionException() ;
        }
    }

    public static Connection getConnexion() throws ConnexionException {
        if( connexion == null ){
            new ConnexionBD() ;
        }
        return connexion ;
    }
}