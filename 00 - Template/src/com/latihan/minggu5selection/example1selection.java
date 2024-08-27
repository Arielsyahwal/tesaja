package com.latihan.minggu5selection;

public class example1selection {
    public static void main(String []args) {
        int arr[] = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        
        System.out.println("Array before bubble sort : ");
        displayArray(arr);

        selectionSortAlgorithm(arr);

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
    static void displayArray(int[] array) {
        int N = array.length;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
