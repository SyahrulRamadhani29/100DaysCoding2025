package aruls;

import java.util.Scanner;
public class java {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //day 77 Method String untuk Manipulasi (substring(), replace(), trim())
       String mullet= in.nextLine();
       String aku =mullet.substring(2,5);
        System.out.println(aku);
       String gaje=mullet.replace("a", "n");
        System.out.println(gaje);
       String libur=mullet.trim();
        System.out.println(libur);
    }
}
