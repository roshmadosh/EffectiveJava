# Chapter 2: Creating or Destroying Objects 


## Table of Contents
1. [Static Factory Methods](#static-factory-methods)

### Static Factory Methods

**Example 1: Washed Dishes**
Say a consumer of our API wanted some clean dishes. We have two ways of washing dishes: hand-washing them 
or using a dishwasher. But unlike in the case of something like `List<> list = new ArrayList<>()`, the 
implementation of our `WashedDishes` interface does not matter to the consumer. Thus we want to essentially
"hide" the implemenation classes `HandWashedDishes` and `DishWasher` from the API consumers.  

We achieve this by using a static factory method in our `WashedDishes` interface. See the package for details.  



