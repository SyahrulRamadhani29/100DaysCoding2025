package Arull;

import java.util.Scanner;

public class Java1 {

    public static void main(String[] args) {
        //day 83 Menjumlahkan Elemen Array
        int arr[]={10,20,30,40,50};
        int total=0;
        for (int i = 0; i <arr.length; i++) {
            total+=arr[i];
        }
        System.out.println("Total isi array :"+total);
    }
}
