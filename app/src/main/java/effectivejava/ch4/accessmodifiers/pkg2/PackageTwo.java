package effectivejava.ch4.accessmodifiers.pkg2;

import effectivejava.ch4.accessmodifiers.pkg1.PackageOne;

public class PackageTwo extends PackageOne {

	void someMethod() {
		
		// Direct invocation of protectedMethod() from a PackageOne instance is not allowed.
		PackageOne p1 = new PackageOne();

	}

	void anotherMethod() {
		// But by extending PackageOne, protectedMethod() becomes accessible via a call to super. This increases
		// the likelihood of a breaking change if protectedMethod() is refactored.
		super.protectedMethod();

	}

	

	
}
