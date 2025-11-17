package aruls;

import java.util.Scanner;
public class java {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //day 71  Membuat Pola Segi Tiga Siku-siku
        
         for (int i = 1; i <= 7; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
