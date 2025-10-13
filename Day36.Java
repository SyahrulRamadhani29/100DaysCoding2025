package Arull;

import java.util.Scanner;

public class Java1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      //day 36 nested if 
        System.out.print("masukan total belanja : ");
        int belanja = in.nextInt();
        System.out.print("status member : ");
        boolean status = in.nextBoolean();
        double diskon =0;
        if (status == true){
            if(belanja>=500000){
                diskon =0.20*belanja;
            }else if (belanja>=200000){
                diskon = 0.10*belanja;
            } else if (belanja<200000){
                diskon = 0.5*belanja;
            }            
        }else{
            if(belanja>=500000){
                diskon = 0.10*belanja;
            }else if(belanja<500000){
                diskon = 0;
            }
        }
        int diskon1 = (int)(diskon);
        System.out.println("diskon "+diskon1);
        System.out.println("total bayar setelah diskon "+(belanja-diskon1));
    }
    
}  
