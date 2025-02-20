package $8_GarbageCollection;
/*
Garbage Collection:
- when no references to an object exist, that object is assumed to be no longer needed, and the memory occupied by the object can be reclaimed.
- Garbage collection only occurs irregularly during the execution of your program.
- Different Java run-time implementations will take varying approaches to garbage collection.
- but for the most part, you should not have to think about it while writing your programs.
----------------------------
- local variables inside method get collected by garbage collector after the method execution.
- variable/object values which are not accessible anymore, are treated as garbage and collected by garbage collector.
 */
public class _1_GarbageCollection {
    public static void main(String[] args) {
        CustomStudent cs_1 = new CustomStudent();
        cs_1.name = "Win";
        CustomStudent cs_2 = new CustomStudent();
        cs_2.name = "Tuhin";
        cs_2 = cs_1;
        // cs_2 (Tuhin) object is not referred anymore through any reference. It got lost by the program
        // So, the java will collect the Tuhin object intelligently understanding it is not required anymore --> through garbage collector.
         System.out.println(cs_2.name);
    }
}

class CustomStudent{
    String name;
    String bloodGroup;
}

/* QnA

 */
