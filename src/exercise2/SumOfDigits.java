package exercise2;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
      System.out.print("eine Zahl zwischen 0 und 999 eingeben: ");
        Scanner input = new Scanner(System.in);
        int number=input.nextInt();
        int d1= number%10;
        int a=number/10;
        int d2=a%10;
        int a1=a/10;
        int d3=a1%10;
        int sum = d1 + d2 +d3;
        System.out.println(sum);
    }
}
