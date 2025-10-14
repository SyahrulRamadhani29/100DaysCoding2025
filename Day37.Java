package Arull;

import java.util.Scanner;

public class Java1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //day37 menentukan bilangan ganjil atau genap
        System.out.println("masukkan bilangan 1 : ");
        byte angka1 = in.nextByte();
        System.out.println("masukkan bilangan 2 : ");
        byte angka2 = in.nextByte();
        int total = angka1+angka2;
        System.out.println(total);
        if(total %2==0){
            System.out.println("bilangan genap ");
        }else{
            System.out.println("bilangan ganjil ");
        }
    }
    
}  
