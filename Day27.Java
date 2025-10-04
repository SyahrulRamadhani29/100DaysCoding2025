package Arul1;

import java.util.Scanner;

public class Java {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Jumlah pulsa :");
        int pulsa = in.nextInt();
        int harga = pulsa*10000;
        System.out.println("Sebelum: "+harga);
        int hargaT = harga+2000;
        System.out.println("Sesudah: "+hargaT);
       
}
}
