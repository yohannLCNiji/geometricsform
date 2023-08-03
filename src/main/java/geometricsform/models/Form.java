package geometricsform.models;

public class Form {
	
	private Integer IdForm;
	private Integer IdCube;
	private Integer IdRond;
	private Integer IdTriangle;
	
	public Form(Integer idForm, Integer idCube, Integer idRond, Integer idTriangle) {
		IdForm = idForm;
		IdCube = idCube;
		IdRond = idRond;
		IdTriangle = idTriangle;
	}
	
	public Integer getIdForm() {
		return IdForm;
	}
	
	public void setIdForm(Integer idForm) {
		IdForm = idForm;
	}
	
	public Integer getIdCube() {
		return IdCube;
	}
	public void setIdCube(Integer idCube) {
		IdCube = idCube;
	}
	
	public Integer getIdRond() {
		return IdRond;
	}
	public void setIdRond(Integer idRond) {
		IdRond = idRond;
	}
	
	public Integer getIdTriangle() {
		return IdTriangle;
	}
	
	public void setIdTriangle(Integer idTriangle) {
		IdTriangle = idTriangle;
	}
	
}
