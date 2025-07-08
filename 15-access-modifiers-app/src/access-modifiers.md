1. Default variables can be accessed in this class, subclasses, and non-subclasses. They can be accessed anywhere within the package only.
2. Private variables can be accessed in this Same Class only. 
3. Protected variables can be accessed in the same class, subclasses, and non-subclasses, 
	- if accessed from a different package, the accessing class must be a subclass of the class where the protected member is defined
	
summary: 
Public -> can be accessed anywhere 
Private -> Only in same class 
Default -> Can't be accessed in different package
Protected -> Can't be accessed in different package without extending it.