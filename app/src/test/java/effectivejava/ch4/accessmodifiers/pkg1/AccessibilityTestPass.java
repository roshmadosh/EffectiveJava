package effectivejava.ch4.accessmodifiers.pkg1;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import effectivejava.ch4.accessmodifiers.pkg1.PackageOne;

public class AccessibilityTestPass {

	@Test
	@DisplayName("Default method is accessible from a test suite with the same package path.")
	public void invokeDefaultMethod() {

		PackageOne sut = new PackageOne();

		// the point here is that invoking defaultMethod() is not a compilation error.
		assertNotNull(sut.defaultMethod());

	}

}
