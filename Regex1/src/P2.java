import utilidades.Leer;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     String str = "esto es un ejemplo de como funciona split";
	     Integer var=null;
	     String regex;
	     regex=Leer.pedirCadena("Expresi�n regular", null);
	     if(regex.equals("")){
	    	 regex=null;
	     }
	     var=Leer.pedirEntero("Pedir un entero", regex);
	     Leer.mostrarEnPantalla("El dato "+var);

	}

}
