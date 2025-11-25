package aruls;

import java.util.Scanner;
public class java {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Day 79 Membuat Akun dan Login Ke Akun (Menggunakan loop berhenti ketika user dan pwnya benar)
        do {
            System.out.print("Masukkan user name anda  :");
            String user = in.next();
            System.out.print("Masukkan pasword anda : ");
            int pw = in.nextInt();
            if (user.equalsIgnoreCase("arul") && pw == 1234){
                System.out.println("Login berhasil");
                return;
            }else{
                System.out.println("pasword yang anda masukkan salah atau username salah");
            }      
        } while (true);
        
    }
}
