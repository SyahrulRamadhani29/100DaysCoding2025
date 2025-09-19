package Arul;
import java.util.Scanner;
public class Java10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nama,alamat,no;
        int umur;
        double tinggi;
        System.out.print("masukkan nama :");
        nama = in.nextLine();
        System.out.print("masukkan umur :");
        umur = in.nextInt();
        System.out.print("masukkan alamat :");
        alamat = in.next();
        System.out.print("masukkan tinggi :");
        tinggi = in.nextDouble();
        System.out.print("masukkan no hp :");
        no = in.next();
        System.out.println("nama panggilan kamu " + nama);
        System.out.println("umur kamu saat ini " + umur + "tahun");
        System.out.print("alamat kamu berada di" + alamat);
        System.out.printf("\ntinggi kamu berada di %.2f cm " ,tinggi);
        System.out.printf("\nnomor hp kamu yaitu %s " ,no  );
    }
}
