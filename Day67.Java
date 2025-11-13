package Arull;

import java.util.Scanner;

public class Java1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //day 67 Membuat Pola Horizontal
        System.out.print("Masukkan angka N :");
        int N = in.nextInt();
        for (int i = 1; i <=N; i++) {
            System.out.print("*");
        } 
        System.out.println();
      in.close();
    }
}
