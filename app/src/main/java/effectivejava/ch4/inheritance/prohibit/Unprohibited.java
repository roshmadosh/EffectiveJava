package effectivejava.ch4.inheritance.prohibit;

/**
 * An example of how overrideable methods can "safely" be used internally.
 */
public class Unprohibited {
	private final String MESSAGE = "This is safe";

	public String overrideable() {
		return innerOverrideable();
	}

	public final void dependant() {
		// bad practice of invoking an overrideable method in another method
		// String val = return overrideable();

		// "safely" invokeing an "overrideable" method
		String val = innerOverrideable();

		if (!val.equals(MESSAGE)) {
			throw new RuntimeException("Override led to breaking change.");
		}

		System.out.println("Successful print message.");

	}

	// for internal use, as it can't be overriden
	private String innerOverrideable() {
		return MESSAGE;
	}

}
