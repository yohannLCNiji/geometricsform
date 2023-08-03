package geometricsform.Dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DaoFactory {
	
	//URL de connexion
	private String url;  //= "jdbc:postgresql://localhost:5434/GeometricForm";
	//nom du user
	private String user; //= "postgres";
	//mot de passe du user
	private String mdp; //= "admin";
	
	DaoFactory(String url, String user, String mdp){
		this.url = url;
		this.user = user; 
		this.mdp = mdp; 
	}
	
	//Méthode qui va nous retourner notre instance de connexion
	//et la créer si elle n'existe pas 
	public static DaoFactory getInstance() {
		try {
			Class.forName("org.postgresql.Driver");
		}catch(ClassNotFoundException e) {
			
		}
		
		DaoFactory instance = new DaoFactory(
				"jdbc:postgresql://localhost:5434/GeometricForm", "postgres", "admin");
		
		return instance;
	}
	
	public Connection getConnection() throws SQLException {
	        return DriverManager.getConnection(url, user, mdp);
    }

    // Récupération du Dao
    public CubeDao getCubeDao() {
        return new CubeDaoImpl(this);
    }		
    
}
