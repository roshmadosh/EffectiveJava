# java.util.Collection + java.util.Collections


## Questions
1. [List vs ArrayList?](#list-vs-arraylist?)
2. [Why not just use Arrays.asList()?](#why-not-just-use-arrays.aslist()?)

### List vs ArrayList?
List is an interface that extends the Collection interface, meaning you can invoke methods on a variable declared as a List type like 
`add` and such. `ArrayList` is an example of a class that contains the implementation of the `List` methods.

### Why not just use Arrays.asList()?
`List<> list = Arrays.asList(1,2,3)` creates an array and converts it to a `List` type, but its underlying implementation is still 
an array. So while methods like `get` will work because arrays support indexing, but adding/removing will cause an `UnsupportedOperationException` 
to be thrown.  


