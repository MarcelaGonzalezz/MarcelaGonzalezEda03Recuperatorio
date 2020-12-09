package ar.edu.unlam.pb2.eva03;

public class Vehiculo {
	
	private Integer numeroIdentidicador;
	private String nombre;

	public Vehiculo (Integer Id, String nombre) {
		this.setId(Id);
		this.setNombre(nombre);
	}

	public Integer getId() {
		return numeroIdentidicador;
	}

	public void setId(Integer numeroIdentidicador) {
		this.numeroIdentidicador = numeroIdentidicador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
