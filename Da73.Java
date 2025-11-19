package aruls;

import java.util.Scanner;
public class java {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Day 73 Penjumlahan Angka (berhenti ketika menginputkan angka negatif)
        int total = 0;
        do {
            System.out.print("Masukkan angka negatif untuk berhenti :");
            int angka = in.nextInt();
            if (angka >= 0) {
                total += angka;
            }
            if (angka < 0) {
                break;
            }
        } while (true);
        System.out.println("total penjumlahan :" + total);
    }
}
