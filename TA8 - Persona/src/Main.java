class Persona {
	//Atributos clase Persona
	private String nombre = "No insertado";
	private int edad = 0;
	private String DNI = "No insertado";
	private char sexo;
	final static char sexoDefecto = 'H';
	private double peso = 0;
	private double altura = 0;
	
	//Constructor por defecto
	Persona() {
	}
	
	//Constructor con el nombre, la edad y el sexo
	Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = comprobarSexo(sexo);
	}
	
	//Constructor con todos los atributos
	Persona(String nombre, int edad, String DNI, char sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.DNI = DNI;
		this.sexo = comprobarSexo(sexo);
		this.peso = peso;
		this.altura = altura;
	}
	
	//Método para comprobar si el sexo es correcto
	public char comprobarSexo(char sexo) {
		
		if(sexo == 'H' || sexo == 'M') {
			this.sexo = sexo;
		} else {
			this.sexo = 'N';
		}
		
		return this.sexo;
	}
	
	//Sobreescribimos método toString
	@Override
	public String toString() {
		return "Nombre: " + nombre +
				"\nEdad: " + edad +
				"\nDNI: " + DNI +
				"\nSexo: " + sexo +
				"\nPeso: " + peso +
				"\nAltura: " + altura;
	}
}

public class Main {

	public static void main(String[] args) {
		
		//Objeto persona1 con todos los atributos
		Persona persona1 = new Persona("Marc", 19, "41029224-F", 'H', 45, 1.60);
		
		System.out.println("Persona 1");
		System.out.println("----------------------------");
		System.out.println(persona1);
		
		System.out.println();
		
		//Objeto persona2 con 3 atributos
		Persona persona2 = new Persona("Marc", 19, 'K');
		
		System.out.println("Persona 2");
		System.out.println("----------------------------");
		System.out.println(persona2);
		
	}
}
