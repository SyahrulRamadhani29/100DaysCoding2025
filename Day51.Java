package Arull;

import java.util.Scanner;

public class Java1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //day 51 perulangan for
        System.out.print("masukkan angka awal untuk hitungan mundur : ");
        int angka = in.nextInt();
        for (int i = angka; i >=1; i--) {
            System.out.println("Hitung mundur dari : "+i);
        }
    }
}
