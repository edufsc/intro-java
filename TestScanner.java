// importamos la clase Scanner
import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {
		
		// inicializamos un Scanner pasando la entrada est�ndar (System.in)
		// como par�metro para acceder al teclado
		Scanner keyboard = new Scanner(System.in);
		
		// si usamos print en lugar de println, el cursor para escribir
		// aparece en la misma l�nea del mensaje
		System.out.print("Introduce un n�mero: ");
		
		// leemos el texto introducido por teclado como n�mero entero y lo guardamos en numero
		int numero = keyboard.nextInt();
		
		System.out.println("Has introducido: " + numero);
		
		System.out.print("Introduce una frase: ");
		
		// para leer como String utilizamos nextLine()
		String linea = keyboard.nextLine();
		
		keyboard.close();
		
		System.out.println("Has introducido: " + linea);
	}

}
