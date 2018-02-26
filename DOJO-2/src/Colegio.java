import java.util.Arrays;

import utilidades.Fecha;
import utilidades.Leer;

public class Colegio {

	public static void main(String[] args) {
	Fecha fecha_actual = new Fecha(23,2,2018);
	Alumno alumnos [] = new Alumno [10];
	alumnos[0] = new Alumno("Sergio", new Fecha (19,9,1995));
	alumnos[1] = new Alumno("Javier", new Fecha (24,7,1977));
	alumnos[2] = new Alumno("Ada", new Fecha (16,05,1992));

	Asignatura asignaturas[] = new Asignatura[10];
	asignaturas[0] = new Asignatura(8, '1', "Progamacion");
	asignaturas[1] = new Asignatura(6, '1', "Bases");
	asignaturas[2] = new Asignatura(5, '1', "Sistemas");
	asignaturas[3] = new Asignatura(3, '1', "Marcas");
	asignaturas[4] = new Asignatura(3, '1', "Entornos");
	asignaturas[5] = new Asignatura(3, '1', "Ingles");
	asignaturas[6] = new Asignatura(2, '1', "Fol");
	
	int menu = -1;
	do {
		Leer.mostrarEnPantalla("------------------------\n1. Matricular en Asignaturas\n 2.Establecer Notas\n 3.Boletin \n------------------------------\n" );
		menu= Leer.pedirEntero("introduzca una opcion");
		switch (menu) {
		case 1:
			int numAlum = -1;
			boolean encontrado = false;
			String nombre =  Leer.pedirCadena("introduzca el nombre del alumno");
			for (int i = 0; i < alumnos.length; i++) {
				if (alumnos[i].getNombre().equals(nombre)) {
					numAlum = i;
					encontrado = true;
					Leer.mostrarEnPantalla("El alumno"+alumnos[i].getNombre()+" esta dado de alta\n Procedemos a iniciar el proceso de matricula");
				}
			}
				if (encontrado) {
					procesoMatricular(alumnos[numAlum], asignaturas);
				}
				else {
					Leer.mostrarEnPantalla("Alumno no encontrado");
				}
			

			break;

		case 2:
			
			break;

		case 3:
			
			break;

		case 4:
			
			break;

		case 5:
			
			break;

		case 6:
			
			break;

		case 0:
			
			break;

		default:
			break;
		}
	} while (menu!=0);
	}

	/**
	 * @param alumnos
	 * @param asignaturas
	 */
	public static void procesoMatricular(Alumno alumno, Asignatura[] asignaturas) {
		String salir ="N";
		do {
			int j;
			for (j = 0; j < asignaturas.length; j++) {
				Leer.mostrarEnPantalla(j+".- "+asignaturas[j].getNombre());	
			}
			
		    j = Leer.pedirEntero("\n--------------------------------\nintroduzca la Asigatura a matricular");
			Leer.mostrarEnPantalla(alumno.matricular(asignaturas[j]));
		    salir = Leer.pedirCadena("Quiere salir del proceso de matriculacion S/N","sSnN");

		} while (salir.equals("N") || salir.equals("n"));
	}
}
