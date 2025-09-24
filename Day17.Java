package Arul;
import java.util.Scanner;
public class Java2 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        
        int angka1,angka2;
        
        System.out.println("masukkan angka 1 :");
        angka1 = a.nextInt();
        System.out.println("masukkan angka 2 :");
        angka2 = a.nextInt();
        
        System.out.println("hasil modulus atau sisa bagi dari "+ angka1 % angka2);
    }
}
