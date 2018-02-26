import java.util.Arrays;

import utilidades.Fecha;

public class Alumno {

	private Asignatura asignaturas[] = new Asignatura[10];
	private int notas[];
	private String nombre;
	private Fecha fechanacimiento;

	public Alumno(String nombre, Fecha fecha) {
		super();
		this.nombre = nombre;
		this.fechanacimiento = fecha;
	}

	private int edad(Fecha fecha_actual) {
		int edad = 0;
		edad = fecha_actual.difFechas(fechanacimiento) / 365;
		return edad;
	}

	public String califica(Asignatura asignatura, int nota) {
		boolean resultado = false;
		String frase;
		for (int i = 0; i < asignaturas.length; i++) {
			if (asignaturas[i] == asignatura) {
				notas[i] = nota;
				resultado = true;
			}
		}
		if (resultado) {
			frase = "Calificación realizada con éxito. (" + nota + ")";
		} else {
			frase = "Asignatura no encontrada, alumno sin calificar.";
		}
		return frase;
	}

	public String matricular(Asignatura asignatura) {
		String frase = "";
		boolean repite = true; // Suponemos que se repite
		for (int i = 0; i < asignaturas.length; i++) {
			if (asignaturas[i] == asignatura) {
				repite = false; // Se repite
				frase = "Ya etsa matriculado";
			}
		}
		if (repite) {
			for (int j = 0; j < asignaturas.length; j++) {
				if (asignaturas[j] == null) {
					asignaturas[j] = asignatura;
					j = asignaturas.length;
					frase = "Ha sido matriculado de " + asignatura;
				}

			}
		}
		return frase;
	}

	public String obtenernota(Asignatura asignatura) {
		String frase = "";
		boolean encontrada = false;
		int nota = -1;
		for (int i = 0; i < asignaturas.length || !encontrada; i++) {
			if (asignaturas[i] == asignatura) {
				nota = notas[i];
				encontrada = true;
			}
		}
		if (encontrada) {
			frase = "La nota de " + asignatura + " es " + nota;
		} else {
			frase = "Asignatura  no encontrada";
		}
		return frase;
	}

	public void boletin(Fecha fecha_actual) {
		System.out.println(this.nombre);
		String asign="nombre: " + this.nombre +"edad: " + this.edad(fecha_actual)+ "\n";
		for (int i = 0; i < asignaturas.length; i++) {
			if (asignaturas[i]!=null) {
				asign= asign + asignaturas[i].getNombre()+" nota= " + notas[i] ;
			}
		}
	}
	public Asignatura[] getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(Asignatura[] asignaturas) {
		this.asignaturas = asignaturas;
	}

	public int[] getNotas() {
		return notas;
	}

	public void setNotas(int[] notas) {
		this.notas = notas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Fecha getFechanacimiento() {
		return fechanacimiento;
	}

	public void setFecha(Fecha fecha) {
		this.fechanacimiento = fecha;
	}

	@Override
	public String toString() {
		return "Alumnos [asignaturas=" + Arrays.toString(asignaturas) + ", notas=" + Arrays.toString(notas)
				+ ", nombre=" + nombre + ", fecha=" + fechanacimiento + "]";
	}
}
