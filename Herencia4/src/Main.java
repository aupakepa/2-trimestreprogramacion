import utilidades.Leer;

/**Ejercicio 4
Escribe un programa que pida los datos de una serie de empleados y jefes que tiene la empresa "Eléctrica, SA". De cada empleado nos interesa:
 nombre de la empresa, nombre del empleado, edad, porcentaje de incremento de sueldo y sueldo base. 
Ten en cuenta lo siguiente:
•	El nombre de la empresa es el mismo para todos y es un dato que no se podrá cambiar.
•	El sueldo base es el mismo para todos.
•	Cada empleado gana el sueldo base más el porcentaje aplicado a cada empleado.
De los jefes, como empleados que son, nos interesan los mismos datos que antes más el plus que tiene como jefe y el nombre del departamento del que son responsables. Ten en cuenta que el plus es el mismo para todos los jefes.
El programa siempre partirá de un sueldo base de 1000€ y de un plus para los jefes de 250€.
Una vez pedidos los datos, se visualizará la información de todos ellos.
Posteriormente, el programa gestionará un menú como este:
DADO EL SIGUIENTE MENÚ: 

1. Modificar el sueldo base de todos los empleados. 
2. Modificar el plus de todos los jefes. 
3. Visualizar los datos de todos los empleados. 
0. Salir. 
ELIJA UNA OPCIÓN:
*/
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sueldoBase;
		double plus;
		int menu;
		do {
		Leer.mostrarEnPantalla("1. Modificar el sueldo base de todos los empleados.");
		Leer.mostrarEnPantalla("2. Modificar el plus de todos los jefes. ");
		Leer.mostrarEnPantalla("3. Visualizar los datos de todos los empleados.");
		Leer.mostrarEnPantalla("0. Salir.");
		Leer.mostrarEnPantalla("ELIJA UNA OPCIÓN:");
		menu=Leer.pedirEntero("introduzca la opcion", "[0-3]");
		
		switch (menu) {
		
		case 1:
			sueldoBase = Leer.pedirDouble("introzca el nuevo Salario Base");
			Empleado.setSueldoBase(sueldoBase);
			
			break;
		case 2:
			plus = Leer.pedirDouble("introzca el nuevo Salario Base");
			Jefe.setPlus(plus);
			break;
		case 3:
			
			break;
		case 4:
			
			break;
		default:
			break;
		}
		} while (menu!=0);

	}

}
