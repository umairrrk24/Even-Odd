package arithmatic;

import java.util.Scanner;


public class Arithmatic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n1, n2;
        System.out.println("Enter first Number:");
        n1= sc.nextFloat();
        System.out.println("Enter Second Number: ");
        n2 = sc.nextFloat();

        System.out.println("firstNumber + secondNumber  " + (n1 + n2));
        System.out.println("firstNumber - secondNumber  " + (n1 - n2));
        System.out.println("firstNumber / secondNumber  " + (n1 / n2));
        System.out.println("firstNumber % secondNumber  " + (n1 % n2));
    }
    
}