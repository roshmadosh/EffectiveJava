package com.hiroshisprojects.effectivejava.ch2.static_factory_methods.washeddishes;

/**
 * An implementation of WashedDishes that's hidden from the consumer due to package-protected access modifier.
 */
class DishWasher implements WashedDishes {

	@Override
	public void printDrawback() {
		System.out.println("Takes longer, smells funny.");		
	}

}
