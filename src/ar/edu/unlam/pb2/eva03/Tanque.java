package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.Terrestre;

public class Tanque extends Vehiculo implements Terrestre {

	private Double velocidad;

	public Tanque(Integer Id, String nombre) {
		super(Id, nombre);
		this.velocidad=0.0;
	}

	@Override
	public Double getVelocidad() {
		// TODO Auto-generated method stub
		return velocidad;
	}

}
