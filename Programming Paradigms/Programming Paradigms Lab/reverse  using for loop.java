//Program to find Reverse of given number
//Program done by Deepak R
package reverse;

import java.util.Scanner;

public class Reverse {
   public static void main(String[] args) {
           Scanner Sc =new Scanner(System.in);
       System.out.printf("enter the number = ");
       int number= Sc.nextInt();
       int reverse=0;
       int digit;
       for ( ;number!=0;number=number/10 ){
           digit=number%10;
           reverse=reverse*10 + digit;
                
       }
       System.out.println("Reverse of the Given number is "+reverse);
    }
}
