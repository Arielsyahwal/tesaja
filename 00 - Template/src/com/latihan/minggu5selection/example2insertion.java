package com.latihan.minggu5selection;

public class example2insertion {
    public static void main(String []args) {
        int arr[] = {9, 8, 7, 6, 5, 4, 3, 2, 1};

        System.out.println("Array before bubble sort : ");
        displayArray(arr);

        insertionSortAlgorithm(arr);

        System.out.println("Array after bubble sort : ");
        displayArray(arr);
    }

    static void insertionSortAlgorithm(int[] array) {
        int n = array.length;
        for (int i = 1; i < n - 1; i++) {
            int currentElement = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > currentElement) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = currentElement;
        }
    }
    static void displayArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
