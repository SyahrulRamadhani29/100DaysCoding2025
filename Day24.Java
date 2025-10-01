package latihan;

import java.util.Scanner;

public class elseIf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //mencari luas lingkaran
        System.out.println("masukkan nilai phi :");
        double phi = in.nextDouble();
        System.out.println("masukkan nilai r :");
        int r = in.nextInt();
        
        System.out.println("luas lingkaran adalah " +(phi*r*r));
        
    }
 
}
