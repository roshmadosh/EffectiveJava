package effectivejava.ch2.singleton;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

	
public class SlimShadyTest {

	private static final String FILENAME = "./slimshady.ser";
	private static final String FILENAME_ENUM = "./slimshady-enum.ser";

	@Test
	@DisplayName("Static factory singleton preserves state upon deserialization.")
	public void staticFactory() {

		SlimShady shady = SlimShady.getSlimShady();
		SlimShady revived;
		String expected = "just lose it, A A A A A";

		try (FileOutputStream fos = new FileOutputStream(FILENAME);) {
			ObjectOutputStream out = new ObjectOutputStream(fos);
			out.writeObject(shady);
			out.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
		try (FileInputStream fis = new FileInputStream(FILENAME);) {
			ObjectInputStream in = new ObjectInputStream(fis);
			revived = (SlimShady) in.readObject();

			assertEquals(expected, revived.getLyric());
			in.close();

		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
	}

	@Test
	@DisplayName("Enum singleton preserves state upon deserialization.")
	public void enumSingleton() {

		SlimShadyEnum shady = SlimShadyEnum.INSTANCE;	
		SlimShadyEnum revived;
		String expected = "My tea's gone cold I wondered why I";

		try (FileOutputStream fos = new FileOutputStream(FILENAME_ENUM);) {
			ObjectOutputStream out = new ObjectOutputStream(fos);
			out.writeObject(shady);
			out.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
		try (FileInputStream fis = new FileInputStream(FILENAME_ENUM);) {
			ObjectInputStream in = new ObjectInputStream(fis);
			revived = (SlimShadyEnum) in.readObject();

			assertEquals(expected, revived.getLyric());
			in.close();

		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
	}

}
