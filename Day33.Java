package Arull;

import java.util.Scanner;

public class Java1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //day33 operator logika not(!)
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        boolean d = !(a>b) && (c<b)  ;
        System.out.println(d);
        
    }
} 
