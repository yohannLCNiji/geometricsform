import java.sql.Connection;

public abstract class DAO<T> {
	public Connection connection = DaoFactory.getInstance();
	
	/**
	 * Récupère un objet grace à son id
	 * @param id
	 * @return
	 */
	public abstract T getId(Integer id);
		

	
	

}
