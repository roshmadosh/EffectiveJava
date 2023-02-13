package com.hiroshisprojects.effectivejava.ch2.static_factory_methods.washeddishes;

/**
 * An example of how to hide the implementation details of an API using a static factory method.
 *
 * printDrawback() is implemented by subtypes of WashDishes (i.e. DishWasher, HandWashedDishes). But instead of 
 * having consumers instantiate these subtypes directly, they simply call the static factory method from this 
 * interface. 
 *
 * This "reduces the conceptual weight" for the user by abstracting away HOW the dishes were washed. As the maintainers 
 * of this API, we assume the consumer merely wants the dishes washed and that they don't care about how it's done.
 *
 */
public interface WashedDishes {
	public void printDrawback();

	public static WashedDishes getInstance() {
		return new DishWasher();
	}
}
