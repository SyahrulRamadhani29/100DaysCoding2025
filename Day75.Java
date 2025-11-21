
package aruls;

import java.util.Scanner;
public class java {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       //day 75 Method String Dasar (length(), toUpperCase(), toLowerCase()) 
 	 System.out.print("Masukkan kata/kalimat: ");
        String nama = in.nextLine();
        

        System.out.println("Length: " + nama.length());
        System.out.println("toUppercase: " + nama.toUpperCase());
        System.out.println("toLowercase: " + nama.toLowerCase());

    }
}
