package com.latihan;

import java.util.Random;

// PROGRAM DESCENDING (TERBESAR - TERKECIL) DENGAN 1000 INPUT RANDOM
public class bubblesortempat {
    public static void main (String[] args) {
    Random rd = new Random();
    int data[] = new int[1000];
    int temp;

    // Program menghasilkan 1000 inputan nilai dengan angka random (1-10000)
    System.out.print("Value : ");
    for (int i = 0; i < data.length; i++) {
        data[i]= rd.nextInt(10000);
        System.out.print(data[i] + " ");
    }

    System.out.println();
    System.out.println();

    // Terbesar ke Terkecil
    System.out.println("Descending result : ");
    for (int i = 0; i < data.length; i++) {
        for (int j = i + 1; j < data.length; j++) {
            if (data[j] > data[i]) {
                temp = data[i];
                data[i] = data[j];
                data[j] = temp;
            }
        }
        System.out.print(data[i] + " ");
    }

    }
}
