package javaoca;

import java.util.Scanner;

public class Task7app {
    public static void main(String[] args) {
        System.out.println("Task 1");
        Scanner scanner=new Scanner(System.in);
        Taask7 task=new Taask7();
        task.divsionTak1();
        System.out.println("");

        System.out.println("------------------------------------------------------");
        System.out.println("Task 2");

        System.out.println("enter the number and calculate factorial");
        int num= scanner.nextInt();

        task.FindFactorial(num);

        System.out.println("------------------------------------------------------");


        System.out.println("Task 3");
        task.StudentScoreAve();

        System.out.println("------------------------------------------------------");
        System.out.println("Task 4");

        int numbercount= scanner.nextInt();
        int[] array=new int[numbercount];
        System.out.println("please enter the numbers");
        int sum=0;
        for (int i = 0; i <numbercount; i++) {

            int number = scanner.nextInt();
            array[i] = number;
            //  System.out.println(array.toString());

            sum = sum + array[i];
        }
        System.out.println("the sum of the numbers is: "+sum);


        System.out.println("------------------------------------------------------");

        System.out.println("Task 5");
        int number= scanner.nextInt();
        for (int i = 1; i <=10 ; i++) {
            int multiply=number*i;
            System.out.println(number+"*"+i+"="+multiply);

        }

        System.out.println("------------------------------------------------------");
        System.out.println("Task 6");
        int numb1= scanner.nextInt();
        if (numb1>0){
            System.out.println(numb1+" is positive");
        } else if (numb1==0) {
            System.out.println("numb1 is zero");
        }
        else {
            System.out.println(numb1+" is negative");
        }

        System.out.println("------------------------------------------------------");

        System.out.println("Task 7");

        int eded= scanner.nextInt();
        System.out.println((eded>0)?("eded is positive"):("eded is negative"));

        System.out.println("------------------------------------------------------");

        System.out.println("Task 8");
        System.out.println("Exercise 8");
        System.out.println("enter first number");
        int number1= scanner.nextInt();
        System.out.println("enter second number");
        int number2= scanner.nextInt();
        System.out.println("enter third number");
        int number3= scanner.nextInt();

        if (number1>number2 & number1>number3){
            System.out.println(number1+"  is greatest");
        }

        else if (number2>number1 & number2>number3) {
            System.out.println(number2+"  is greatest");
        }
        else {
            System.out.println(number3+"  is greatest");
        }

        System.out.println("------------------------------------------------------");
                System.out.println("exercise 9");
        int dayofweek=scanner.nextInt();
        if (dayofweek==1){
            System.out.println("today is Monday");
        } else if (dayofweek==2) {
            System.out.println("today is Tuesday");
        }
        else if (dayofweek==3) {
            System.out.println("today is Wednesday");
        }
        else if (dayofweek==4) {
            System.out.println("today is Thursday");
        }
        else if (dayofweek==5) {
            System.out.println("today is Friday");
        }
        else if (dayofweek==6) {
            System.out.println("today is Saturday");
        }
        else if (dayofweek==7) {
            System.out.println("today is Sunday");
        }

        else {
            System.out.println("please enter the number between 1 and 7");
        }

        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("exercise 9 with switch");
        int weekday= scanner.nextInt();
        switch (weekday){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("please enter between one and seven");
        }

        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Task 10");
        System.out.println("enter the first number");
        int num1= scanner.nextInt();
        System.out.println("enter the second number");
        int num2= scanner.nextInt();
        if (num1>0 & num2>0 & num2!=0){
            int cem=num1+num2;
            int multiply=num1*num2;
            int subtract=num1-num2;
            int division=num1/num2;
            int remainder=num1%num2;
            System.out.print(sum+" ,"+multiply+" ,"+subtract+" ,"+division+" ,"+remainder);

        } else if (num1<0 | num2<0) {
            System.out.println("Please enter the positive number");

        }
        else
        {
            System.out.println("second is 0.Please enter the valid second nummber");
        }









    }
}
