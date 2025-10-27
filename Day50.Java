package Arull;

import java.util.Scanner;

public class Java1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //day50 menentukan ganjil genap menggukan ternari
        System.out.print("Masukkan sebuah angka :");
        int angka = in.nextInt();
        String hasil =(angka == 0)?"angka  nol"
                      :(angka%2==0)?"angka genap" 
                      :"angka ganjil";
        System.out.println("angka "+angka+" adalah "+hasil);
    }
}
