package exercise2;

import java.util.Scanner;

public class EvenOrOddNumber {
    public static void main(String[] args) {
     System.out.print("Geben Sie eine Zahl:");
     Scanner input = new Scanner(System.in);
      int number = input.nextInt();
      if(number%2 == 1){
      System.out.println("Number is odd ");
    }else {
    System.out.println("Number is even");
    }
   }
  }

