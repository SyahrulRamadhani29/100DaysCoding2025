package aruls;

import java.util.Scanner;
public class java {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // day 74 do while: Membuat Menu Berulang
        do{
            System.out.println("===Menu Makanan===");
            System.out.println("1. Ikan goreng ");
            System.out.println("2. ayam goreng ");
            System.out.println("3. bakso ");
            System.out.println("4. Pangsit ");
            System.out.println("5. batalkan pesanan ");
            System.out.println("Pili menu di atas :");
            int menu = in.nextInt();
            switch(menu){
                case 1->{
                    System.out.println("Anda  memilih menu Ikan Goreng");
                }case 2->{
                    System.out.println("Anda memilih menu Ayam goreng");
                }case 3->{
                    System.out.println("Anda memilih menu Bakso");
                }case 4->{
                    System.out.println("Anda memilih menu pangsit");
                }case 5->{
                    System.out.println("pesanan batal");
                    return;
                }default->{
                    System.out.println("Pilihan tidak valid pilih ulang");
                }
            }
        }while(true);
    }
}
