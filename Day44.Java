package Arull;

import java.util.Scanner;

public class Java1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
 //program predikat nilai (A,B,C,D,E)
        System.out.print("masukkan nama mahasiswa :");
        String nama =in.nextLine();
        System.out.print("masukkan nilai UTS :");
        int uts=in.nextInt();
        System.out.print("masukkan nilai UAS :");
        int uas=in.nextInt();
        System.out.print("masukkan nilai tugas :");
        int tugas=in.nextInt();
        System.out.print("masukkan nilai kehadiran :");
        double kehadiran =in.nextDouble();
        double prskhdr = kehadiran/16.0*100.0; 
        double total =(uts *0.30)+(uas*0.30)+(tugas*0.25)+(prskhdr*0.15);
        System.out.println("Nama Mahasiswa "+nama);
        System.out.println("Total nilai "+total);
        if(total<=30&&total>=0){
            System.out.println("Predikat nilai : E");
        }else if(total<=60){
            System.out.println("Predikat nilai : D");
        }else if(total<=75){
            System.out.println("Predikat nilai : C");
        }else if(total<=80){
            System.out.println("Predikat nilai : B");
        }else if(total<=100){
            System.out.println("Predikat nilai : A");
        }else{
            System.out.println("nilai tidak valid");
        }
    }
