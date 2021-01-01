![](/assets/javarepologo.png)

# The Java programming language - Chapter 18

In this chapter we'll look at exceptions with constructors and TryWithResources

- [7.18.1 - Constructor exceptions and Close](/src/com/irisida/lang/part07/chapter18/constructorandclose/App.java) - In this demo we're seeing some concepts such as a try.catch within a try catch which is quite ugly but was once the standard.
- [7.18.2 - Demo of TryWithResources syntax](/src/com/irisida/lang/part07/chapter18/trywithresources/App.java) - Introduces the TryWithResources syntax which allows us to remove the ugly code from the previous demo and implicitly call the close method using the new syntax that works with class implementing the `autoCloseable()` interface and the `close()` method.
- [7.18.3 - Another tryWithResources demo using scanner]() -