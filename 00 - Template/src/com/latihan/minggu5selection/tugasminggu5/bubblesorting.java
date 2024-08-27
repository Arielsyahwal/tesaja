package com.latihan.minggu5selection.tugasminggu5;

import java.util.Random;

public class bubblesorting {
    public static void main(String []args) {
        int arr[] = new int[10000];

        System.out.println("Array before bubble sort : ");
        loopingArray(arr);

        double start = System.currentTimeMillis();
        bubbleSort(arr);
        double finish = System.currentTimeMillis();

        System.out.println();
        System.out.println("Execution time " + ((finish - start)/1000.0) + "Seconds");
        System.out.println();
        
        System.out.println("Array after bubble sort : ");
        displayArray(arr);
    }

    static void bubbleSort(int[] array){
        int N = array.length;
        int temp;

        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    static void loopingArray(int[] array) {
        int N = array.length;
        Random rd = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(100000);
            System.out.print(array[i] + " ");
        }

        System.out.println();
    }

    static void displayArray(int[] array) {
    int N = array.length;

    for (int i = 0; i < array.length; i++) {
        System.out.print(array[i] + " ");
    }

        System.out.println();
    }
}
