
public class Persona {
	// atributos de clase
	// son privados, para que resulten solo accesibles desde nuestros métodos públicos
	private String name;
	private int age;
	private boolean isAdult;
	private float height;
	
	// método constructor
	Persona(String name, int age, float height) {
		// this hace referencia al propio objeto
		this.name = name;
		this.age = age;
		this.isAdult = age >= 18;
		this.height = height;
	}
	
	// métodos consultores (por convención comienzan con "get")
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public boolean getIsAdult() {
		return this.isAdult;
	}
	public float getHeight() {
		return this.height;
	}
	
	// métodos modificadores (por convención comienzan con "set")
	// indicamos "void" ("vacío"), ya que no esperamos que devulevan nada (no hay return)
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
		this.isAdult = this.age >= 18;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	
	// podemos escoger no definir un método "setIsAdult(...)"
	// para evitar que se pueda "falsear" la comprobación,
	// ya que se podría decir que una persona es "adult" sin tener en cuenta la edad

}
