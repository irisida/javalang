![](/assets/javarepologo.png)

# The Java programming language - Chapter 17

In this chapter we'll look at more exception and deal with multiple exceptions.

- [7.17.1 - Handling exceptions with multiple exceptions](/src/com/irisida/lang/part07/chapter17/multipleexceptions) - Here we have a demo that uses a hierarchy of exception classes we have created.
- [7.17.2 - Using subclass polymorphism with multiple exceptions](/src/com/irisida/lang/part07/chapter17/multipleexceptionsubclasspolymorphism/App.java) - We're expending on the code from the previous demo to show how we can simplify the code by using the baseclass exception in a subclass polymorphic way to reduce the footprint an improve clarity.
- [7.17.3 - Using logical or in a single catch](/src/com/irisida/lang/part07/chapter17/multipleexceptionspiped/App.java) - Here we simplify the code to bring the different exceptions into a single catch because the handling is the same. To cope with multiple exception possibilities in a single catch we can use the `logical or` pipe syntax.
- [7.17.4 - Exception flow control](/src/com/irisida/lang/part07/chapter17/exceptionflowcontrol/App.java) - Here we're demoing areas of unreachable code in the event of an exception being thrown, the circumventing of that by using a `finally` block.
- [7.17.5 -  The NullPointerException]() -