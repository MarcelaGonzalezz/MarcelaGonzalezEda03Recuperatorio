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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((numeroIdentidicador == null) ? 0 : numeroIdentidicador.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehiculo other = (Vehiculo) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (numeroIdentidicador == null) {
			if (other.numeroIdentidicador != null)
				return false;
		} else if (!numeroIdentidicador.equals(other.numeroIdentidicador))
			return false;
		return true;
	}

	
}
