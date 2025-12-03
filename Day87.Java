package Arull;

import java.util.Scanner;

public class Java1 {

    public static void main(String[] args) {   
        Scanner in = new Scanner(System.in); 
         // day 87 Mencari Elemen pada Array
        int arr[]={1,2,5,6,7};
        boolean b=false;
        System.out.println("Masukkan angka yang ingin di cari :");
        int a=in.nextInt();
        for (int i = 0; i <arr.length; i++) {
            if(a==arr[i]){
                System.out.println("angka di temukan "+arr[i]);  
                b=true;
                break;
            }
            }
           if(!b){
               System.out.println("invalid");
           } 
    }
}
