package aruls;

import java.util.Arrays;
import java.util.Scanner;
public class java {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //DAY 80 Array 1D
        String [] array = new String[5];
        System.out.print("Masukkan inputan nama hewan :");
        for (int i = 0; i <array.length; i++) {
            array[i]=in.next();
        }
        System.out.println("isi array inputan :");
        for(String a :array){
            System.out.println(a);
        }
    }
}
