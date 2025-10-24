package Arull;

import java.util.Scanner;

public class Java1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //day47 program untuk menentukan hari
        System.out.println("? PROGRAM PENENTU HARI ?");
        System.out.println("--------------------------");
        System.out.print("Masukkan angka (1-7): ");
        int angka = in.nextInt();

        switch (angka) {
            case 1:
                System.out.println("Hari yang kamu pilih = Senin");
                System.out.println("Pesan : Awali minggu dengan semangat baru!");
                break;
            case 2:
                System.out.println("Hari yang kamu pilih = Selasa");
                System.out.println("Pesan : Saatnya produktif dan fokus pada tujuan!");
                break;
            case 3:
                System.out.println("Hari yang kamu pilih = Rabu");
                System.out.println("Pesan : Tengah minggu, tetap semangat berjuang !");
                break;
            case 4:
                System.out.println("Hari yang kamu pilih = Kamis");
                System.out.println("Pesan : apakah ada matkul yang pindah keti?");
                break;
            case 5:
                System.out.println("Hari yang kamu pilih = Jum'at");
                System.out.println("Pesan : Kuliah memang penting Jum'atan utamain!");
                break;
            case 6:
                System.out.println("Hari yang kamu pilih = Sabtu");
                System.out.println("Pesan : Santai dulu ga sihh  bang!");
                break;
            case 7:
                System.out.println("Hari yang kamu pilih = Minggu");
                System.out.println("Pesan : Besok senin harus tidur Cepat!");
                break;
            default:
                System.err.println("invalid !!!");
                System.err.println("Pesan : pilih ulang angka 1-7!");
                break;
        }
    }

}
