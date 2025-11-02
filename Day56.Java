package Arull;

import java.util.Scanner;

public class Java1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Day 56 DO While
        int angka;
         do {
            System.out.print("Masukkan angka (0 untuk berhenti): ");
            angka = in.nextInt();
            
            System.out.println("Anda memasukkan: " + angka);
        } while (angka != 0);
        
        System.out.println("Program berhenti karena Anda memasukkan angka 0.");
    }
}
