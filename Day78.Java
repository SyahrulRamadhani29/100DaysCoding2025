package aruls;

import java.util.Scanner;
public class java {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //day 78 Menggunakan berbgaia Method String
          System.out.print("Masukkan kata/kalimat : ");
        String teks = in.nextLine();

        System.out.println(".isEmpty ? " + teks.isEmpty());

        System.out.println(".length: " + teks.length());

        System.out.println(".toUpperCase: " + teks.toUpperCase());

        System.out.println(".toLowerCase: " + teks.toLowerCase());

        System.out.println(".replace: " + teks.replace(" ", ","));
        
        System.out.println(".trim: " + teks.trim());
        
        if (teks.length() >= 5) {
            System.out.println(".substring(0,5): " + teks.substring(1,3));
        } else {
            System.out.println(".substring(0,5): Teks terlalu pendek");
        }
    }
}
