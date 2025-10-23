package Arull;

import java.util.Scanner;

public class Java1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//day 46 membuat menu menggunakan switch case
        System.out.println("\t    <=== Daftar Menu ===>   ");
        System.out.println("\t\t~~~Makanan~~~");
        System.out.println("\t1. Ayam Bakar Madu \tRp 20.000");
        System.out.println("\t2. Nasi goreng seafood \tRp 18.000");
        System.out.println("\t3. Sate Kambing \t\tRp 20.000");
        System.out.println("\t4. Ayam goreng Lalapan \tRp 20.000");
        System.out.println("\t\t~~~Minuman~~~");
        System.out.println("\t1. Matcha \tRp 20.000");
        System.out.println("\t2. Thai Tea \tRp 18.000");
        System.out.println("\t3. Green Tea \tRp 18.000");
        System.out.println("\t4. Coklat \tRp 18.000");
        
        
        System.out.print("\nmasukkan pesanan Makanan pilih(1-4) : ");
        int  makanan =in.nextInt();
         System.out.print("Masukkan pesanan minuman pilih(1-4) :");
        int minuman = in.nextInt();
        int harga1=0;
        int harga2=0;
        switch (makanan) {
            case 1:
                System.out.println("Pesanan anda Ayam bakar madu");
                harga1+=20000;
                break;
            case 2:
                System.out.println("Pesanan anda Nasi goreng seafood");
                harga1+=18000;
                break;
            case 3:
                System.out.println("Pesanan anda Sate Kambing");
                harga1+=20000;
                break;
            case 4:
                System.out.println("Pesanan anda Ayam goreng Lalapan");
                harga1+=20000;
                break;
            default:
                System.out.println("Pesanan anda tidak ada dalam menu");
                break;
        }
       
        switch(minuman){
            case 1:
                System.out.println("Pesanan anda Matcha");
                harga2+=20000;
                break;
            case 2:
                System.out.println("Pesanan anda Thai Tea");
                harga2+=18000;
                break;
            case 3:
                System.out.println("Pesanan anda Green Tea");
                harga2+=18000;
                break;
            case 4:
                System.out.println("Pesanan anda Coklat");
                harga2+=18000;
                break;
            default:
                System.out.println("Pesanan anda tidak ada dalam menu");
                break;
        }
        int total =harga1+harga2;
        System.out.println("Total harga pesanan anda Rp"+total);
    }
    
}  
