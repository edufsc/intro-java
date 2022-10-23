import java.util.Scanner;

public class ConsoleMenuLoop {

	public static void main(String[] args) {
		
		// declaramos el Scanner fuera del bucle para reutilizarlo
		Scanner keyboard = new Scanner(System.in);

		// declaramos sin inicializar
		// porque aún no hace falta el valor
		int opcion;
		
		// imprimimos el menú y leemos la opción por teclado
		// al usar do-while el código se ejecuta al menos una vez, aunque la condición no se cumpla
		do {
			System.out.println("1. Gestores");
			System.out.println("2. Clientes");
			System.out.println("6. Salir");
			System.out.print("Selecciona una opción: ");
			// leemos el teclado como número entero
			opcion = keyboard.nextInt();
			if (opcion == 1) {
				System.out.println("Gestores seleccionado");
			} else if (opcion == 2) {
				System.out.println("Clientes seleccionado");
			} else if (opcion == 6) {
				System.out.println("Saliendo...");
			} else {
				System.out.println("No existe esta opción...");
			}
		} while (opcion != 6);
		// cerramos el teclado fuera del bucle, sabiendo que ya no lo necesitaremos
		keyboard.close();
	}

}
