# The Java programming language

A short repo of Java programming language sample programs. Applies to Java 11+

### Course Mini projects
- [01 - Change detection](/src/com/irisida/projects/changedetection/ChangeDetection.java) - Futile little string matching proect. Has no basis in reality and does not use secure or maked inputs. Only demonstrates some string methods.
- [02 - Update password with retry](/src/com/irisida/projects/withretry/WithRetr.java) - Update to the first mini project above, adds in the concept of retries, max count of 3. If correct within 3 attempts, update mechanism proceeds, if not the programs terminates in error. The same fragilities and non-real world scenarions apply as in project 01.
- [03 - Arrays challenge](/src/com/irisida/projects/arrayschallenge/ArraysChallenge.java) - The challenge was to define a fixed array size of integers, accept the integers as input from the console and total the output. Solution has two variants, one using a traditional iteration approach and adding the values to a total. The other uses the newer streams syntax and makes calls to `Arrays.streams(stream).sum()` to provide the total demonsrating an imperative and functional approach to the solution possibilities.

### Part One - Language and syntax examples

- [01 - Hello World](/src/com/irisida/basics/helloworld/HelloWorld.java) - The standard `Hello World` introductory program as is customary in any new language, or old language.
- [02 - Temperature Conversion](/src/com/irisida/basics/tempconvert/TempConvert.java) - Another classic example is the convertor, here we have celsius and fahrenheit being converted by means of passing an input value to a method. Here we have a naive handling and not particularly resilient to erroneous input (more on that later).
- [03 - The While loop](/src/com/irisida/basics/whileloop/WhileLoop.java) - Very brief introduction to looping using a `while` construct.
- [04 - The for loop](/src/com/irisida/basics/forloop/ForLoop.java) - Simplest `for loop` example.
- [05 - Conditionals with if, else if, else](src/com/irisida/basics/ifelse/IfElse.java) - small `fizz buzz` example to demonstrate an if, else if block.
- [06 - The Switch statement](/src/com/irisida/basics/switching/SwitchStatement.java) - Demonstrates the switch, case, break and default keywords and construct.
- [07 - Enhancing Switch with fallthrough](/src/com/irisida/basics/fallthrough/FallingThrough.java) - Example demonstrating the use of a fallthrough on a switch statement.
- [08 - Java and strings equality](/src/com/irisida/basics/stringsequals/StringsEquals.java) - A trivial demo that exposes the underlying optimisation of the heap in the JVM. Were we have two identical strings Java is smart enough to optimise that and store a single value. Ths works as a refernace variable and therefore we have multiples referring to the same memory segment and housed value. Therefore, when we apply the `object1.equals(object2)` we are given a true value.
- [09 - final values](/src/com/irisida/basics/finalvariables/FinalVariables.java) - Here we see the `final` keyword used in the variable declaration sequence that creates a restriction on reassignment effectively making the `variable` a constant.
- [10 - The do-while loop](/src/com/irisida/basics/dowhile/DoWhile.java) - A very simple exercise demonstrating the `do while` loop construct. We see here that a do-while has an execution guarantee to always run at least once based on the loop evaluation beng at the tailof the loop rather that at the head.
- [11 - loops with Stream](/src/com/irisida/basics/loopstream/LoopStream.java) - Introduction to streams and the syntax of these more advanced concepts to be covered in depth later on.

### Part Two - Arrays
- [12 - Simple arrays](/src/com/irisida/arrays/simplearrays/SimpleArrays.java) - An introductory example to declaring arrays in Java.
- [13 - String type arrays](/src/com/irisida/arrays/stringarrays/StringArrays.java) - Arrays using the string type, some iteration and array mutation with an intro to zero indexing as per almost all common programming languages.
- [14 - Arrays and streams iteration](/src/com/irisida/arrays/streamarrays/StreamArrays.java) - Here we're using the streams syntax to iterate across an array using the `range` and `.forEach`.