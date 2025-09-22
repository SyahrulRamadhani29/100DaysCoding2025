
package Arul12;
import java.util.Scanner;
public class Java {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int angka1,angka2;
        System.out.print("Masukkan angka 1 :");
        angka1 =in.nextInt();
        System.out.print("Masukkan angka 2 :");
        angka2 = in.nextInt();
        
        System.out.println("Hasil penjumlahan dari "+ (angka1 + angka2) );
        System.out.println("Hasil pengurangan dari " +(angka1 - angka2) );
    }
}
