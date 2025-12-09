package aruls;


import java.util.*;
public class java {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        //Day93 Method ceil(), floor() dan round()
        System.out.print("Masukkan angka desimal : ");
        double angka=in.nextDouble();
        System.out.println(Math.ceil(angka));
        System.out.println(Math.floor(angka));
        System.out.println(Math.round(angka));
    }
}
