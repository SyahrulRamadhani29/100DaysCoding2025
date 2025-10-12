package Arull;

import java.util.Scanner;

public class Java1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
   //day35 if else
        System.out.println("masukkan nilai arul :");
        short a = in.nextShort();
        
        if (a>=80){
            System.out.println("yeah arul lulus");
        }else if (a<60){
            System.out.println("aduhhh arul tidak lulus");
        }else {
            System.out.println("masa arul mengulang sih");
        }
    }
    
}  
