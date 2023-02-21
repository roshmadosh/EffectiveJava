package effectivejava.ch3;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import effectivejava.ch3.equals_override.Point;

public class EquivalenceTests {


	@Test
	@DisplayName("Equals implementation is reflexive.")
	public void reflexive() {
		Point point = new Point(1,2);

		assertTrue(point.equals(point));
	}

	@Test
	@DisplayName("Equals implementation is symmetric.")
	public void symmetric() {
		Point pointA = new Point(1,2);
		Point pointB = new Point(1,2);

		assertAll(() -> {
			assertTrue(pointA.equals(pointB));
			assertTrue(pointB.equals(pointA));
		});
	}

	@Test
	@DisplayName("Equals implementation is transitive.")
	public void transitive() {
		Point pointA = new Point(1,2);
		Point pointB = new Point(1,2);
		Point pointC = new Point(1,2);

		assertAll(() -> {
			assertTrue(pointA.equals(pointB));
			assertTrue(pointB.equals(pointC));
			assertTrue(pointA.equals(pointC));
		});
	}

	@RepeatedTest(value = 5)
	@DisplayName("Equals implementation is consistent.")
	public void consistent() {
		Point pointA = new Point(1,2);
		Point pointB = new Point(1,2);

		assertTrue(pointA.equals(pointB));
	}

	@Test
	@DisplayName("Equals implementation is non-null")
	public void nonnull() {
		Point point = new Point(1,2);

		assertFalse(point.equals(null));
	}
}
