import java.util.Arrays;
import utilidades.Fecha;
import utilidades.Leer;

/**
 * 3) Crea el proyecto LibroUnAutor, que estará formado por las siguientes
 * clases: Autor -nombre: String (no tiene valor por defecto) -email: String (no
 * tiene valor por defecto) -sexo: char (los posibles valores son ‘m’ o ‘f’)
 * -fechaNacimiento: Fecha +Autor(nombre: String, email: String, genero: String)
 * +getNombre(): String +getEmail: String +setEmail(email: String): void
 * +getSexo(): char +toString(): String
 * 
 * El método toString devolverá la siguiente cadena de caracteres (por ejemplo):
 * "Autor[nombre = Arturo Perez Reverte, email = apreverte@correo.com, sexo = m,
 * fechaNacimiento = 16-03-1954]"
 * 
 * Libro -titulo: String (no tiene valor por defecto) -autor: Autor -precio:
 * Double -cantidad: Integer = 0 +Libro(String titulo, Autor autor, Double
 * precio) +Libro(String titulo, Autor autor, Double precio, Integer cantidad)
 * +getTitulo(): String +getAutor: Autor +getPrecio(): Double +setPrecio
 * (precio: double): void +getCantidad(): Integer +setCantidad(cantidad: int):
 * void +toString(): String
 * 
 * Supondremos que un libro sólo tiene un autor y que el método toString
 * devolverá una cadena de caracteres como la siguiente (por ejemplo): “Libro
 * [titulo = El asedio, Autor [nombre = Arturo Perez Reverte, email =
 * apreverte@correo.com, sexo = m, fechaNacimiento = 16-03-1954] precio = 18,90
 * cantidad = 3]” Escribe la clase TestLibroAutor, que además del método main
 * deberá tener otros métodos estáticos para que al ejecutar la aplicación
 * muestre un menú con las siguientes opciones: 1- Crear libros. (Esta opción
 * preguntará al usuario cuántos libros quiere crear y a continuación procederá
 * a instanciarlos) 2- Modificar autor. 3- Modificar libro. 4- Listado de
 * libros. 5- Listado de autores. 0- Salir.
 * 
 * 4) Crea un nuevo proyecto, al que llamarás LibroVariosAutores que utilice las
 * clases del ejercicio anterior y modifica la clase Libro para que un libro
 * pueda tener varios autores. El método toString debe devolver, por ejemplo:
 * “Libro [titulo = Cuentan que cuentan { Autor [nombre = Silvia Schujer, email
 * = schujer@correo.com, genero = f, fechaNacimiento = 16-03-1954 ], [Laura
 * Devetach, ldevet@edu.com, genero = f, fechaNacimiento = 16-03-1954], [Emma
 * Wolf, wolf@correo.com , genero = f, fechaNacimiento = 16-03-1954]} precio =
 * 14 cantidad = 6]”
 * 
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libro libros[] = new Libro[10];
		Autor autores[] = new Autor[10];
		int menu = -1;
		do {
			System.out.println("1- Crear libros.");
			
			System.out.println("2- Modificar libro");
			System.out.println("3- Modificar autor");
			System.out.println("4- Listado de libros");
			System.out.println("5- Listado de autores");
			System.out.println("6- Crear Varios Libros y Autores");
			System.out.println("7- Introducir Autor");
			System.out.println("0- Salir");
			menu = Leer.pedirEntero("introduzca una opcion de menu");
			switch (menu) {
			case 1://1- Crear libros.
				int numero = Leer.pedirEntero("Cuantos libros quieres crear");
				for (int i = 0; i <= libros.length && numero != 0; i++) {
					if (libros[i] == null && i == libros.length - 1) {
						libros = Arrays.copyOf(libros, libros.length + 10);
					} else if (libros[i] == null) {
						libros = introducirLibros(autores,libros);
						numero--;
					}
				}
				break;
			case 2://2- Modificar libro
				do {
					Leer.mostrarEnPantalla("1.buscar Libro");
					Leer.mostrarEnPantalla("10. Salir");
					menu=Leer.pedirEntero("introduzca opcion 1 o 10");
					switch (menu) {
					case 1:
						buscarlibro(autores,libros);
						break;
					case 10:
						Leer.mostrarEnPantalla("Fin de la busqueda");
					default:
						break;
					}
					
				} while (menu!=10);
				
				break;
			case 3://3- Modificar autor
				
				break;
			case 4://4- Listado de libros
					Leer.mostrarEnPantalla(Arrays.toString(libros));
				break;
			case 5://5- Listado de autores
				Leer.mostrarEnPantalla(Arrays.toString(autores));
				break;
			case 6://6- Crear Varios Libros y Autores"
				for (int i = 0; i<autores.length ; i++) {
					if (autores[i] != null && i > autores.length/2) {
						autores = Arrays.copyOf(autores,autores.length+10);
					}
				}
				for (int i = 0; i < libros.length ; i++) {
					if (libros[i] != null && i > libros.length/2) {
						libros = Arrays.copyOf(libros,libros.length+10);
					}
				}
				variosAutores(autores);
				variosLibros(autores, libros);
				break;
			case 0://salir

				break;
			case 7://"7- Introducir Autor"
				 introducirAutor(autores);
				
				break;

			default:
				break;
			}
		} while (menu != 0);

	}

	public static void buscarlibro(Autor autores[], Libro[] libros) {
		String cadena = Leer.pedirCadena("Busca un libro");
		for (int i = 0; (i < libros.length) && (libros[i] != null); i++) {
			if (libros[i].getTitulo().indexOf(cadena) != -1) {
			Leer.mostrarEnPantalla("hemos encontrado tu libro");
			Leer.mostrarEnPantalla(i+libros[i].toString());
			Leer.mostrarEnPantalla("modifica el libro");
			libros = introducirLibros(autores,libros);
			Leer.mostrarEnPantalla(i+libros[i].toString());
			}
		}
	}

	/**
	 * @param autor
	 * @param libros
	 */
	public static Libro[] introducirLibros(Autor autores [],Libro libros[]) {
		String titulo;
		int idlibro;
		int numero;
		titulo = Leer.pedirCadena("introduce el titulo");
		numero = Leer.pedirEntero("cuantos autores tiene el libro");
		Autor autor[] = new Autor[numero];
		for (int i = 0; i < Autor.getSiguiente()-1; i++) {
				System.out.print(i+".-"+autores[i].getNombre());
		}
		
		for (int i = 0; i < numero; i++) {
			idlibro=Leer.pedirEntero("introduce el Id del autor");
			autor[i] = autores[idlibro];
		}
		libros[Libro.getContador()]=new Libro(titulo, autor);
			return libros;
	}
	public static Autor[] introducirAutor (Autor autor[]){
		String nombre;
		String email;
		char sexo;
		Fecha fechaNacimiento;
		boolean resultado = false;
		for (int i = 0; (resultado==true || i < autor.length ); i++) {
			if (autor[i]==null) {
				nombre = Leer.pedirCadena("Introduce el nombre del autor");
				email = Leer.pedirCadena("email");
				sexo = Leer.pedirCadena("introduce F o M").charAt(0);
				fechaNacimiento = IntroducirFecha();
				autor[i]= new Autor(nombre, email, sexo, fechaNacimiento);
				resultado = true;
			}
		}
		return autor;
	}
	/**
	 * @param autor
	 * @param numeroAutores
	 */
	/**public static Autor[] IntroducirAutores() {
		String nombre;
		String email;
		char sexo;
		Fecha fechaNacimiento;
		Autor autor[] = new Autor[5];
		int numeroAutores = Leer.pedirEntero("introduce numero de autores");
		for (int j = 0; j < numeroAutores; j++) {
			nombre = Leer.pedirCadena("Introduce el nombre del autor");
			email = Leer.pedirCadena("email");
			sexo = Leer.pedirCadena("introduce F o M").charAt(0);
			fechaNacimiento = IntroducirFecha();
			autor[j] = new Autor(nombre, email, sexo, fechaNacimiento);
		}
		return autor;
	}*/

	/**
	 * @return
	 */
	public static Fecha IntroducirFecha() {
		Fecha fechaNacimiento;
		int dia = Leer.pedirEntero("dia");
		int mes = Leer.pedirEntero("mes");
		int ano = Leer.pedirEntero("año");
		fechaNacimiento = new Fecha(dia, mes, ano);
		return fechaNacimiento;
	}

	public static Autor[] variosAutores(Autor autor[]) {	
		
		autor[Autor.getSiguiente()] = new Autor("Millan kundera", "milan@fontecabras.es", 'M', new Fecha(24,7,1977));
		autor[Autor.getSiguiente()] = new Autor("J.R.R Tolkien", "JRR@fontecabras.es", 'F', new Fecha(23,8,1973) );
		autor[Autor.getSiguiente()] = new Autor("Patrick Süskind", "patrick@fontecabras.es", 'M', new Fecha(24,1,1987));
		autor[Autor.getSiguiente()] = new Autor("Ken Follett", "patrick@fontecabras.es", 'M', new Fecha(01,3,1957));
		autor[Autor.getSiguiente()] = new Autor("Irvine Welsh", "patrick@fontecabras.es", 'M', new Fecha(29,2,1965));


		return autor;
	}

	public static Libro[] variosLibros(Autor autor [], Libro libros[]) {
		libros[Libro.getContador()] = new Libro("La insoportable levedad del ser", 20, autor [0]);
		libros[Libro.getContador()] = new Libro("El señor de los anillos", 20, autor[1]);
		libros[Libro.getContador()] = new Libro("El perfume", 20, autor[2]);
		libros[Libro.getContador()] = new Libro("Trainspotting", 20, autor[4]);
		libros[Libro.getContador()] = new Libro("El tercer gemelo", 20, autor[3]);
		libros[Libro.getContador()] = new Libro("Los Pilares de la tierra", 20, autor[3]);
		libros[Libro.getContador()] = new Libro("En la boca del dragón", 20, autor[3]);
		

		return libros;
	}

}