package aruls;

import java.util.Arrays;
import java.util.Scanner;
public class java {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        //day keyword return
        double a=in.nextDouble();
        double t=in.nextDouble();
        System.out.println(segitiga(a,t));
    }
    static double segitiga(double a,double t){
        return 0.5*a*t;
    }
}
