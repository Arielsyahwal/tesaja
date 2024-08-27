package minggu3array;

import java.util.Random;

// Array One Dimension

public class Example3 {
    public static void main(String [] args) {

        Random rd = new Random();
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= rd.nextInt(100);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        
    }
}
