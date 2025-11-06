## Sealed Classes
Sealed classes and interfaces restrict which other classes or interfaces
may extend or implement them. 

By sealing a class you can specify which classes are permitted
to extend the class and prevent any other arbitrary class from doing so.

### Declaring a Sealed Class
To seal a class, add the `sealed` modifier to its declaration. 
Then, after any `extends` or `implements` clauses, add the `permits` clause.
This clause specifies the classes that may extend the sealed class.

