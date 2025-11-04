package Arull;

import java.util.Scanner;

public class Java1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //day 59
        System.out.print("Masukkan angka N :");
        int angka = in.nextInt();
        int a = 0, b = 0;
        System.out.print("angka genap :");
        for (int i = 0; i <= angka; i++) {
            if (i % 2 == 0) {
                System.out.print(i+",");
            }
        }
        System.out.print("\nangka genap :");
        for (int j = 0; j <= angka; j++) {
            if (j % 2 != 0) {
                System.out.print(j+",");
            }

        }
        System.out.println();
        in.close();
    }
}
