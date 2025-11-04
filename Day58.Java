package Arull;

import java.util.Scanner;

public class Java1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
   // day 58 menctak 1-N dan N-1
        System.out.print("Masukkan angka N :");
         int angka = in.nextInt();
        for (int i = 1; i <= angka; i++) {
            System.out.println(i);
        }
        for (int j = angka; j >= 1; j--) {
            System.out.println(j);
        }
    }
}
