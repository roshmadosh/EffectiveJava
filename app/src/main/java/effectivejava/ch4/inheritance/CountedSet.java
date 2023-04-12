package effectivejava.ch4.inheritance;

import java.util.Collection;
import java.util.Set;

/**
 * An example of using composition instead of inheritance to correctly implement a counted set.
 */
public class CountedSet<E> extends ForwardingSet<E> {
	private int addCount;
	public CountedSet(Set<E> set) {
		super(set);
	}

	@Override
	public boolean add(E e) {
		addCount++;
		return super.add(e);
	}

	// This implementation gives us 
	//		1. no double-counting because super.addAll() is merely a forwarded method (i.e. the overridden add() method 
	//		isn't unintentionally invoked) and
	//		2. decoupling of this class to the the underlying Set implementation and
	//		3. new methods from subsequent releases of java.util.Set won't be implictly inherited by our custom class, so an "illegal" 
	//		uncounted addition isn't possible (e.g. from a new method named, say, push()).
	@Override
	public boolean addAll(Collection<? extends E> c) {
		addCount += c.size(); 	
		return super.addAll(c);
	}


	public int getAddCount() {
		return addCount;
	}

}
