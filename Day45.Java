package Arull;

import java.util.Scanner;

public class Java1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//day45 percabangan switch case
        System.out.println("<=== Pilih Jenis Hp ===>");
        System.out.println("\t1. Hp Iphone ");
        System.out.println("\t2. Hp Samsong ");
        System.out.println("\t3. Hp Kentang ");
        System.out.println("\t4. Hp Jadul ");
        System.out.println("masukkan kategori hp anda (1-4) :");
        int hp =in.nextInt();
        switch(hp){
            case 1:
                System.out.println("Kamu anak sutan yaaaa?");
                break;
            case 2:
                System.out.println("wahh kamu kerenn hpnya samsong");
                break;
            case 3:
                System.out.println("Waduh itu hp atau kentang burik banget");
                break;
            case 4:
                System.out.println("kamu habis keluar dari goa yaa?");
                break;
            default :
                System.err.println("hp kamu jenis apa nihh kok ga ada di pilihan");
        }
    }
    
}  
