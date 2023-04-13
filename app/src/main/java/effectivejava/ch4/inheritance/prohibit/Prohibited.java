package effectivejava.ch4.inheritance.prohibit;

/**
 * An example of making a class "effectively" final (i.e. without using the final keyword)
 */
public class Prohibited {
	private final String name;
	private Prohibited() {
		name = "Blake and Drake";
	}

	// We can still use subclasses internally
	private class SubProhibited extends Prohibited {

		@Override
		public void printName() {
			System.out.println("Actually, my name is Drake and Blake");
		}	
	
	}

	public void printName() {
		System.out.println("My name is " + name);
	}

	// Using a static factory method so that we can still leverage inheritance internally while prohibiting it externally.
	public static Prohibited create() {
		Prohibited prohibited = new Prohibited();

		return prohibited.new SubProhibited();
	}
}

