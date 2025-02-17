package $1_Basics;
/* Key Takeaways
//
*/
public class _8_MathOperation {
    public static void main(String[] args) {
        // use of exponential/power --> 6^2 = 36
        double powNumb = Math.pow(6,2);
        System.out.println(powNumb);

        // ++, --, +=, -=, *=, /=
        int size = 0;
        System.out.println(size++);     // post-increament --> first statement execute, then increment
        System.out.println(size);
        System.out.println(++size);     // pre-increament --> first increment, then statement execute
        size += 5;                      // size = size +5
        System.out.println(size);
        size *= 3;                      // size = size * 3
        System.out.println(size);
    }
}

/* QnA

 */

