
package Aarul;

import java.util.Scanner;

public class Java {
    public static void main(String[] args) {
        // day 26
        Scanner in = new Scanner(System.in);
        System.out.println("masukkan angka pertama :");
        int angka1 = in.nextInt();
        System.out.println("masukkan angka kedua :");
        int angka2 = in.nextInt();
        System.out.println("masukkan angka ketiga :");
        int angka3 = in.nextInt();
        System.out.println("masukkan angka keempat :");
        int angka4 = in.nextInt();
        
        angka1 += 5; //angka1 di tambah dengan 5
        angka2 -= 5; // angka2 di kurang dengan 5
        angka3 *= 5; // angka3 di kali dengan 5
        angka4 /= 5; // angka4 di bagi dengan 5
        
        
        System.out.println("hasil dari += adalah " +angka1);
        System.out.println("hasil dari -= adalah " +angka2);
        System.out.println("hasil dari *= adalah " +angka3);
        System.out.println("hasil dari /= adalah " +angka4);
        

        
        
    }
}
