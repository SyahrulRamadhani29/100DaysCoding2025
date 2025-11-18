package aruls;

import java.util.Scanner;
public class java {
    public static void main(String[] args) {
          //day 72 membuat pola segitiga siku-siku terbalik
            for (int i = 7; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
