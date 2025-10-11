package Arull;

import java.util.Scanner;

public class Java1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //day34 mengkombinasikan berbagai operator
        System.out.print("masukkkan penjualan produk A :");
        int A = in.nextInt();
        System.out.print("masukkkan penjualan produk B :");
        int B = in.nextInt();
        int total = A+B;
        System.out.println(total);
       if (A>=100000 && B>=100000 && total>=500000){
           System.out.println("Status :"+"TARGET TECAPAI");
    }else {
           System.out.println("Target tidak tercapai");
        
       }
    }
    
} 
