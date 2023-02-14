# Chapter 2: Creating or Destroying Objects 


## Table of Contents
1. [Static Factory Methods](#static-factory-methods)
2. [Builder Pattern](#builder-pattern)
### Static Factory Methods

**Example 1: Washed Dishes**  
Say a consumer of our API wanted some clean dishes. We have two ways of washing dishes: hand-washing them 
or using a dishwasher. But unlike in the case of something like `List<> list = new ArrayList<>()`, the 
implementation of our `WashedDishes` interface does not matter to the consumer. Thus we want to essentially
"hide" the implemenation classes `HandWashedDishes` and `DishWasher` from the API consumers.  

We achieve this by using a static factory method in our `WashedDishes` interface. By having the implementation 
classes package-protected (i.e. the default access modifier), the consumer of our API can use the static factory 
method to get a `WashedDishes` instance with an underlying implementation _without_ knowing which implementation 
class the static factory method returns.  

See `static_factory_methods` package for code.  

### Builder Pattern  

**WHEN**: Use instead of a constructor or static factory if you have many (~4+) parameters, or parameters of the same type.  

**PROS**: 
1. More readable and writeable than using overloaded constructors. 
2. Safer than using the bean strategy, where you call a default constructor and set the properties by calling setters.  

**CONS**:
1. You create an additiona Builder object to create an object. Can be problematic for performance-critical use-cases.
2. More verbose than a constructor for the consumers of the API.




