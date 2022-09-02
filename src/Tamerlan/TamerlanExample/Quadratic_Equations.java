package Tamerlan.TamerlanExample;

import java.util.Scanner;

public class Quadratic_Equations {
    public static void main(String[] args) {
        // a = 1
        //b = 5
        //c = 2
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a");
        double a= input.nextDouble();
        System.out.println("Enter b");
        double b= input.nextDouble();
        System.out.println("Enter c");
        double c= input.nextDouble();

        double result=b*b-4*a*c;

        if (result>0.0) {
            double r1 = (-b + Math.pow(result, 0.5)) / (2.0 * a);
            double r2 = (-b - Math.pow(result, 0.5)) / (2.0 * a);
            System.out.println("The roots are" + r1 + "and" + r2);
        }else if (result==0) {
            double r1 = -b / (2.0 * a);
            System.out.println("The roof is" + r1);
        }else {
            System.out.println("The equation has no real roots");


        }

    }
}
