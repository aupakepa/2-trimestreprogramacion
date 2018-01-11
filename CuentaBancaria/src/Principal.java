import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int salida = 0, opcion = 0;
		
		Banco cuenta1 = new Banco();
		Banco cuenta2 = new Banco();
		
		while (salida == 0){
			System.out.println("╔════════════════════════════╗");
			System.out.println("║▄▀ ▄▀ ▄▀ ▄▀ MENU ▄▀ ▄▀ ▄▀ ▄▀║");
			System.out.println("║                            ║");
			System.out.println("║ 1. Ingresar en la cuenta 1 ║");
			System.out.println("║ 2. Ingresar en la cuenta 2 ║");
			System.out.println("║ 3.  Retirar en la cuenta 1 ║");
			System.out.println("║ 4.  Retirar en la cuenta 2 ║");
			System.out.println("║                            ║");
			System.out.println("║ 5.   SALIR DEL PROGRAMA    ║");
			System.out.println("║                            ║");
			System.out.println("║▄▀ ▄▀ ▄▀ ▄▀ ▄▀ ▄▀ ▄▀ ▄▀ ▄▀ ▄║");
			System.out.println("╚═══╦════════════════════╦═══╝");
			System.out.println("    ║ Escriba una opcion ║");
			System.out.println("    ╚════════════════════╝");
			System.out.print("               ");
			opcion = teclado.nextInt();
		switch (opcion) {
		case 1:
			System.out.println(cuenta1.ingresar(teclado.nextDouble()));
			break;
		case 2:
			System.out.println(cuenta2.ingresar(teclado.nextDouble()));
			break;
		case 3:
			System.out.println(cuenta1.retirar(teclado.nextDouble()));
			break;
		case 4:
			System.out.println(cuenta2.retirar(teclado.nextDouble()));
			break;
		case 5:
			System.out.println("╔════════════════════════════════╗");
			System.out.println("║ ¡GRACIAS POR USAR EL PROGRAMA! ║");
			System.out.println("╚════════════════════════════════╝");
			salida = 1;
			break;
		default:
			break;
		}
			
		}
	
	}

}
