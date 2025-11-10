package Arull;

import java.util.Scanner;

public class Java1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //day 64  Mencetak hasil M pangkat N
        System.out.print("Masukkan angka M :");
        int M = in.nextInt();
        System.out.print("Masukkan pangkat N :");
        int N =in.nextInt();
        int total =1;
        for (int i = 1; i <= N; i++) {
            total*=M;
        }
        System.out.println(total);
    }
}
