package com.latihan.minggu5selection.tugasminggu5;

import java.util.Random;

public class insertionsorting {
    public static void main(String []args) {
        int arr[] = new int[10000];

        System.out.println("Array before bubble sort : ");
        loopingArray(arr);

        double start = System.currentTimeMillis();
        insertionSortAlgorithm(arr);
        double finish = System.currentTimeMillis();

        System.out.println();
        System.out.println("Execution time " + ((finish - start)/1000.0) + "Seconds");
        System.out.println();

        System.out.println("Array after bubble sort : ");
        displayArray(arr);
    }

    static void insertionSortAlgorithm(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int currentElement = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > currentElement) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = currentElement;
        }
    }

    static void loopingArray(int[] array) {
        Random rd = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(100000);
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    static void displayArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
