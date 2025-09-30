## Exception

The term exception is the shorthand for the phrase "exceptional event". According to
the oracle source (https://docs.oracle.com/javase/tutorial/essential/exceptions/definition.html)
'An <b>exception </b> is an event, which occurs during the execution of a program, that disrupts the normal flow of
program's instructions'.

When an error occurs within a method, the method creates an object and hands it off to the runtime system.
The object, called an exception object, contains information about the error, 
including its type and the state of the program when the error occurred. 
Creating an exception object and handing it to the runtime system is called
<b> throwing an exception. </b>
<br/>
After a method throws an exception, the runtime system attempts to find something to handle it. The set of possible
"somethings" to handle the exception is the ordered list of methods that had been called to get to
the method where the error occurred. The list of methods is known as the
<b> call stack. </b>


### The Catch or Specify Requirement
Valid Java programming language code must honor the Catch or Specify Requirement. This means that code that might throw certain exceptions must be enclosed by either of the following:

* A try statement that catches the exception. The try must provide a
handler for the exception, as described in Catching and Handling 
Exceptions.
* A method that specifies that it can throw the exception. The method must provide a throws clause that lists the exception, as described in Specifying the Exceptions Thrown by a Method.
Code that fails to honor the Catch or Specify Requirement will not compile.
<br/>

<u>Not all exceptions are subject to the Catch or Specify Requirement.</u>
To understand why, we need to look at the three basic categories of 
exceptions, only one of which is subject to the Requirement.

