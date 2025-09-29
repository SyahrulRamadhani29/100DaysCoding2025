
package aruls;

import java.util.Scanner;
public class java {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("masukkan nilai sisi pertama :");
        int sp = in.nextInt();
        System.out.print("masukkan nilai sisi kedua :");
        double sk = in.nextDouble();
        
        System.out.println("jadi luas persegi adalah " +(sp*sk));
    }
}
