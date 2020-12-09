package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBatalla;
import ar.edu.unlam.pb2.eva03.excepciones.VehiculoIncompatible;
import ar.edu.unlam.pb2.eva03.excepciones.VehiculoInexistente;

public class FuerzaArmada {

	private Set<Vehiculo> convoy;
	private Map<String, Batalla> batallas;
	private Integer capacidadDeDefensa; 
	
	public FuerzaArmada() {
		this.convoy= new HashSet<Vehiculo>();
		this.batallas= new HashMap<String, Batalla>();
	}

	public void agregarVehiculo(Vehiculo vehiculo) {
		convoy.add(vehiculo);
	}
	
	public void crearBatalla(String nombreBatalla, TipoDeBatalla tipoBatalla, Double latitud, Double longitud) {
		batallas.putIfAbsent(nombreBatalla, new Batalla (tipoBatalla, latitud, longitud));
	}

	public boolean enviarALaBatalla(String nombreBatalla, Integer id) throws VehiculoInexistente, VehiculoIncompatible{
		Batalla deseada= batallas.get(nombreBatalla);
		Vehiculo vehiculo = null;
		
		for(Vehiculo v: convoy) {
			if(v.getId().equals(id)) {
				vehiculo= v;
				deseada.agregarVehiculosALaBatalla(v);
				batallas.put(nombreBatalla, deseada);
				return true;
			}
			else
				throw new VehiculoInexistente("El vehiculo es inexistente");
		}
		
		return false;
	}

	public Set<Vehiculo> getConvoy() {
		return convoy;
	}

	public void setConvoy(Set<Vehiculo> convoy) {
		this.convoy = convoy;
	}

	public Map<String, Batalla> getBatallas() {
		return batallas;
	}

	public void setBatallas(Map<String, Batalla> batallas) {
		this.batallas = batallas;
	}

	public Integer getCapacidadDeDefensa() {
		return convoy.size()-1;
	}

	public void setCapacidadDeDefensa(Integer capacidadDeDefensa) {
		this.capacidadDeDefensa = capacidadDeDefensa;
	}

	public Batalla getBatalla(String nombreBatalla) {
		Batalla deseada= batallas.get(nombreBatalla);
		return deseada;
	}

}
