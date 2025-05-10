package $1_Basics;
/* Key Takeaways
*/
public class _3_ArrayMore {
    public static void main(String[] args) {

        // Generating assymetrical 2D array
        int[][] twoDArray;
        twoDArray = new int[3][];

        twoDArray[0] = new int[]{1,2,3};
        twoDArray[1] = new int[5];
        twoDArray[2] = new int[]{4,5,6,7};

        //print
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/* QnA
 */