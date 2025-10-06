package Arull;

import java.util.Scanner;

public class Java1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("nilai a :");
        int a = in.nextInt();
        System.out.println("nilai b :");
        int b = in.nextInt();
        System.out.println("hasil perbandingan nilai a lebih besar dari nilai b "+(a > b) );
        System.out.println("nilai c :");
        int c = in.nextInt();
        System.out.println("nilai d :");
        int d = in.nextInt();
        System.out.println("hasil perbandingan nilai c lebih dari dari nilai d "+(c < d) );

    }
}
