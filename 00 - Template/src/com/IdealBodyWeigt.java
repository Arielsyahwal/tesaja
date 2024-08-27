package com;

import java.util.Scanner;

public class IdealBodyWeigt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int jenisKelamin;
        float BB, TB, rumusBMI, rumusMeter;
        double rumusBroca;
     
        System.out.print("Masukan Berat dalam KG : ");
        BB = input.nextFloat();
        System.out.print("Masukan Tinggi dalam CM : ");
        TB = input.nextFloat();
        System.out.println("1. Laki-Laki || 2. Perempuan");
        System.out.print("Masukan Jenis Kelamin : ");
        jenisKelamin = input.nextInt();

        rumusMeter = TB / 100;
        rumusBMI = (BB / rumusMeter);
  
        System.out.println("-------------------------------------");
        System.out.print("BMI : " + rumusBMI + " ");
        
        if (rumusBMI < 18.5){
            System.out.println("(Kurus)");
        } else if (rumusBMI <= 24.9){
            System.out.println("(Normal)");
        } else if (rumusBMI < 29.9){
            System.out.println("(Kelebihan BB)"); 
        } else {
            System.out.println("(Obesitas)"); 
        }
        
        switch(jenisKelamin){
            case 1 : rumusBroca = ((TB-100)-(0.10*(TB-100))); 
            break;
            case 2 : rumusBroca = ((TB-100)-(0.15*(TB-100))); 
            break;
            default : rumusBroca = 0;
        }
    
        int hasil = (int)rumusBroca;
        System.out.println("Berat badan ideal mu : " + hasil + " Kg");
    }
}
