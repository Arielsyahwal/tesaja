package com;
import java.util.Scanner;

public class EligibleExamTask {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Math scores : ");
        int Math = input.nextInt();
        System.out.print("Chemistry scores : ");
        int Chemistry = input.nextInt();
        System.out.print("Physich scores : ");
        int Physich = input.nextInt();
        System.out.print("Biology scores : ");
        int Biology = input.nextInt();

        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        int TotalScore = Math+Chemistry+Physich+Biology;
        int ScienceScore = Math + Physich;

        System.out.println("Total score: " + TotalScore);
        System.out.println("Total math and physics scores: " + ScienceScore);

        if (Math >= 75 && Chemistry >= 70 && Physich >= 70 && Biology >= 70) {
            if (TotalScore >= 295 || ScienceScore > 170) {
                System.out.println("Eligible to enter the class of science");
            }
        } else {
            System.out.println("Not eligible to enter the class of science");
        }

    }
    
}
