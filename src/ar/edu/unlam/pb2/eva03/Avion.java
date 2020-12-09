package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.Volador;
import ar.edu.unlam.pb2.eva03.*;

public class Avion extends Vehiculo implements Volador {

	private Double altura;

	public Avion(Integer Id, String nombre) {
		super(Id, nombre);
		this.altura= 0.0;
	}

	public Double getAltura() {
		return altura;
	}

}
