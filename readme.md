# The Java programming language

A short repo of Java programming language sample programs. Applies to Java 11+

- [01 - Hello World](/src/com/irisida/basics/helloworld/HelloWorld.java) - The standard `Hello World` introductory program as is customary in any new language, or old language.
- [02 - Temperature Conversion](/src/com/irisida/basics/tempconvert/TempConvert.java) - Another classic example is the convertor, here we have celsius and fahrenheit being converted by means of passing an input value to a method. Here we have a naive handling and not particularly resilient to erroneous input (more on that later).
- [03 - The While loop](/src/com/irisida/basics/whileloop/WhileLoop.java) - Very brief introduction to looping using a `while` construct.
- [04 - The for loop](/src/com/irisida/basics/forloop/ForLoop.java) - Simplest `for loop` example.
- [05 - Conditionals with if, else if, else](src/com/irisida/basics/ifelse/IfElse.java) - small `fizz buzz` example to demonstrate an if, else if block.
- [06 - The Switch statement](/src/com/irisida/basics/switching/SwitchStatement.java) - Demonstrates the switch, case, break and default keywords and construct.
- [07 - Enhancing Switch with fallthrough](src/com/irisida/basics/fallthrough/FallingThrough.java) - Example demonstrating the use of a fallthrough on a switch statement.
- [08 - Java and strings equality](src/com/irisida/basics/stringsequals/StringsEquals.java) - A trivial demo that exposes the underlying optimisation of the heap in the JVM. Were we have two identical strings Java is smart enough to optimise that and store a single value. Ths works as a refernace variable and therefore we have multiples referring to the same memory segment and housed value. Therefore, when we apply the `object1.equals(object2)` we are given a true value.