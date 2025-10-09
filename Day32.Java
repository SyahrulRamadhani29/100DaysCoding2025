package Arull;

import java.util.Scanner;

public class Java1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       //day32 logika ||
        System.out.print("masukkan nilai saldi :");
        short saldi = in.nextShort();
        System.out.print("masukkan nilai jeff :");
        short jeff = in.nextShort();
         boolean c = (saldi >90 && jeff >90) || (saldi <90 && jeff < 90);
         
         System.out.println("lulus "+c);
         
    }
} 
