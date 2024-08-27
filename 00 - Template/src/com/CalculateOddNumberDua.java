package com;
import java.util.Scanner;

public class CalculateOddNumberDua {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("N : ");
        int n = input.nextInt();

        int i = 1;
        int hasil = 0;

        while (i <= n) {
            if (i % 2 == 1) {
                hasil += i;
            }
            i++;
        }
        System.out.println("Hasil nya ialah : " + hasil);
    }
}
