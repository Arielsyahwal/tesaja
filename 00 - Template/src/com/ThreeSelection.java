package com;

import java.util.Scanner;

public class ThreeSelection {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an Integer : ");
        int number = input.nextInt();
        System.out.println("You entered : " + number);

        if (number > 0){
            System.out.println("positive number");
        } else if (number < 0){
            System.out.println("negative number");
        } else {
            System.out.println("zero number");
        }

        input.close();
    }
}
