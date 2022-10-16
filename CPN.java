package cpn;

import java.util.Scanner;
public class Cpn {

    
    public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
        System.out.println("enter your matriculation percentage:");
        double a,i,cpn;
        int test;
        a =sc.nextDouble();
        System.out.println("enter your intermediate percentage:");
        i=sc.nextDouble();
        System.out.println("enter your entry test marks:");
        test=sc.nextInt();
        cpn=((a*0.1)+(i*0.3)+(test*0.7));
      System.out.println("your CPN is:"+cpn);
    }
    
}