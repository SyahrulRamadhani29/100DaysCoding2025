package Arull;

import java.util.Scanner;

public class Java1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //day 39 membuat menu menggunakan if
        System.out.println("\t<===> Daftar Menu <===> Harga <===>");
        System.out.println("\t    1. Bakso "+"\t     Rp.15000 ");
        System.out.println("\t    2. Mie Ayam "+"\t     Rp.15000 ");
        System.out.println("\t    3. Lalapan "+"\t     Rp.25000 ");
        System.out.println("\t    4. Es Teh "+"\t     Free ");
        System.out.println("\t<=================================>");
        System.out.println("\t<=> Pesan Satu aja Lagi main FF <=>");
        String a = "Bakso";
        String b = "Mie Ayam";
        String c = "Lalapan";
        String d = "Es Teh";

        System.out.print("\n\n\tmasukkan nama pesanan : ");
        String p = in.nextLine();
        int harga =0;
        if (p.equalsIgnoreCase(a)) {
            harga += 15000;
            System.out.println("\tpesanan anda " + a + " dan free " + d);
            System.out.println("\tYang harus anda bayar Rp." + harga);
        } else if (p.equalsIgnoreCase(b)) {
            harga += 15000;
            System.out.println("\tpesanan anda " + a + " dan free " + d);
            System.out.println("\tYang harus anda bayar Rp." + harga);
        } else if (p.equalsIgnoreCase(c)) {
            harga += 25000;
            System.out.println("\tpesanan anda " + a + " dan free " + d);
            System.out.println("\tYang harus anda bayar Rp." + harga);
        }
        System.out.println("\n");
        System.out.println("\tsilahkan bayar di sini");
        System.out.println("\t=======================");  
        System.out.println("\t    PEMBAYARAN QRIS    ");
        System.out.println("\t=======================");
        System.out.println("\t|                      |");
        System.out.println("\t|      [#######]       |");
        System.out.println("\t|      [## QR ##]      |");
        System.out.println("\t|      [## QR ##]      |");
        System.out.println("\t|                      |");
        System.out.println("\t| Scan Kode Untuk Bayar|");
        System.out.println("\t=======================");
        System.out.println("\tMerchant : warung Arul ");
        System.out.println("\tTotal    : "+harga      );
        System.out.println("\t=======================");
        System.out.println("\tTerima kasih telah berbelanja!");
    }
    
}  
