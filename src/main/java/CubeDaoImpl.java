import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import geometricsform.models.Cube;

public class CubeDaoImpl implements CubeDao {
	
	private DaoFactory daoFactory;
	
	public CubeDaoImpl(DaoFactory daoFactory) {
		this.daoFactory = daoFactory;
	}
	
	@Override
	public Cube getId(Integer id) {
		Cube cube = new Cube();
		Connection connection = null;
		Statement statement = null;
		ResultSet result = null;
		
		try {
			connection = daoFactory.getConnection();
			statement = connection.createStatement();
			result = statement.executeQuery( "SELECT * FROM cube WHERE id_cube = " + id);

			//Si il n'existe pas de cube en base de données 
			if(result.first()) {
				cube = new Cube(
								id, 
								result.getString("colorCube"),
								result.getString("nameCube")
								);
			}
		}catch  (SQLException e){
			 e.printStackTrace();
		}
		return cube;	
	}
}
