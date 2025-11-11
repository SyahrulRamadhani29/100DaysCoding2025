package Arull;

import java.util.Scanner;

public class Java1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //day 65 Membuat Bilangan Faktorial
        System.out.print("Masukkan bilngan N :");
        int N = in.nextInt();
        int total =1;
        String a ="!";
        for (int i = N; i >= 1; i--) {  
            total*=i;
        }
        System.out.println(N+a);
        System.out.println("Hasil Faktorial dari "+N+" adalah "+total);
    }
}
