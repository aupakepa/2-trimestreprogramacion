
public class Jefe extends Empleado {
static double plus=250;
private String nomDepart;
@Override
public String toString() {
	return "Jefe[NomEmp=" + getNomEmp() + ", nombre=" + getNombre() + ", edad=" + getEdad() + ", porIncremento=" + getPorIncremento() + ", sueldo=" + getSueldo() + "nomDepart=" + nomDepart + "]";
}
public Jefe(String nombre, int edad, double porIncremento, double sueldo, String nomDepart) {
	super(nombre, edad, porIncremento, sueldo);
	this.nomDepart = nomDepart;
}
public static double getPlus() {
	return plus;
}
public static void setPlus(double plus) {
	Jefe.plus = plus;
}
public String getNomDepart() {
	return nomDepart;
}
public void setNomDepart(String nomDepart) {
	this.nomDepart = nomDepart;
}
}
