package com;

/* 
 * Minggu Pertama
 * Latihan Input Output pada Java
 */

 import java.util.Scanner;

 class DuaIO {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an Integer : ");
        int number = input.nextInt();
        System.out.println("You entered " + number);

        // closing scanner the object
        input.close();
    }
 }
