import java.util.*;



public class fibbonacci {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       int b = 0;
        for (int i = 2; ; i++) {
            boolean a = true;
            for (int j = 2; j < i; j++) {
                if (i%j==0) {
                    a = false;
                    break;
                }
            }
            if (a) {
                System.out.println(i+" ");
                b++;
            }
            if (b==n) {
                break;
            }
        }
        
    }
}
