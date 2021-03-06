![](/assets/javarepologo.png)

# The Java programming language - Chapter 16

In this chapter we'll have a look at exceptions in Java.

- [7.16.1 - Introducing Exceptions](/src/com/irisida/lang/part07/chapter16/introducingexceptions/App.java) - a simple and trivial demo to sho the need for throws InterruptedException to be added to the class definition.
- [7.16.2 - The try/catch syntax](/src/com/irisida/lang/part07/chapter16/introducingtrycatch/App.java) - here we see the first use of the `try` and `catch` syntax. Again the catch will catch an `InterruptedException` type.
- [7.16.3 - more try/catch](/src/com/irisida/lang/part07/chapter16/moretrycatch/App.java) - Here we're demoing the concept of catching a particular exception type and handling the situation.
- [7.16.4 - Throwing Exceptions](/src/com/irisida/lang/part07/chapter16/throwingexceptions) - Here we're demoing the call stack from a caught checked exception. We use a try/catch block and handle the throw further up the chain (in the main program here).
- [7.16.5 - Runtime exceptions]() - Here we have removed the `throws Exception` and replacing the `new Exception` with `new RuntimeException` instead. These unchecked exceptions can still be handled by our catch.
- [7.16.6 - Custom Exceptions](/src/com/irisida/lang/part07/chapter16/customexceptions/exceptions/TemperatureOutOfRangeException.java) - In this demo we're creating a custom exception type that gets thrown from our thermostat methods. Note as we're extending the `Exception` (checked exception) class we can pass a message along via a call to `super()`.