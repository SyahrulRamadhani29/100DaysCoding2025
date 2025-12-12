
package aruls1;

import java.util.Scanner;


public class voidJava {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        System.out.println("Penjulahan: "+arit(a,b));
        System.out.println("Pengurangan : "+arit1(a,b));
        System.out.println("perkalian : "+ac(a,b));
        System.out.println("pembagian : "+de(a,b));
    }
    static int arit(int a,int aa){
       return a+aa;   
    }
    static int arit1(int b,int bb){
       return b-bb;   
    }
    static int ac(int c,int cc){
        return c*cc;
    }
  static int de(int d,int dd){
      return d/dd;
  }
}
