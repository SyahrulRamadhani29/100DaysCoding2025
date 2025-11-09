package aruls;

import java.util.Scanner;
public class java {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      //day 63 mengalikan 1-N
        System.out.print("Masukkan angka N :");
        int N = in.nextInt();
        int total=1;
        for (int i = 1; i <=N; i++) {
            System.out.print(i+"");
            if(i!=N){
                System.out.print("*");
            }
                total*=i;
        }
        System.out.println("\nHasil perkalian 1 sampai "+N+" adalah ="+total);
        
    }
}
