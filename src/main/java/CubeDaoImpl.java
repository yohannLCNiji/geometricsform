import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class CubeDaoImpl implements CubeDao {
	
	private DaoFactory daoFactory;
	
	public CubeDaoImpl(DaoFactory daoFactory) {
		this.daoFactory = daoFactory;
	}
	
	@Override
	public void getId(Integer id) {
		Connection connection = null;
		PreparedStatement prepareStatement = null;
		
		try {
			connection = daoFactory.getConnection();
			prepareStatement = connection.prepareStatement("SELECT * FROM cube WHERE id_cube = " + id);
			
			//Si il n'existe pas de cube en base de données 
//			if(result.first()) {
//				cube = new Cube(
//								id, 
//								result.getString("colorCube"),
//								result.getString("nameCube")
//								);
//			}
			}catch  (SQLException e){
				 e.printStackTrace();
			}
	
	}
}
