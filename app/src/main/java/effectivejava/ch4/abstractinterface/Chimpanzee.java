package effectivejava.ch4.abstractinterface;


// With abstract interfaces, implementing classes have the option to extend the abstract class (which will usually provide more default
// implementation), or to implement the Animal interface directly if it wants to provide a unique implementation for the non-primitive
// methods (in this case, walk()).
public class Chimpanzee implements Animal {

	@Override
	public void walk() {
		System.out.println("I walk on two feets");
	}

	@Override
	public void speak() {
		System.out.println("Eeep");
	}

	// Note that the overriden toString method is not inherited this class because it doesn't extend AbstractAnimal 

}
