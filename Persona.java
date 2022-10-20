
public class Persona {
	// atributos de clase
	// son privados, para que resulten solo accesibles desde nuestros m�todos p�blicos
	private String name;
	private int age;
	private boolean isAdult;
	private float height;
	
	// m�todo constructor
	Persona(String name, int age, float height) {
		// this hace referencia al propio objeto
		this.name = name;
		this.age = age;
		this.isAdult = age >= 18;
		this.height = height;
	}
	
	// m�todos consultores (por convenci�n comienzan con "get")
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
	
	// m�todos modificadores (por convenci�n comienzan con "set")
	// indicamos "void" ("vac�o"), ya que no esperamos que devulevan nada (no hay return)
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
	
	// podemos escoger no definir un m�todo "setIsAdult(...)"
	// para evitar que se pueda "falsear" la comprobaci�n,
	// ya que se podr�a decir que una persona es "adult" sin tener en cuenta la edad

}
