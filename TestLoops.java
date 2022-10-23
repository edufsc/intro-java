
public class TestLoops {

	public static void main(String[] args) {
		
		System.out.println("While de 1 al 10");
		
		int contador = 0;

		while (contador < 10) {
			contador++;
			System.out.println(contador);
		}
		
		System.out.println("While de 10 al 1");
		
		// al acabar el bucle anterior
		// contador = 10;
		while (contador > 0) {
			System.out.println(contador);
			contador--;
		}

		// al acabar el bucle anterior
		// contador = 0;
		System.out.println("Do while");
		
		// con do while, el código se ejecuta al menos una vez,
		// aunque la condición no se cumpla
		do {
			contador++;
			System.out.println(contador);
		} while (contador > 1);
		
		System.out.println("Do while edad");
		
		// el código se ejecuta una vez, aunque la edad no es menor que 18
		int edad = 25;
	
		do {
			System.out.println("Edad: " + edad);
			edad++;
		} while (edad < 18);
		
		

	}

}
