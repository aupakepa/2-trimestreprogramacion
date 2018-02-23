
public class Asignatura {

	private Integer horasSemanales;
	private char nivel;
	private String nombre;
	
	public Asignatura(Integer horasSemanales, char nivel, String nombre) {
		this.horasSemanales = horasSemanales;
		this.nivel = nivel;
		this.nombre = nombre;
	}

	public Integer getHorasSemanales() {
		return horasSemanales;
	}

	public void setHorasSemanales(Integer horasSemanales) {
		this.horasSemanales = horasSemanales;
	}

	public char getNivel() {
		return nivel;
	}

	public void setNivel(char nivel) {
		this.nivel = nivel;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Asignatura [horasSemanales=" + horasSemanales + ", nivel=" + nivel + ", nombre=" + nombre + "]";
	}
	
	
}
