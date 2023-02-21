# Chapter 3: Methods Common to All Objects


## Table of Contents
1. [Overriding Equals](#overriding-equals)


### Overriding Equals  
In order for our classes to work as expected, for example in `Set` objects or as keys for `Map` objects, their `equals` implementation must have the properites of an _equivalence relation_ (or something of that sort). These properties include  

1. _Reflexivity_: For all non-null instances of your class `x`, `x.equals(x)`
2. _Symmetry_: For all non-null instances of your class `x` and `y`, `x.equals(y)` implies `y.equals(x)`
3. _Transitivity_: For all non-null instances of your class `x`, `y` and `z`, `x.equals(y)` and `y.equals(z)` implies `x.equals(z)`
4. _Consistent_: `equals` is a well-defined function
5. _non-null_: For all non-null instances of your class `x`, `x.equals(null)` returns `false`

**The default implementation of `Object.equals` is "identity", i.e. each instance only equals itself.  



