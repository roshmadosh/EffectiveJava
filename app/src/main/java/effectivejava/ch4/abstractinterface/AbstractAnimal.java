package effectivejava.ch4.abstractinterface;


/* 
 * An example of a skeleton implementatinon class for overriding methods that either
 *	1. Apply to most, but not all Animal implementations 
 *	2. Primitive methods that cannot be given a skeletal (i.e. default) implementation in the interface
 *
 *	Subclasses will be required to implement the speak() method.
*/
public abstract class AbstractAnimal implements Animal {

	@Override
	public void walk() {
		System.out.println("Most animals will probably walk with four legs.");
	}

	// note that I don't have to provide implementations for every method in Animal
	

	// an example of a method that cannot be given a skeletal implementation in Animal.java
	@Override 
	public String toString() {
		return "I am an Animalll";
	}

}
