![](/assets/javarepologo.png)

# The Java programming language - Chapter 7

Where you create an attribute as Static it basically means that it is shared between all instances of the class. Commonly used alongside `final` to make the value a constant. If we see `public static final` we know that we should refer to the attribute at the class level and not the instance level.

- [3.7.1 - Using static for methods and IDs](/src/com/irisida/lang/part03/chapter07/usingstatic/genids) - Here we've created a class that has `public static` and `private static` attributes that we're using to keep a count of the number of instances of that class are in our program and the Ids (simple sequence number) that is associated with each.