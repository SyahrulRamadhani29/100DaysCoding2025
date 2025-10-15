package Arull;

import java.util.Scanner;

public class Java1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //day38 Menentukan bilangan positif, negatif dan nol
        System.out.print("masukkan angka : ");
        byte angka = in.nextByte();
        if(angka>=1){
            System.out.println("angka "+angka+" adalah bilangan positif ");
        }else if (angka<=-1){
            System.out.println("angka "+angka+" adalah bilangan negatif ");
        }else{
            System.out.println("angka "+angka+" adalah bilangan 0 ");
        }
    }
    
}  
