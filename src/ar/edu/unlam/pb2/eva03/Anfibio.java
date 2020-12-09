package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.Acuatico;
import ar.edu.unlam.pb2.eva03.interfaces.Terrestre;

public class Anfibio extends Vehiculo implements Terrestre, Acuatico{

	private Double velocidad;
	private Double profundidad;

	public Anfibio(Integer Id, String nombre) {
		super(Id, nombre);
		this.setVelocidad(0.0);
		this.setProfundidad(0.0);
	}

	public void setVelocidad(Double velocidad) {
		this.velocidad = velocidad;
	}

	public void setProfundidad(Double profundidad) {
		this.profundidad = profundidad;
	}

	@Override
	public Double getProfundidad() {
		// TODO Auto-generated method stub
		return profundidad;
	}

	@Override
	public Double getVelocidad() {
		// TODO Auto-generated method stub
		return velocidad;
	}

}
