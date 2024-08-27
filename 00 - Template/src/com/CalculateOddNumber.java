package com;
import java.util.Scanner;

public class CalculateOddNumber {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("N : ");
        int n = input.nextInt();

        int i = 1;
        int l = 0;

        while (l <= n) {
            if (i % 2 == 1) {
                System.out.println(i);
                l++;
            }
            i++;
        }

    }
}
