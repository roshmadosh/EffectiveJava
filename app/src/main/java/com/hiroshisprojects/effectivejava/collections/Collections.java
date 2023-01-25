package com.hiroshisprojects.effectivejava.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

/* Interfaces couldn't have static methods prior to Java 8. If they could, the Collection interface would 
 * have had both 
 *
 * (1) the methods they want Collection-type classes to have and 
 * (2) static methods that either took Collection-types as input (e.g. sort) or returned Collection-types 
 * as output (e.g. Collections.emptySet()).
 * 
 * Instead, they had to create "companion classes" with private construtors that held these static methods.
 * java.util.Collections is as an example of such a class.
 * */
public class Collections {

	public static void main(String[] args) {

		/* A polymorphic Collection variable. */
		Collection<Integer> collection;	

		if (args[0] == "foo") {
			collection = new ArrayList<>(Arrays.asList(1,3,2));
		} else {
			collection = new HashSet<>(Arrays.asList(1,3,2));
		}	
		
		/* Invoking a j.u.Collection interface method. */
		collection.add(4);

		/* Invoking a static j.u.Collections method. Similar to Python's built-in max() function. */
		int maxVal = java.util.Collections.max(collection);
	
		System.out.println("Type: " + collection.getClass().toString());
		System.out.println("Collection: " + collection.toString());
		System.out.println("Collections max() val: " + maxVal);

	}
}
