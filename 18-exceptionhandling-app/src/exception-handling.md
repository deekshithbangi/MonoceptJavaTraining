- Exception - is unwanted problem 
		try {
			// code that might cause exception
		} catch (NumberFormatException nfe) {
			// code that we want to execute if this type of exception occurs
		} catch (ArthematicException ae) {
			// multiple catch blocks 
		} catch (Exception e) {
			// Exception should be last, since catch blocks follow the hierarchy 
		}
		
- `try` 
	- contains the code that might cause a problem 
	- if a problem is caused, then next lines in try block will never executes. It directly jumps to catch block. 
	- 
- `catch`
	- catch block code is executed when there is exception/problem occurs in try block 
	- every catch block exception will also consider its subclass exception also. 
	- we can have multiple catch blocks, but these catch should follow hierarchy 
- `finally` 
	- finally block will execute no matter problem occurs or not. 
	- it used to close scanner or important database connectivity. 
	- it will overwrite the return statements in try and catch blocks. i.e finally block return statements have superarity
	
- exception are thrown back to method that calls it. 
- for unchecked exceptions we don't need to write throws ExceptionName at the method signature.

- youtube 
	- [Exception](https://www.youtube.com/watch?v=1XAfapkBQjk)