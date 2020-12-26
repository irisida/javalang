![](/assets/javarepologo.png)

# The Java programming language - Part One - Syntax & building blocks of Java.

- [1.01 - Hello World](/src/com/irisida/lang/part01/basics/helloworld/HelloWorld.java) - The standard `Hello World` introductory program as is customary in any new language, or old language.
- [1.02 - Temperature Conversion](/src/com/irisida/lang/part01/basics/tempconvert/TempConvert.java) - Another classic example is the convertor, here we have celsius and fahrenheit being converted by means of passing an input value to a method. Here we have a naive handling and not particularly resilient to erroneous input (more on that later).
- [1.03 - The While loop](/src/com/irisida/lang/part01/basics/whileloop/WhileLoop.java) - Very brief introduction to looping using a `while` construct.
- [1.04 - The for loop](/src/com/irisida/lang/part01/basics/forloop/ForLoop.java) - Simplest `for loop` example.
- [1.05 - Conditionals with if, else if, else](src/com/irisida/basics/ifelse/IfElse.java) - small `fizz buzz` example to demonstrate an if, else if block.
- [1.06 - The Switch statement](/src/com/irisida/lang/part01/basics/switching/SwitchStatement.java) - Demonstrates the switch, case, break and default keywords and construct.
- [1.07 - Enhancing Switch with fallthrough](/src/com/irisida/lang/part01/basics/fallthrough/FallingThrough.java) - Example demonstrating the use of a fallthrough on a switch statement.
- [1.08 - Java and strings equality](/src/com/irisida/lang/part01/basics/stringsequals/StringsEquals.java) - A trivial demo that exposes the underlying optimisation of the heap in the JVM. Were we have two identical strings Java is smart enough to optimise that and store a single value. Ths works as a reference variable and therefore we have multiples referring to the same memory segment and housed value. Therefore, when we apply the `object1.equals(object2)` we are given a true value.
- [1.09 - final values](/src/com/irisida/lang/part01/basics/finalvariables/FinalVariables.java) - Here we see the `final` keyword used in the variable declaration sequence that creates a restriction on reassignment effectively making the `variable` a constant.
- [1.10 - The do-while loop](/src/com/irisida/lang/part01/basics/dowhile/DoWhile.java)  A very simple exercise demonstrating the `do while` loop construct. We see here that a do-while has an execution guarantee to always run at least once based on the loop evaluation being at the tail of the loop rather that at the head.
- [1.11 - loops with Stream](/src/com/irisida/lang/part01/basics/loopstream/LoopStream.java) - Introduction to streams and the syntax of these more advanced concepts to be covered in depth later on.