# Why you should usually do composition instead of inheritance (item 19)

1. Inheritance breaks encapsulation because subclass method implementations come from outside the class itself, leading to a dependency on the superclass.

2. New methods added to superclasses will be inherited by subclasses automatically, meaning you may not override these methods "in time" (i.e. before you realize these methods exist and may need to be overridden).  

The book says to only use inheritance when there is a clear "is-a" relationship. Adding fuctionality to a class should always be done via interfaces.  

To do composition, an interface is implemented by a "forwarding class" that simply keeps an instance of the type and forwards all the method implementations to its subclasses. The subclass extends the forwarding class instead of the interface implementation directly. This decouples the subclass from a specific superclass implementation, and prevents unexpected behavior during calls to super (e.g. when invoking a superclass method that internally invokes another superclass method, and that the subclass overrides).

# Why you should prohibit inheritance unless you can't (item 20)  

The biggest no-no is defining your methods or constructor such that it invokes an overrideable method.  

If you must do this, create a private version of the invoked method and have the public version that's overrideable invoke the private version. This way, the method can still be overridden, but any methods that depend on it still invoke the original version.  

To prohibit inheritance, instead of making the class `final` it's preferred to make the constructor private, and expose a factory method that invokes the constructor. This follows from the general good-practice of using static factory methods, as they are less likely to cause breaking changes.  

