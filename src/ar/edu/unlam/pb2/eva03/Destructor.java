package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.Acuatico;

public class Destructor extends Vehiculo implements Acuatico{

	private Double profundidad;
	
	public Destructor(Integer Id, String nombre) {
		super(Id, nombre);
		this.profundidad= 0.0;
	}

	@Override
	public Double getProfundidad() {
		// TODO Auto-generated method stub
		return this.profundidad;
	}

}
