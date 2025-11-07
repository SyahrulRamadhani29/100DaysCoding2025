package Arull;

import java.util.Scanner;

public class Java1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

          //day 61 kelipatab m
          System.out.print("Masukkann anngka N :");
          int N =in.nextInt();
          System.out.print("Masukkann anngka M :");
          int M = in.nextInt();
          for (int i = 1; i <= N; i++) {
            if(i%M==0){
                System.out.println(i+" ");
            }
        }
          in.close();
    }
}
