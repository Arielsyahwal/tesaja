package com.latihan.minggu5selection.tugasminggu5;

import java.util.Random;

public class selectionsorting {
    public static void main(String []args) {
        int arr[] = new int[10000];
        
        System.out.println("Array before bubble sort : ");
        loopingArray(arr);
        System.out.println();

        double start = System.currentTimeMillis();
        selectionSortAlgorithm(arr);
        double finish = System.currentTimeMillis();

        System.out.println();
        System.out.println("Execution time " + ((finish - start)/1000.0) + "Seconds");
        System.out.println();

        System.out.println("Array after bubble sort : ");
        displayArray(arr);
    }

    static void selectionSortAlgorithm(int[] array) {
        int n = array.length;
        int temp;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex])
                minIndex = j;
            }
            // Swap
            temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
    
    static void loopingArray(int[] array) {
        int N = array.length;
        Random rd = new Random();

        for (int i = 0; i < N; i++) {
            array[i] = rd.nextInt(100000);
            System.out.print(array[i] + " ");
        }
    }

    static void displayArray(int[] array) {
        int N = array.length;

        for (int i = 0; i < N; i++) {
            System.out.print(array[i] + " ");
        }
    }

}
