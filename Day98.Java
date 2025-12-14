package aruls;


import java.util.*;
public class java {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        //Latihan: Deretan Fibonacci dari 1-N
        
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int i = 1;
        while (i <= n) {
            System.out.print(a + " ");
            b = a+b;
            a = b-a;
            i++;
        }

    }
}
