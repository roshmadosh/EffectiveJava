package effectivejava.ch4.abstractinterface;

public interface Animal {

	// these are examples of non-primitive methods, since they may have varying implementations among implementors
	void walk();

	void speak();

	// this is an example of a primitive method in which every class using this interface is expected to have the same logic.
	// this does NOT include methods that cannot be given default implementations (e.g. because they belong to another class, like Object)
	default void breath() {
		System.out.println("Inhale through the nose, exhale through the mouth");
	}

}
