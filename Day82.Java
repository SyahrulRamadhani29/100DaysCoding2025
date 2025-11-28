package Arull;

import java.util.Scanner;

public class Java1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //day 82 Mengisi Elemen Array dan Menampilkan semua elemen Array dengan Perulangan
        String arr[]= new String[5];
        System.out.println("Masukkan 5 indeks kalimat :");
        for (int i = 0; i <arr.length; i++) {
            arr[i]=in.nextLine();
        }
        System.out.print("isi array :");
        for(String a : arr){
            System.out.print(a+",");
        }
        in.close();
    }
}
