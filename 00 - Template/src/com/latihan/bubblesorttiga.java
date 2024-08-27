package com.latihan;

import java.util.Random;

// PROGRAM ASCENDING (TERKECIL - TERBESAR) DENGAN 1000 INPUT RANDOM
public class bubblesorttiga {
    public static void main (String[] args) {
    Random rd = new Random();
    int data[] = new int[10000];
    int temp;

    // Program menghasilkan 1000 inputan nilai dengan angka random (1-10000)
    System.out.print("Value : ");
    for (int i = 0; i < data.length; i++) {
        data[i]= rd.nextInt(100000);
        System.out.print(data[i] + " ");
    }

    System.out.println();
    System.out.println();

    // Terkecil ke Terbesar
    System.out.println("Ascending result : ");
    for (int i = 0; i < data.length; i++) {
        for (int j = i + 1; j < data.length; j++) {
            if (data[j] < data[i]) {
                temp = data[i];
                data[i] = data[j];
                data[j] = temp;
            }
        }
        System.out.print(data[i] + " ");
    }
    }
}
