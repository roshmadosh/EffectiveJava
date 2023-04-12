package effectivejava.ch4.inheritance;

import java.util.Collection;
import java.util.HashSet;

/**
 * An example of what you should NOT do
 */
public class BadCountedHashSet<E> extends HashSet<E> {
	private int addCount;	

	@Override
	public boolean add(E e) {
		addCount++;
		return super.add(e);
	}

	// This won't behave as expected. The add counts will be double-counted because super.addAll uses super.add as part of its impl, and
	// the add() method that gets invoked is the overridden one. 
	@Override
	public boolean addAll(Collection<? extends E> c) {
		addCount += c.size();
		return super.addAll(c);
	}

	public int getAddCount() {
		return addCount;
	}
}


