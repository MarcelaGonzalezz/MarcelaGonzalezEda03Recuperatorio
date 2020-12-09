package ar.edu.unlam.pb2.eva03;

import java.util.HashSet;
import java.util.Set;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBatalla;
import ar.edu.unlam.pb2.eva03.excepciones.VehiculoIncompatible;
import ar.edu.unlam.pb2.eva03.interfaces.Acuatico;
import ar.edu.unlam.pb2.eva03.interfaces.Terrestre;
import ar.edu.unlam.pb2.eva03.interfaces.Volador;

public class Batalla implements Acuatico, Terrestre, Volador{
	private Double latitud;
	private Double longitud;
	private TipoDeBatalla tipo;
	Set<Vehiculo> vehiculosEnLaBatalla;
	
	public Batalla(TipoDeBatalla tipo, Double latitud, Double longitud) {
		this.tipo= tipo;
		this.latitud= latitud;
		this.longitud= longitud;
		vehiculosEnLaBatalla= new HashSet<Vehiculo>();
	}

	public void agregarVehiculosALaBatalla(Vehiculo vehiculo) throws VehiculoIncompatible{
		switch(this.tipo) {
		case AEREA:
			if (vehiculo instanceof Volador)
				vehiculosEnLaBatalla.add(vehiculo);
			else
				throw new VehiculoIncompatible("el vehiculo es incompatible");
			break;
		case NAVAL:
			if (vehiculo instanceof Acuatico)
				vehiculosEnLaBatalla.add(vehiculo);
			else
				throw new VehiculoIncompatible("el vehiculo es incompatible");
			break;
		case TERRESTRE:
			if (vehiculo instanceof Terrestre)
				vehiculosEnLaBatalla.add(vehiculo);
			else
				throw new VehiculoIncompatible("el vehiculo es incompatible");
			break;
		}
	}
	
	public Double getLatitud() {
		return latitud;
	}

	public void setLatitud(Double latitud) {
		this.latitud = latitud;
	}

	public Double getLongitud() {
		return longitud;
	}

	public void setLongitud(Double longitud) {
		this.longitud = longitud;
	}

	public TipoDeBatalla getTipo() {
		return tipo;
	}

	public void setTipo(TipoDeBatalla tipo) {
		this.tipo = tipo;
	}

	public Set<Vehiculo> getVehiculosEnLaBatalla() {
		return vehiculosEnLaBatalla;
	}

	public void setVehiculosEnLaBatalla(Set<Vehiculo> vehiculosEnLaBatalla) {
		this.vehiculosEnLaBatalla = vehiculosEnLaBatalla;
	}

	@Override
	public Double getAltura() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double getVelocidad() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double getProfundidad() {
		// TODO Auto-generated method stub
		return null;
	}
}
