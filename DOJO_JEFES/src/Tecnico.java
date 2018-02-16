import utilidades.Fecha;

public class Tecnico extends Empleado {
	private String especialidad;
	private Float plusEspecialidad;
	private Responsable jefe;

	public Float calculoNomina() {
		Float nomina= super.calculoNomina()+plusEspecialidad;
		return nomina;
	}

	
	public Tecnico(String nombre, Fecha fecha_nacimiento, Fecha fechaIngreso, String especialidad,
			Float plusEspecialidad, Responsable vector) {
		super(nombre, fecha_nacimiento, fechaIngreso);
		this.especialidad = especialidad;
		this.plusEspecialidad = plusEspecialidad;
		this.jefe = vector;
		vector.setPersonasACargo(vector.getPersonasACargo()+1);
	}


	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public Float getPlusEspecialidad() {
		return plusEspecialidad;
	}

	public void setPlusEspecialidad(Float plusEspecialidad) {
		this.plusEspecialidad = plusEspecialidad;
	}

	public Responsable getJefe() {
		return jefe;
	}

	public void setJefe(Responsable jefe) {
		this.jefe = jefe;
	}

	@Override
	public String toString() {
		return "Tecnico [especialidad=" + especialidad + ", plusEspecialidad=" + plusEspecialidad + ", jefe=" + jefe
				+ "]";
	}

}
