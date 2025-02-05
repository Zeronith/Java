package testing;

// Grandparent = Organism
// Parent = Plant , Animal
// Child = Cat , Dog

public class Inheritance {

	public static void main(String[] args) {
		// Inheritance = One class inherits the attributes and methods
		//				 from another class.
		//				 Child <- Parent <- Grandparent
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		System.out.println(dog.isAlive);
		System.out.println(cat.isAlive);
		
		dog.eat();
		cat.eat();
		
		System.out.println(dog.lives);
		System.out.println(cat.lives);
		
		Plant plant = new Plant();
			
		plant.photosynthesis();
	}

}
