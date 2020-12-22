![](/assets/javarepologo.png)

# The Java programming language

Throughout the course there are mini assignments and knowledge checks. These mini challenges help compound the coverage.

### Course Exercises

Throughout the course there are several _knowledge-check_ exercises along the way.

- [01 - Change detection](/src/com/irisida/lang/exercises/changedetection/ChangeDetection.java) - Futile little string matching project. Has no basis in reality and does not use secure or masked inputs. Only demonstrates some string methods.
- [02 - Update password with retry](/src/com/irisida/lang/exercises/withretry/WithRetr.java) - Update to the first mini project above, adds in the concept of retries, max count of 3. If correct within 3 attempts, update mechanism proceeds, if not the programs terminates in error. The same fragilities and non-real world scenarios apply as in project 01.
- [03 - Arrays challenge](/src/com/irisida/lang/exercises/arrayschallenge/ArraysChallenge.java) - The challenge was to define a fixed array size of integers, accept the integers as input from the console and total the output. Solution has two variants, one using a traditional iteration approach and adding the values to a total. The other uses the newer streams syntax and makes calls to `Arrays.streams(stream).sum()` to provide the total demonstrating an imperative and functional approach to the solution possibilities.
- [04 - Multidimensional arrays challenge](/src/com/irisida/lang/exercises/multidimarraychallenge/MultiDimChallenge.java) - Fairly trivial challenge to create a multidimensional array structure and traverse it calculation by line and by grand total.
- [05 - Multidimensional arrays challenge pt 2](/src/com/irisida/lang/exercises/multiplicationtables/MultiplicationTables.java) - Creates a program where tw variables dictates how many multiplication tables are generated as well as how many elements each table should have.
- [06 - Class based menu challenge](/src/com/irisida/lang/exercises/menuclassproject/Menu.java) - This project creates a class that will take an array of strings as menu options and provide a method to the user to call for the display of the menu and show a formatted menu from the options they provided. The main class can be seen [here](/src/com/irisida/lang/exercises/menuclassproject/App.java)
- [07 - Updated menu with returned values](/src/com/irisida/lang/exercises/menuclassprojectupdated/Menu.java) - Previous challenge updated to return a value (_String_) instead of being a void method. Main class accepts the return into a string variables and displays it with a `sysout` call and passes the return of the `.get()` from the menu. Updated main is [here](/src/com/irisida/lang/exercises/menuclassprojectupdated/App.java)
- [08 - Class with getters and setters](src/com/irisida/lang/exercises/windowclass/Window.java) - This exercise implements a Window class and allows the user to control the dimensions between som default height & width properties and a maximised state where the maximum res is applied. (defaulted to 1080 & 1920 for exercise purposes). Main class can be found [here](src/com/irisida/lang/exercises/windowclass/App.java).