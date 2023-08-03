import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DaoFactory {
	
	//URL de connexion
	public static String url = "jdbc:postgresql://localhost:5434/GeometricForm";
	
	//nom du user
	private static String user = "admin";
	
	//mot de passe du user
	private static String mdp = "admin";
	
	//Objet connexion
	private static Connection connection;
	
	//Méthode qui va nous retourner notre instance de connxion
	//et la c réer si elle n'existe pas 
	public static Connection getInstance() {
		if(connection == null) {
			try{
                connection = DriverManager.getConnection(url, user, mdp);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }        
        return connection;  		
	}
}
