package com.latihan.minggu4bubblesort;

public class bubblesort_example {
    
    public static void main(String []args) {
        int arr[] = {9, 8, 7, 6, 5, 4, 3, 2, 1};

        System.out.println("Array before bubble sort : ");
        displayArray(arr);

        double start = System.currentTimeMillis();
        bubbleSort(arr);
        double finish = System.currentTimeMillis();

        System.out.println("Execution time" + ((finish - start)/1000.0) + "Seconds");

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
    static void displayArray(int[] array) {
        int N = array.length;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}
