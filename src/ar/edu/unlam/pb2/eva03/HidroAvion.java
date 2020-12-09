package ar.edu.unlam.pb2.eva03;

public class HidroAvion extends Vehiculo{

	private Double altura;
	private Double profundidad;

	public HidroAvion(Integer Id, String nombre) {
		super(Id, nombre);
		this.setAltura(0.0);
		this.setProfundidad(0.0);
	}

	public Double getProfundidad() {
		return profundidad;
	}

	public void setProfundidad(Double profundidad) {
		this.profundidad = profundidad;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

}
