package Arul;
import java.util.Scanner;
public class Java3 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        //mengubah tipe data primitif menjadi nonprimitif (Strig)
         double love;
         String loveyou;
         System.out.println("Masukkan apapun :");
         love = in.nextDouble();
         loveyou = Double.toString(love);
         System.out.println("I really like you " + loveyou);
         
    }
}
