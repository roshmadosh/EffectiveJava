package effectivejava.ch2.resources_vs_finally;

/**
 *	Item 9: An example that shows one reason why try-with-resources is preferred over try-with-finally.
 *
 *	An exception thrown from a finally block can "overshadow" one thrown from within the try-block. This can be problematic if the cause of this outer exception was a result of the inner exception being thrown, and the underlying cause won't be diagnosable. 
 */
public class MyCloseable implements AutoCloseable {

	@Override
	public void close() throws RuntimeException {
		throw new OuterRuntimeException();
	}

}

class OuterRuntimeException extends RuntimeException {}
