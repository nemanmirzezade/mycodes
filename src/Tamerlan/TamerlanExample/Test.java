package Tamerlan.TamerlanExample;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if (a > 0) {
            System.out.println("Positive");
        } else if (a < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Number is zero");
        }
    }
}
