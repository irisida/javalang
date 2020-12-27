![](/assets/javarepologo.png)

# The Java programming language - Chapter 2

- [1.2.1 - Conditionals with if, else if, else](/src/com/irisida/lang/part01/chapter02/ifelse/IfElse.java) - small `fizz buzz` example to demonstrate an if, else if block.
- [1.2.2 - The Switch statement](/src/com/irisida/lang/part01/chapter02/switching/SwitchStatement.java) - Demonstrates the switch, case, break and default keywords and construct.
- [1.2.3 - Enhancing Switch with fallthrough](/src/com/irisida/lang/part01/chapter02/fallthrough/FallingThrough.java) - Example demonstrating the use of a fallthrough on a switch statement.
- [1.2.4 - Java and strings equality](/src/com/irisida/lang/part01/chapter02/stringsequals/StringsEquals.java) - A trivial demo that exposes the underlying optimisation of the heap in the JVM. Were we have two identical strings Java is smart enough to optimise that and store a single value. Ths works as a reference variable and therefore we have multiples referring to the same memory segment and housed value. Therefore, when we apply the `object1.equals(object2)` we are given a true value.
- [1.2.5 - final values](/src/com/irisida/lang/part01/chapter02/finalvariables/FinalVariables.java) - Here we see the `final` keyword used in the variable declaration sequence that creates a restriction on reassignment effectively making the `variable` a constant.
