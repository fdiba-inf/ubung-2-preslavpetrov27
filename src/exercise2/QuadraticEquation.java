package exercise2;
import java.util.Scanner;

public class QuadraticEquation {
  public static void main(String[] args) {
    System.out.println("Start");
    System.out.print ("a:");
    System.out.print ("b:");
    System.out.print ("c:");
    Scanner input= new Scanner(System.in);
    
    double a = input.nextInt();
    
     double b= input.nextInt();
   
     double c= input.nextInt();

     double x;
     double equation = (a*x*x + b*x + c = 0);
     double D = b*b - 4*a*c;
     double X1 = (-b + Math.sqrt(D)) / 2*a;
      double X2 = (-b - Math.sqrt(D)) / 2*a;
     if(a!=0) {
       if(D>=0) {
       System.out.println("x1= "+ X1);
       System.out.println("x2= "+ X2);
       }else {
         System.out.println("Imagenary values");
       }

     }else {
       if(b!=0){
         System.out.println("x1= "+ X1);
       }else {
         if (c!=0) {
           System.out.println("No values");
         }else{
           System.out.println("Many values");
         }
         }
       }


       }
       
     }
   