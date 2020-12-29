![](/assets/javarepologo.png)

# The Java programming language - Chapter 13

- [5.13.1 - Hashcode and This](/src/com/irisida/lang/part05/chapter13/hashcodethis) - Here we can see the hashcode that is associated with the creation of an object. We also highlight the appearance/use of this in the default toString that is associated with any object we create without overriding the toString method. We need to demonstrate this using `Printf()` and defining the `%h` format as the `Println()` default is to use decimal format.
- [5.13.2 - Inner class basic example](/src/com/irisida/lang/part05/chapter13/innerclassexample/App.java) - Here we can see the declaration and utilisation of an inner class. The example has an inner class that implements the runnable interface and that means we can use it with the concurrent packages Executors to create a timer.
- [5.13.3 - Effectively final](/src/com/irisida/lang/part05/chapter13/effectivelyfinal/App.java) - Here we demonstrate the notion of `effectively final` where we can have an inner class access variables from within the methods of an outer class as long as they are not mutated. A feature that whilst it works it could prompt a loss of clarity of cleaning up compile time errors on silly mistakes where a change in the code sees a variable that was effectively final is subject to mutation meaning we now have to change code in multiple places.
- [5.13.4 - Static inner classes](/src/com/irisida/lang/part05/chapter13/staticinnerclass/Person.java) - Trivial example of declaring static inner classes. Although nonsensical it demos the ability to house classes within the classes we declare.
- [5.13.5 - Non-static inner classes](/src/com/irisida/lang/part05/chapter13/nonstaticinnerclasses/Person.java) - Here we demonstrate a non=static inner class. The difference is that non-static inner classes can refer to instance variables because they are non-static and therefore are reliant on and associated with a particular instance.
- [5.13.6 - Anonymous classes]() - In this example we send an anonymous class that implements Runnable into the activate function. We will have a warning that this should be replaced with a lambda expression but we're still dealing with pre-lambda java mostly at this stage so it covers how we can do this without the luxury of lambda.

As a further comprehension we can use the following code to demonstrate what we have covered in this section all in one example.

```java
public class App implements Runnable {
    private String name = "Swiss Tony";

    class NonStaticInnerClass implements Runnable {
        public void run() {
            System.out.println(name);
        }
    }

    class StaticInnerClass implements Runnable {
        private String name;

        public StaticInnerClass(String name) {
            this.name = name;
        }

        public void run() {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        new App().start();
    }

    public void start() {

        /*
         * Example 1. class level implementation
         */
        activate(this);

        /*
         * Example 2. anonymous class implementation
         */
        activate(new Runnable() {
            public void run() {
                System.out.println(name);
            }
        });

        /*
         * Example 3. method local inner-class implementation
         */
        class LocalInnerClass implements Runnable {
            public void run() {
                System.out.println(name);
            }
        }
        activate(new LocalInnerClass()); // call with the class we just created.

        /*
         * Example 4. non-static inner class
         */
        activate(new NonStaticInnerClass());

        /*
         * Example 5. static inner class
         */
        activate(new StaticInnerClass(name));

    }

    public void activate(Runnable runnable) {
        runnable.run();
    }

    @Override
    public void run() {
        System.out.println(name);
    }
}
```