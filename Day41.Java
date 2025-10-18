package AarulJava;
import java.util.Scanner;
        public class java {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
 System.out.print("masukkan HP karakter: ");
        int hp = in.nextInt();
        System.out.print("masukkan MP karakter: ");
        int mp = in.nextInt();
        System.out.print("apakah karakter terkena silance ? (true/false) : ");
        boolean isSilence = in.nextBoolean();
        if(hp <=30 && mp >=50  && isSilence !=true  ){
            System.out.println("Skil spesial aktif! ");
        }else {
            System.out.println("Skil spesial gagal digunakan ");
        }

    }
  
}
