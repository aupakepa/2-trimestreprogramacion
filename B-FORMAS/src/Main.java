import utilidades.Leer;

/**
 * B.- Ejercicio de Herencia y Polimorfismo: FORMAS 
 * 
 * 1. Defina una clase Forma
 * que tenga los siguientes miembros de datos: - Color - Coordenada del centro
 * de la forma (objeto Punto) - Nombre de la forma (char *) Y, al menos, las
 * siguientes funciones miembro: - Imprimir - Obtener y cambiar el color - Mover
 * la forma (o sea, su centro) Defina una clase derivada Rectangulo que tenga
 * los siguientes miembros como datos: - Lado menor. - Lado mayor. Y, al menos,
 * las siguientes funciones miembro: - Imprimir. Debe imprimir qué se trata de
 * un rectángulo mostrando su nombre, color, centro y lado. Debería usarse la
 * función Imprimir de la clase base para realizar parte de este trabajo. -
 * Calcular el área (lado menor * lado mayor). - Calcular el perímetro. (2 *
 * lado menor + 2 * lado mayor). - Cambiar el tamaño del rectángulo. Recibe como
 * parámetro un factor de escala. Así, por ejemplo, si el factor vale 2, el
 * rectángulo duplicará su tamaño y si es 0,5 se reducirá a la mitad. Realice un
 * programa que pruebe el funcionamiento de estas clases. Debe crear objetos y
 * comprobar el correcto funcionamiento de las funciones miembro. 
 * 
 * 2. Defina una clase Elipse derivada de forma. Recordatorio: una elipse queda definida por
 * su radio mayor (R) y su radio menor (r), tal que el área de una elipse es
 * igual a π*(R*r). 
 * 
 * 3. Defina una clase Cuadrado derivada de la clase Rectangulo. 
 * 
 * 4. Defina una clase Circulo derivada de la clase Elipse.
 *  
 * 5. Realice un programa que defina varias formas diferentes, cree un vector de
 * punteros de la clase Forma que apunten a los objetos creados. El programa
 * debe realizar un bucle que recorra todas las formas, las ponga todas del
 * mismo color y las mueva a una determinada posición. 
 * 
 * 6. Analice qué ocurre en  el ejercicio anterior si se intenta imprimir la información de cada forma y
 * qué sucede si se intenta obtener en ese bucle el área de todas las formas del
 * vector. 
 * 
 * 7. Utilice la técnica de las funciones virtuales para arreglar los
 * comportamientos anómalos detectados en el ejercicio anterior. 
 * 
 * 8. Desarrolle un programa que, dado un conjunto de formas, calcule cuál tiene el área
 * máxima e imprima la información de dicha forma. 9. ¿Cómo haría para obligar
 * que todas las clases futuras derivadas tengan al menos los métodos “área” y
 * “perímetro”. ¿Tiene sentido incluir definir dichos métodos en la clase
 * “forma”? 10. Haga un diagrama de clases que refleja la estructura definida
 * hasta el momento. Añádale las clases: Punto, Línea, Triángulo, Triángulo
 * Rectángulo y Polígono. ¿Dónde irían? ¿Cuáles serían sus atributos y
 * propiedades? (No los implemente)
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Forma vector[] = new Forma[10];
		double coordenada[]={0,0};
		int menu = -1;
		vector[0] = new Rectangulo(double centro [] = {0,0}, nombre, color, mayor, menor);
		do {
			Leer.mostrarEnPantalla("1.Crear una Elipse");
			Leer.mostrarEnPantalla("2.Crear un Rectangulo");
			Leer.mostrarEnPantalla("3.Crear un Cuadrado");
			Leer.mostrarEnPantalla("4.Crear un circulo");
			Leer.mostrarEnPantalla("5.visualizar Vector");
			Leer.mostrarEnPantalla("6.Cambiar color de todos las formas");
			Leer.mostrarEnPantalla("7.Cambiar Centro de todas las formas");
			Leer.mostrarEnPantalla("8.Introducir una forma");
			menu = Leer.pedirEntero("introduczca una opcion de menu");
		} while (menu != 0);
	}

}
