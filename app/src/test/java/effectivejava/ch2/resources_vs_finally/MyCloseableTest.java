package effectivejava.ch2.resources_vs_finally;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MyCloseableTest {

	@Test()
	@DisplayName("try-with-finally 'hides' InnerRuntimeException") 
	public void finallyExample() {
		MyCloseable closeable = new MyCloseable();
		assertThrows(OuterRuntimeException.class, () -> {
			try {
				throw new InnerRuntimeException();
			} finally {
				closeable.close();
			}
		});
	}

	@Test
	@DisplayName("try-with-resources 'shows' InnerRuntimeException")
	public void resourcesExample() {
		assertThrows(InnerRuntimeException.class, () -> {
			try (MyCloseable closeable = new MyCloseable()){
				throw new InnerRuntimeException();
			}
		});
	}
	
}

class InnerRuntimeException extends RuntimeException {}
