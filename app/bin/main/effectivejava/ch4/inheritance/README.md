# Why you should usually opt for composition instead of inheritance

1. Inheritance breaks encapsulation because subclass method implementations come from outside the class itself, leading to a dependency on the superclass.

2. New methods added to superclasses will be inherited by subclasses automatically, meaning you may not override these methods "in time" (i.e. before you realize these methods exist and may need to be overridden).  

The book says to only use inheritance when there is a clear "is-a" relationship. Adding fuctionality to a class should always be done via interfaces.  

To do composition, an interface is implemented by a "forwarding class" that simply keeps an instance of the type and forwards all the method implementations to its subclasses. The subclass extends the forwarding class instead of the interface implementation directly. This decouples the subclass from a specific superclass implementation, and prevents unexpected behavior during calls to super (e.g. when invoking a superclass method that internally invokes another superclass method, and that the subclass overrides).


