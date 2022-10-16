
package evenodd;

import java.util.Scanner;

/**
 * @author Umair-2k22/CSE/113
 */
public class Evenodd {

    public static void main(String[] args) {
    
   System.out.println("Enter any number");
    Scanner sc=new Scanner(System.in);
    int a;
    a= sc.nextInt();
  
   if(a%2==0) 
   System.out.println("number is even");
    else
        System.out.println("number is odd");
    }
}