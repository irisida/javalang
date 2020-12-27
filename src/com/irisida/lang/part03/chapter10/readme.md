![](/assets/javarepologo.png)

# The Java programming language - chapter 10


- [3.10.1 - Interfaces, a first example](/src/com/irisida/lang/part03/chapter10/interfaces/firstexample/Describable.java) - Here we create an interface called `Describable` that has a `getDescription()` method. When we declare classes that are implementing this interface that means we must have an implementation for the methods required to fulfil the interface signature, ie, `getDescription` here. This allows us to have class specific implementations of how we handle the description whist adhering to the `is a` notion. Further to that it allows us to create arrays of seemingly unrelated object types that have been given enough of a commonality via the interface to be able to be part of a object collection such as the array in our example here.
- [3.10.2 - Interface inheritance]()