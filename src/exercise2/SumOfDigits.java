
package exercise2;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("eine Zahl zwischen 0 und 999 eingeben: ");
        
        int number=input.nextInt();
        int a = number % 10;
        int b = (number - a) / 10 % 10;
        int c = (number - b * 10 - a) / 100 % 10;
        int sum = a + b + c;
        System.out.println(sum);
    }
}