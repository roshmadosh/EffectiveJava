package effectivejava.ch2.singleton;


public enum SlimShadyEnum {
	INSTANCE;

	private transient final String lyric = "My tea's gone cold I wondered why I";

	public String getLyric() { return lyric; }

}
