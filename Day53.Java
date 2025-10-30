package Arull;

import java.util.Scanner;

public class Java1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Day53 menggunakan break
         for (int i = 1; i <= 10; i++) {
            System.out.println("Angka: " + i);

            if (i == 5) {
                System.out.println("Berhenti di angka 5!");
                break;
            }
        }

        System.out.println("Perulangan selesai.");
         
    }
}
