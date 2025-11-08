package Arull;

import java.util.Scanner;

public class Java1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Day 62 menjumlahkan 1-N
        System.out.print("Masukkan angka N :");
        int N = in.nextInt();
        int total=0;
        for (int i = 1; i <=N; i++) {
            System.out.print(i+" ");
            if(i!=N){
                System.out.print("+");
            }
            total+=i;
        }
        System.out.println("\nTotal angka 1 sampai "+N+" adalah ="+total);
    }
}
