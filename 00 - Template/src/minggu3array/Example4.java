package minggu3array;

public class Example4 {

// Array Two Dimension
    public static void main(String [] args) {
        
        int[][] myNumbers = { {1, 2, 3, 4} , {5, 6, 7} };

        System.out.println(" Value Index 0,1 : " + myNumbers[0][1]);

        for (int i = 0; i < myNumbers.length; ++i) {
            for (int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j] + " ");
            }
            System.out.println();
        }

    }
}
