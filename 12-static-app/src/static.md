Static can be used in  

1. static class
2. static data members
3. static methods
4. static blocks 

## Static Methods
- static Method can not use `non-static data member` or call `non-static method` directly. 
- `this` and `super` cannot be used in static content. because this refers to current object.  
- it can access only static data
- they are called/invoked using name of class, not object

## Static Members
- `static members` and `varaibles` are initializsed, even before class is loaded. You can directly call this variables in Test Class.

## Static Blocks 
- static blocks are executed only once when class is loaded. 
- used for initialization - an one time work