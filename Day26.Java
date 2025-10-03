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
        
        angka1 += angka2;
        angka2 -= angka1;
        
        System.out.println("hasil dari += adalah " +angka1);
        System.out.println("hasil dari -= adalah " +angka2);
        
        
    }
}
