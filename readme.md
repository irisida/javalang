# The Java programming language

A short repo of Java programming language sample programs. Applies to Java 11+

### Course Mini projects
- [01 - Change detection](/src/com/irisida/projects/changedetection/ChangeDetection.java) - Futile little string matching project. Has no basis in reality and does not use secure or masked inputs. Only demonstrates some string methods.
- [02 - Update password with retry](/src/com/irisida/projects/withretry/WithRetr.java) - Update to the first mini project above, adds in the concept of retries, max count of 3. If correct within 3 attempts, update mechanism proceeds, if not the programs terminates in error. The same fragilities and non-real world scenarios apply as in project 01.
- [03 - Arrays challenge](/src/com/irisida/projects/arrayschallenge/ArraysChallenge.java) - The challenge was to define a fixed array size of integers, accept the integers as input from the console and total the output. Solution has two variants, one using a traditional iteration approach and adding the values to a total. The other uses the newer streams syntax and makes calls to `Arrays.streams(stream).sum()` to provide the total demonstrating an imperative and functional approach to the solution possibilities.
- [04 - Multidimensional arrays challenge](/src/com/irisida/projects/multidimarraychallenge/MultiDimChallenge.java) - Fairly trivial challenge to create a multidimensional array structure and traverse it calculation by line and by grand total.
- [05 - Multidimensional arrays challenge pt 2](/src/com/irisida/projects/multiplicationtables/MultiplicationTables.java) - Creates a program where tw variables dictates how many multiplication tables are generated as well as how many elements each table should have.

### Part One - Language and syntax examples

- [01 - Hello World](/src/com/irisida/basics/helloworld/HelloWorld.java) - The standard `Hello World` introductory program as is customary in any new language, or old language.
- [02 - Temperature Conversion](/src/com/irisida/basics/tempconvert/TempConvert.java) - Another classic example is the convertor, here we have celsius and fahrenheit being converted by means of passing an input value to a method. Here we have a naive handling and not particularly resilient to erroneous input (more on that later).
- [03 - The While loop](/src/com/irisida/basics/whileloop/WhileLoop.java) - Very brief introduction to looping using a `while` construct.
- [04 - The for loop](/src/com/irisida/basics/forloop/ForLoop.java) - Simplest `for loop` example.
- [05 - Conditionals with if, else if, else](src/com/irisida/basics/ifelse/IfElse.java) - small `fizz buzz` example to demonstrate an if, else if block.
- [06 - The Switch statement](/src/com/irisida/basics/switching/SwitchStatement.java) - Demonstrates the switch, case, break and default keywords and construct.
- [07 - Enhancing Switch with fallthrough](/src/com/irisida/basics/fallthrough/FallingThrough.java) - Example demonstrating the use of a fallthrough on a switch statement.
- [08 - Java and strings equality](/src/com/irisida/basics/stringsequals/StringsEquals.java) - A trivial demo that exposes the underlying optimisation of the heap in the JVM. Were we have two identical strings Java is smart enough to optimise that and store a single value. Ths works as a reference variable and therefore we have multiples referring to the same memory segment and housed value. Therefore, when we apply the `object1.equals(object2)` we are given a true value.
- [09 - final values](/src/com/irisida/basics/finalvariables/FinalVariables.java) - Here we see the `final` keyword used in the variable declaration sequence that creates a restriction on reassignment effectively making the `variable` a constant.
- [10 - The do-while loop](/src/com/irisida/basics/dowhile/DoWhile.java) - A very simple exercise demonstrating the `do while` loop construct. We see here that a do-while has an execution guarantee to always run at least once based on the loop evaluation being at the tail of the loop rather that at the head.
- [11 - loops with Stream](/src/com/irisida/basics/loopstream/LoopStream.java) - Introduction to streams and the syntax of these more advanced concepts to be covered in depth later on.

### Part Two - Arrays
- [12 - Simple arrays](/src/com/irisida/arrays/simplearrays/SimpleArrays.java) - An introductory example to declaring arrays in Java.
- [13 - String type arrays](/src/com/irisida/arrays/stringarrays/StringArrays.java) - Arrays using the string type, some iteration and array mutation with an intro to zero indexing as per almost all common programming languages.
- [14 - Arrays and streams iteration](/src/com/irisida/arrays/streamarrays/StreamArrays.java) - Here we're using the streams syntax to iterate across an array using the `range` and `.forEach`.
- [15 - Using for each iteration with arrays](/src/com/irisida/arrays/foreach/ForEach.java) - A syntax demo of the for each loop. This is a common syntax and is fairly ubiquitous in java projects. The construct is clean and avoids some syntactic noise, the downside is that you have no access to the index of the loop. If the index is required you're better off sticking to a traditional `for loop`.
- [16 - Multidimensional arrays](/src/com/irisida/arrays/multidim/MultiDim.java) - Basic demo of an Array of arrays. A multidimensional array. Demos that the arrays need not be exactly the same size, only the type is fixed.
- [17 - More Multidimensional arrays](/src/com/irisida/arrays/moremultidim/MoreMultiDim.java) - reduced the code footprint and works with the `[][]` notation to achieve multidimensional handling in less code.