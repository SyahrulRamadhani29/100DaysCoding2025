package Arull;

import java.util.Scanner;

public class Java1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
 //Day57 nested loop
          System.out.print("Masukkan angka pertama: ");
        int a = in.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int b = in.nextInt();

        int total = 0;

        System.out.println("\n=== Proses Perhitungan ===");
        
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                int hasil = i + j;  
                total += hasil;     
                System.out.println(i + " + " + j + " = " + hasil);
            }
        }

        System.out.println("\nTotal keseluruhan hasil penjumlahan: " + total);

        in.close();  
    }
}
