package effectivejava.ch4;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import effectivejava.ch4.accessmodifiers.pkg1.PackageOne;

public class AccessibilityTestFail {

	@Test
	@DisplayName("Default method is inaccessible from a test suite with a different package path.")
	public void invokeDefaultMethod() {

		// Since test class' package structure is slightly different, PackageOne's package-private methods are inaccessible.
		PackageOne sut = new PackageOne();

		assertTrue(true);
	
	}

}
