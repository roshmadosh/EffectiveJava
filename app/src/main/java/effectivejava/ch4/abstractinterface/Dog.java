package effectivejava.ch4.abstractinterface;


// Any class that extends AbstractAnimal is provided a default implementation for walk() and toString() from AbstractAnimal, 
// as well as for breathe() from Animal.
public class Dog extends AbstractAnimal {

	@Override
	public void speak() {
		System.out.println("Woof");
	}

}
