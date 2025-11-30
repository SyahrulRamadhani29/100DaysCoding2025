
package vip;

import java.util.Scanner;

public class Java {
    public static void main(String[] args) {
        //Day84 evaluasi
        int arr1[]={1,2,3,4,5};
        int arr2[]={1,4,8,9,5};
        for (int i = 0; i < arr1.length; i++) {
            
         for (int j = 0; j < arr2.length; j++) {
            if(arr1[i]==arr2[j]){
               
             System.out.println(arr1[i]);
            }
        }
            
        }
    }
  
}
