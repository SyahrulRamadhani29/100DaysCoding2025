package Arull;

import java.util.Scanner;

public class Java1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
 //day 30 perbandingan <= dan >=.
        System.out.print("nilai a : ");
        int a = in.nextInt();
        System.out.print("nilai b : ");
        int b = in.nextInt();
        System.out.println("hasil perbandingan lebih kecil sama dengan dari a dan b "+(a<=b));
        System.out.println("hasil perbandingan lebih besar sama dengan dari a dan b "+(a>=b));
    }
}
 
