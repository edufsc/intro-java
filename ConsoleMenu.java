import java.util.Scanner;

public class ConsoleMenu {

	public static void main(String[] args) {
		
		// leemo sun número como entero con nextInt() y mostramos la entrada de menú correspondiente
		System.out.print("Introduce un número: ");
		Scanner keyboard = new Scanner(System.in);
		int numero = keyboard.nextInt();
		keyboard.close();
		// solo se han contemplado 3 casos para el ejemplo con if
		if (numero == 1) {
			System.out.println("Gestores");
		} else if (numero == 2) {
			System.out.println("Clientes");
		} else {
			System.out.println("No existe esta opción");
		}
		
		// alternativa con switch

//		switch (numero) {
//		case 1:
//			System.out.println("Gestores");
//			break;
//		case 2:
//			System.out.println("Clientes");
//			break;
//		case 3:
//			System.out.println("Transferencias");
//			break;
//		case 4:
//			System.out.println("Mensajes");
//			break;
//		case 5:
//			System.out.println("Prestamos");
//			break;
//		case 6:
//			System.out.println("Salir");
//			break;
//		default:
//			System.out.println("No existe esta opción");
//		}
	}

}
