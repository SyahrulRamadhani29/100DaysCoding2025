package Arull;

import java.util.Scanner;

public class Java1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //day 86 menentukan nilai miniml array
        int arr[]=new int[5];
        for (int i = 0; i <arr.length; i++) {
            arr[i]=in.nextInt();
        }
        int min=arr[0];
        for (int i = 0; i <arr.length; i++) {
            if(arr[i]<=min){
                min=arr[i];
            }
        }
        System.out.println("Nilai minimal array adalah "+min);
    }
}
