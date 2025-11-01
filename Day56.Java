package Arull;

import java.util.Scanner;

public class Java1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("masukkan angka :");
        int angka = in.nextInt();
        if(angka%3==0&&angka%5==0){
            System.out.println("kelipatan 3 dan 5");
        }else if(angka%3==0){
            System.out.println("kelipatan 3");
        }else if(angka%5==0){
            System.out.println("kelipatan 5");
        }else{
            System.out.println("bukan nilai kelipatan ketiga nya");
        }
    }
    
}  
