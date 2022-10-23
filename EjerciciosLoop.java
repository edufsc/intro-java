import java.util.Scanner;

public class EjerciciosLoop {

	public static void main(String[] args) {

//		tabla de multiplicar del 5

		for (int i = 0; i <= 10; i++) {
			System.out.println("5 x " + i + "= " + 5 * i);
		}

//		tablas de multiplicar del 1 al 9

		for (int i = 1; i <= 9; i++) {
			for (int j = 0; j <= 10; j++) {
				System.out.println(i + " x " + j + "= " + i * j);
			}
			System.out.println("");
		}

//		 sumatorio hasta el 5

		int acumulado = 0;
		for (int i = 5; i >= 1; i--) {
			acumulado = acumulado + i;
//			forma equivalente de hacerlo:
//			acumulado += i;
		}
		System.out.println("El acumulado es " + acumulado);

//		leer un número por teclado y decir si es primo

		System.out.print("Introduce un número: ");
		Scanner keyboard = new Scanner(System.in);
		int n = keyboard.nextInt();
		keyboard.close();

		boolean primo = false;

		for (int j = 2; j <= n; j++) {
			primo = n % j == 0;
		}
		if (primo) {
			System.out.printf("%d es primo", n);
		} else {
			System.out.printf("%d no es primo", n);
		}

	}

}
