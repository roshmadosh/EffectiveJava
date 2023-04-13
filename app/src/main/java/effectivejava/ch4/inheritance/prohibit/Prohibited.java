package effectivejava.ch4.inheritance.prohibit;

/**
 * An example of making a class "effectively" final (i.e. without using the final keyword)
 */
public class Prohibited {
	private final String name;

	// private constructor
	private Prohibited() {
		name = "Blake and Drake";
	}

	public void printName() {
		System.out.println("My name is " + name);
	}

	// We can still use subclasses internally. Notice that we could have just made the change directly instead of a method override, 
	// but that would require deleting the line `System.out.println("My name is " + name)` and replacing it when we may want to keep
	// the replaced implementation just in case.
	private class SubProhibited extends Prohibited {

		@Override
		public void printName() {
			System.out.println("Actually, my name is Drake and Blake");
		}	
	
	}


	// Using a static factory method so that we have the freedom to modify the instantiation logic without causing breaking changes.
	public static Prohibited create() {
		Prohibited prohibited = new Prohibited();

		return prohibited.new SubProhibited();
	}
}

