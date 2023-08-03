import java.sql.ResultSet;
import java.sql.SQLException;

import geometricsform.models.Cube;

public class CubeDao extends DAO<Cube>{

	@Override
	public Cube getId(Integer id) {
		Cube cube = new Cube();
		try {
			ResultSet result = this.connection
                    .createStatement(
                        ResultSet.TYPE_SCROLL_INSENSITIVE, 
                        ResultSet.CONCUR_READ_ONLY
                     ).executeQuery(
                        "SELECT * FROM cube WHERE id_cube = " + id
                     );
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
