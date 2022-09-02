package Tamerlan.TamerlanExample;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int number= input.nextInt();

        if (number<1)
            System.out.println("the number is small");
        if (number<0)
            System.out.println("the number is negative");
        if (number>0)
            System.out.println("the number is positive");
        if (number==0)
            System.out.println("number is zero");
        if (number>1000000)
            System.out.println("number is large");

        }


    }




