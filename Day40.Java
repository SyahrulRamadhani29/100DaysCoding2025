package Arull;

import java.util.Scanner;

public class Java1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      //latihan membuat kalkulator day 40
        System.out.print("masukkan angka pertama : ");
        int angka1 = in.nextInt();
        System.out.print("masukkan operator (+,-,*,/,% : ");
        char operator = in.next().charAt(0);
        System.out.print("masukkan angka kedua : ");
        int angka2 = in.nextInt();
        int hasil=0;
        if(operator == '+'){
           hasil = angka1+angka2;
            System.out.println("hasil penjumlaha :"+hasil);
        }else if(operator == '-'){
        hasil = angka1-angka2;
            System.out.println("hasil pengurangan :"+hasil);
         }else if( operator == '*'){
             hasil =angka1*angka2;
             System.out.println("hasil perkalian :"+hasil);
         }else if (operator == '/'){
             hasil =angka1/angka2;
             System.out.println("hasil pembagian :"+hasil);
         }else if (operator == '%'){
            hasil = angka1%angka2;
            System.out.println("hasil modulus :"+hasil);
         }
    }
    
}  
