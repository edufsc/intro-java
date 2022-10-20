
public class Main {
	
	// el método main inicia la ejecución de código
	public static void main(String[] args) {

		// creamos una instancia (u objeto) de la clase Persona usando el constructor
		Persona p1 = new Persona("Julia", 21, 1.6f);

		// solo podemos consultar los atributos privados a través
		// de los métodos consultores (o "getters") públicos
		System.out.println("Nombre: " + p1.getName());
		System.out.println("Edad: " + p1.getAge());
		System.out.println("Es adulta: " + p1.getIsAdult());

		// solo podemos modificar los atributos privados a través
		// de los métodos modificadores (o "setters") públicos
		p1.setAge(16);

		System.out.println("Edad: " + p1.getAge());
		System.out.println("Es adulta: " + p1.getIsAdult());
		System.out.println("Altura: " + p1.getHeight());
	}

}
