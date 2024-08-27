package minggu3array.challenge;

import java.util.Scanner;

public class challengedua {
    public static void main (String[] args) {
        
        Scanner scan = new Scanner(System.in);

        String[] pelajar = new String[10];
        int a = 1;
        int b = 0;
        
        for (int i = 0; i < pelajar.length ; ++i) {
            b = a + i;
            System.out.print("Isi nama Pelajar ke-" + b + " : ");
            pelajar[i] = scan.nextLine();
        }

        for ( String hasil : pelajar ) {
            System.out.println(hasil);
        }

        System.out.print("Apakah ingin mengubah salah satu nama pelajar diatas (Y/N) : ");
        char rubah = scan.next().charAt(0);

        if (rubah == 'Y') {
            System.out.print("Ingin merubah nama pelajar ke berapa (1-" + pelajar.length + ") : ");
            int rubahPelajar = scan.nextInt();

            System.out.print("Nama baru pelajar : ");
            scan.nextLine();
            String pelajarBaru = scan.nextLine();

            pelajar[rubahPelajar -= 1] = pelajarBaru;

            for ( String hasil : pelajar ) {
                System.out.println(hasil);
            }
            }
            System.out.println("Program Selesai");
    }
    
}
