
package aruls;

import java.util.Scanner;
public class java {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //day 69 
        System.out.print("Masukkkan jumlah jam :");
        int jam = in.nextInt();
        int menit =1;
        for (int i = 1; i <=jam; i++) {
            menit=jam*60;
        }
        System.out.println(menit); 
        in.close();
    }
}
