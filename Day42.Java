package Arull;

import java.util.Scanner;

public class Java1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//day 42 menentukan gaji bersih
        System.out.print("masukkan nama karyawan :");
        String nama = in.nextLine();
        System.out.print("masukkan gaji pokok :");
        int gaji = in.nextInt();
        System.out.print("status karyawan (tetap/kontrak) :");
        String status = in.next();
       double tunjangan = 0;
       double pajak = 0;
       double gajibersih =0;
       if(status.equalsIgnoreCase ("tetap") ){
           tunjangan = 0.20 *gaji;
           pajak = 0.10*(gaji+tunjangan);
           gajibersih =(gaji+tunjangan)-pajak;
       }else if(status.equalsIgnoreCase ("kontrak")){
           tunjangan = 0.10*gaji;
           pajak = 0.05*(gaji+tunjangan);
           gajibersih =(gaji+tunjangan)-pajak;
       }
        System.out.println();
        System.out.println("nama karyawan = "+nama);
        System.out.println("gaji pokok = "+gaji);   
        System.out.println("tunjangan = "+tunjangan);   
        System.out.println("pajak = "+pajak);   
        System.out.println("gaji bersih = "+gajibersih);   
    }
    
}  
