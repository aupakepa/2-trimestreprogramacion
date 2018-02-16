import utilidades.Fecha;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado vector[] = new Empleado[20];
		Fecha sysdate = new Fecha(16, 02, 2018);
		introducirDatos(vector);

	}

	public static void  introducirDatos(Empleado vector[]) {

		vector[Empleado.getSiguiente()]=new Responsable("Lucia", new Fecha(18, 05, 1998),  new Fecha(2, 2, 2000), 200.f, "Marketing");
		vector[Empleado.getSiguiente()]=new Responsable("Pedro", new Fecha(18, 05, 1998),  new Fecha(2, 2, 2000), 200.f, "Marketing");
		vector[Empleado.getSiguiente()]=new Tecnico("Juan", new Fecha(2, 03, 1997), new Fecha(02, 05, 2000) , "marketing", (float) 100, (Responsable) vector[0]);
		vector[Empleado.getSiguiente()]=new Tecnico("Julian", new Fecha(18, 05, 1998), new Fecha(2, 2, 2000), "Produccion", 200.f, (Responsable)vector[0]);
		vector[Empleado.getSiguiente()]=new Tecnico("Pedro", new Fecha(18, 05, 1998),  new Fecha(2, 2, 2000), "Produccion", 200.f, (Responsable) vector[0]);
		vector[Empleado.getSiguiente()]=new Tecnico("Anis", new Fecha(18, 05, 1998),  new Fecha(2, 2, 2000), "Produccion", 200.f, (Responsable) vector[1]);
		vector[Empleado.getSiguiente()]=new Administrativo("Francisco",  new Fecha(18, 05, 1998),  new Fecha(18, 05, 1998), "Recoleccion", (Responsable) vector[0]);
		vector[Empleado.getSiguiente()]=new Administrativo("Marta",  new Fecha(18, 05, 1998),  new Fecha(18, 05, 1998), "Recoleccion", (Responsable) vector[0]);
	
	}
}
