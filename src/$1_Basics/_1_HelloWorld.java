package $1_Basics;

/* Key Takeaways
// One Java project can have one main function only.
// Java doesn't allow to write any method or variable (like global variable, function in C) outside the class, thats why java is a pure OOP language.
// No standalone function, everything is a part of class
// No explicit use of pointer, uses reference.
// The class name should start with Capital Letter.
// One java file can only have one public class, otherwise, it will be treated as separate files.
// Java Code --> Compiler (JDK) --> Java class files (Bytecodes) [JRE] --> JVM --> Machine Code (0,1) --> Operations performed by the computer.
*/
class _1_HelloWorld {       //  good to write class name's first letter in Capital
    public static void main(String[] args) {
        // good to write variable and method name in smaller letter with camelcasing or _
        String $name = "Win";   // can write $ and _ at the beginning of variable, but variable can't start with number.
        double PI = 3.1416;     // good practice to write constants in ALL CAPITAL
        System.out.println("Help! " + $name + " " + PI);
    }
}

/* QnA:
1. What is String[] args?
    Ans: The public static void main(String[] args) method in Java is the entry point for any Java program. The keywords
    `public` makes this method accessible from anywhere,
    `static` allows the method to be called without creating an instance (object) of the class, making it easier to run the program directly.
    `void` indicates that the method doesn't return any value,
    `main` is the name of the method which indicates start executing any java program from this point, and
    `String[] args` is an array that stores command-line arguments, allowing users to input data when they run the program.
    This setup is essential for Java programs to function correctly.

2. Why I can't write 2 main functions in one java project?
    Ans: Main Method is used by JVM to start the execution of the program.
    Well, A java program can contain more than one “main” method in a class but, in the terms of Method Overloading.
    The Standard MAIN method accepts the array of Strings as argument in java.
    Method Overloading- The feature in java that allows more than one function of same name but different argument and return type.

3. Can I write two public classes in one Java file? [INTERVIEW QUE]
    Ans: Yes, if the classes are nested. and No, if they are in the same level and not nested.

4. What is JVM, JDK, JRE?
    Ans: Tutorial:  https://www.youtube.com/watch?v=KctLuhwFEQ8
    JDK = Java Development Kit (includes JVM, JRE, Java Compiler and java standard library). Includes everything to create, run, debug, compile,
    Test, modify java programs. When you're developing java program within an IDE, you need the full JDK.
    JRE = Java Runtime Environment (includes JVM and java standard library). just to run java programs, without creating/modifying programs.
    Has java standard library (classes) to run a java program such as: I/O, helper classes, string, math, exception, object, sql, and many more.
    When you're simply running a pre-compiled Java application AKA java bytecodes, you only need the JRE.
    JVM = JVM (Java Virtual Machine) is an abstract machine. It is a specification which is included in JRE that provides java runtime environment (JRE)
    to execute bytecodes of the java program.  Responsible for loading up the program into the memory and executing its operations.
    supports multi-threading, garbage collection, cross-platform support, security checks, and many more.

    Java Code --> Compiler (JDK) --> Java class files (Bytecodes) [JRE] --> JVM --> Machine Code (0,1) --> Operations performed by the computer.
 */
