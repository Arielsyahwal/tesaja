package minggu3array.challenge;

import java.util.Random;

public class challengesatu {
    public static void main(String[] args) {

        Random rd = new Random();
        int[] arr = new int[10];
        int average = arr.length;
        int a = 0;
        
        for (int i = 0; i < arr.length; i++) {
            arr[i]= rd.nextInt(100);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(" ");
            a += arr[i];
        }

        int rumus = (a / average);
        System.out.println("\nTotal nilai diatas ialah : " + a);
        System.out.println("Banyak nilai diatas ialah : " + arr.length);
        System.out.println("Rata-rata dari nilai diatas ialah : " + rumus);

    }
}
