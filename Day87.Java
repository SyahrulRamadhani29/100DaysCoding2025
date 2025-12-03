package Arull;

import java.util.Scanner;

public class Java1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);        // day 87 Mencari Elemen pada Array
        int arr[]= new int [5];
        for (int i = 0; i <arr.length; i++) {
            arr[i]=in.nextInt();
        }
        System.out.println("Masukkan angka yang ingin di cari :");
        int a=in.nextInt();
        for (int i = 0; i <arr.length; i++) {
            if(arr[i]==a){
                System.out.println("angka di temukan "+arr[i]);  
                break;
            }else{
                System.out.println("angka tidak d temukan indvalid");
                break;
            }
        }
    }
}
