package Arul;
import java.util.Scanner;
public class Javao {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String jd;
        double hb;
        int je;
        boolean t;
        System.out.print("Masukkan judul buku :");
        jd = in.nextLine();
        System.out.print("Masukkan harga buku :");
        hb = in.nextDouble();
        System.out.print("Masukkan jumlah eksamplar :");
        je = in.nextInt();
        System.out.println("masukkan true or false :");
        t = in.nextBoolean();
        
        
        
        
        System.out.printf("\nBuku berjudul %s dengan kode rak b berharga Rp %.2f " ,jd ,hb);
        System.out.printf("\njumlah eksplar yang tersedia %d" ,je);
        System.out.printf("\napakah tersedia versi e-book ?%s ",t );
    }
}
