package Arull;

import java.util.Scanner;

public class Java1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //day60 mencetak angka ganjil N-1 dan angka genap N-1
        System.out.print("Masukkan angka N :");
        int N = in.nextInt();
        
        System.out.print("angka ganjil :");
        for (int i = N; i >= 1; i--) {
            if (i % 2 != 0) {
                System.out.print(i+"");
            if(i!=1){
                System.out.print(", ");
            }
            }
            
        }
        System.out.print("\nangka genap :");
        for (int j = N; j >= 1; j--) {
            if (j % 2 == 0) {
                System.out.print(j+"");
                 if(j!=2){
                System.out.print(", ");
            }
            }

        }
        System.out.println();
        in.close();

    }
}
