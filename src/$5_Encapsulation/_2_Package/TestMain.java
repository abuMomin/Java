// Searches `Test` class in current package
package $5_Encapsulation._2_Package;
// if `Test` is not in that package, we need to import it --> refer the path from `src` folder
import $5_Encapsulation._2_Package.packTest.Test;

public class TestMain {
    public static void main(String[] args) {
        Test test = new Test();
        test.display();
    }
}

/* QnA
1. Can I create same class in two different package?
     Ans: No problem. But I can not create two classes with same name in one package/folder.
        - In similar package, I can write many public java classes separately. However, I cannot write more than public java class in one java file in same package.
2.
 */
