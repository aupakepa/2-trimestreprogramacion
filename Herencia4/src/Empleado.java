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
public class Empleado {
final String NomEmp = "Electrica, S.A";
private String nombre;
private int edad;
private double porIncremento;
static double sueldoBase = 1000;
private double sueldo;
public Empleado(String nombre, int edad, double porIncremento, double sueldo) {
	super();
	this.nombre = nombre;
	this.edad = edad;
	this.porIncremento = porIncremento;
	this.sueldo = sueldo;
}
@Override
public String toString() {
	return "Empleado [NomEmp=" + NomEmp + ", nombre=" + nombre + ", edad=" + edad + ", porIncremento=" + porIncremento
			+ ", sueldo=" + sueldo + "]";
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
}
public double getPorIncremento() {
	return porIncremento;
}
public void setPorIncremento(double porIncremento) {
	this.porIncremento = porIncremento;
}
public static double getSueldoBase() {
	return sueldoBase;
}
public static void setSueldoBase(double sueldoBase) {
	Empleado.sueldoBase = sueldoBase;
}
public double getSueldo() {
	return sueldo;
}
public void setSueldo(double sueldo) {
	this.sueldo = sueldo;
}
public String getNomEmp() {
	return NomEmp;
}
}
