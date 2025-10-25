package Arull;

import java.util.Scanner;

public class Java1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //day 48 membuat kalkolator menggunakan Switch case
        

        double angka1, angka2, hasil;
        char operator;

        System.out.println("=== KALKULATOR SEDERHANA ===");
        System.out.print("Masukkan angka pertama: ");
        angka1 = in.nextDouble();

        System.out.print("Masukkan operator (+, -, *, /, %): ");
        operator = in.next().charAt(0);

        System.out.print("Masukkan angka kedua: ");
        angka2 = in.nextDouble();

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                System.out.println("Hasil: " + hasil);
                break;
            case '-':
                hasil = angka1 - angka2;
                System.out.println("Hasil: " + hasil);
                break;
            case '*':
                hasil = angka1 * angka2;
                System.out.println("Hasil: " + hasil);
                break;
            case '/':
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                    System.out.println("Hasil: " + hasil);
                } else {
                    System.out.println("Error: Pembagian dengan nol tidak diperbolehkan!");
                }
                break;
            case '%':
                hasil = angka1 % angka2;
                System.out.println("Hasil: " + hasil);
                break;
            default:
                System.out.println("Operator tidak valid!");
        }

        System.out.println("==============================");
    }
    }
