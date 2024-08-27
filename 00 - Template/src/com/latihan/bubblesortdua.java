package com.latihan;

import java.util.Arrays;
import java.util.Scanner;

// PROGRAM BUBBLE SORTING ASCENDING (KECIL - TERBESAR) DENGAN 5 INPUT USER
public class bubblesortdua {
    
    public static void main (String[] args) {

    Scanner scan = new Scanner(System.in);
    int data[] = new int[5];
    int temp;

    // User menginput 5 angka untuk diinputkan
    System.out.print("Input 5 Numbers to be ordered : ");
    for (int i = 0; i < data.length; i++) {
        data[i] = scan.nextInt();
        scan.nextLine();
    }

    // Dari terkecil ke terbesar
    System.out.println("Ascending result : ");
    for (int i = 0; i < data.length; i++) {
        for (int j = i + 1; j < data.length; j++) {
            if (data[j] < data[i]) {
                temp = data[i];
                data[i] = data[j];
                data[j] = temp;
            }
        }
        System.out.println("Element " + (i+1) + ": " + Arrays.toString(data));
    }
    }

}
