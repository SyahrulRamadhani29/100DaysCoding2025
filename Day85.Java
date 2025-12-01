package Arull;

import java.util.Scanner;

public class Java1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //day 85  Menentukan Angka Maksimal Array
        int arr[]=new int[5];
        int max=0;
        for (int i = 0; i <arr.length; i++) {
            arr[i]=in.nextInt();
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("nilai maximum elemen array adalah "+max);
    }
}
