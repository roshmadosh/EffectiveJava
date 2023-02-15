package effectivejava.ch2.singleton;

import java.io.Serializable;

public class SlimShady implements Serializable {

	private transient final static SlimShady INSTANCE = new SlimShady();
	private transient String lyric;

	private SlimShady() {
		lyric = "just lose it, A A A A A";
	}

	public static SlimShady getSlimShady() { return INSTANCE; }

	/* Replaces the object read from a deserialization, which because of the transient properties would normally return null, with the singleton instance. This preserves its state and prevents us from having to reinstantiate a deserialized singleton. */
	private Object readResolve() {
		return INSTANCE;
	}
	
	public String getLyric() {
		return lyric;
	}
}
