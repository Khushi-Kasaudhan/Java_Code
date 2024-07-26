package OopsConcept;

class Animal{
	String name;
	Animal(String name){
		this.name = name;
	}
}

public class Inheritance extends Animal{
	String breed;
	Inheritance(String name, String breed){
		super(name);
		this.breed = breed;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Inheritance obj = new Inheritance("Max", "Labrador");
		System.out.println("Name: "+ obj.name);
		System.out.println("Breed: "+ obj.breed);
	}

}
