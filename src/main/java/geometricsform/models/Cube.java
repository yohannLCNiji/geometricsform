package geometricsform.models;

public class Cube {
	private Integer IdCube;
	private String colorCube;
	private String nameCube;
	
	public Cube(){}
	
	public Cube(Integer idCube, String colorCube, String nameCube) {
		this.IdCube = idCube;
		this.colorCube = colorCube;
		this.nameCube = nameCube;
	}

	public Integer getIdCube() {
		return IdCube;
	}
	
	public void setIdCube(Integer idCube) {
		IdCube = idCube;
	}
	
	public String getColorCube() {
		return colorCube;
	}
	
	public void setColorCube(String colorCube) {
		this.colorCube = colorCube;
	}
	
	public String getNameCube() {
		return nameCube;
	}
	
	public void setNameCube(String nameCube) {
		this.nameCube = nameCube;
	}
}
