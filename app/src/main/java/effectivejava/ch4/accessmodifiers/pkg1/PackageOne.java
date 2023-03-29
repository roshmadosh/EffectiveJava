package effectivejava.ch4.accessmodifiers.pkg1;

public class PackageOne {

	String defaultMethod() {
		return "This is my package-protected method for Package One";
	}

	protected String protectedMethod() {
		return "This is my protected method for Package One";
	}

}
