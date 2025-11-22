package aruls;

import java.util.Scanner;
public class java {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //day 76 Method String untuk Pengecekan (equals(), equalIgnoreCase(), contains(), isEmpty()).
    
        System.out.print("Masukkan anu e kata: ");
        String kata = in.nextLine();
        if (kata.contains("sd")) {
            System.out.println("COUBTENS : aku sd (sadar diri)");
        }if (kata.equals("smp")) {
            System.out.println("EQUALS : sama papa mama (kelurga cemara)");
        }if (kata.equalsIgnoreCase("sma")) {
            System.out.println("EQUALS IGNORCASE : sayang ama ayang (lope)");
        }if (kata.isEmpty()) {
            System.out.println("isEmpty");
        }

    }
}
