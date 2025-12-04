package Arull;

import java.util.Scanner;

public class Java1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            // day 88 Mengakses Elemen Array dengan Menggunakan For-each
         int arr[]={9,5,7,8,6};
         System.out.print("ISi array dalam for-easch :");
         for(int a:arr){
             System.out.print(a+",");
         }
         System.out.println();
         in.close();
    }
}
