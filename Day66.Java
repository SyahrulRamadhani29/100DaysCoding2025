package Arull;

import java.util.Scanner;

public class Java1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //day 56 membuat pola vertikal
        System.out.print("Masukkan angka N :");
        int N = in.nextInt();
        for (int i = 1; i <=N; i++) {
            System.out.println("*");
        }
      in.close();
    }
}
