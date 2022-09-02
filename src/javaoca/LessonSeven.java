////package javaoca;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class LessonSeven {
//
//
//
//
//
//}
//
//class Task1{
//    public static void main(String[] args) {
//
//
//        System.out.println("//exercise 1");
//        System.out.println("\ndivided by 3:");
//        int x = 0;
//        for (int i = 1; i < 100; i++) {
//            if (i % 3 == 0) {
//                x = i;
//                System.out.print(x + ",");
//            }
//        }
//        System.out.println("\ndivided by 5:");
//        int y = 0;
//        for (int i = 1; i < 100; i++) {
//            if (i % 5 == 0) {
//                y = i;
//                System.out.print(y + ",");
//            }
//        }
//        System.out.println("\ndivided by 15:");
//        int z = 0;
//        for (int i = 1; i < 100; i++) {
//            if (i % 15 == 0) {
//                z = i;
//                System.out.print(z + ",");
//            }
//        }
//    }
//}
//
//class TaskTwo{
//    public static void main(String[] args) {
//        System.out.println("// Exercise 2");
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the number");
//        int fact1 = 1;
//        int num = scanner.nextInt();
//        if (num > 0) {
//            int fact = 1;
//
//            for (int i = 1; i <= num; i++) {
//                fact = fact * i;
//
//            }
//            System.out.println(fact);
//        } else {
//            System.out.println("Please enter the positive number");
//        }
//    }
//
//
//}
//
//
//
//
//
//       // System.out.println("--------------------------------------------------------------------------------");
//
//
//
//        //System.out.println("-------------------------------------------------------------------------------");
//
//
//class Task3{
//    public static void main(String[] args) {
//        System.out.println("Exercise 3");
//        Scanner scanner=new Scanner(System.in);
//
//
//        System.out.println("enter the count of students");
//        int n= scanner.nextInt();
//
//        int []scores=new int[11];
//        scores[0]=85;
//        scores[1]=95;
//        scores[2]=87;
//        scores[3]=75;
//        scores[4]=23;
//        scores[5]=27;
//        scores[6]=29;
//        scores[7]=65;
//        scores[8]=75;
//        scores[9]=58;
//        scores[10]=85;
//
//        int sum=0;
//
//        for (int i = 1; i <11; i++) {
//            System.out.println("score of student "+i+" is "+scores[i]);
//
//
//            sum=sum+scores[i];
//
//        }
//        System.out.println("----------");
//        System.out.println("average of students' scores is "+sum/10);
//    }
//}
//
//
//class Task4{
//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("exercise 4");
//        System.out.println("please enter the count of number");
//        int numbercount= scanner.nextInt();
//        int[] array=new int[numbercount];
//        System.out.println("please enter the numbers");
//        int sum=0;
//        for (int i = 0; i <numbercount; i++) {
//
//            int number= scanner.nextInt();
//            array[i]=number;
//            //  System.out.println(array.toString());
//
//            sum=sum+array[i];
//
//
//
//        }
//        System.out.println("------------");
//        System.out.println("the sum of the numbers is: "+sum);
//    }
//}
//
//
//
//class Task5{
//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("exercise 5");
//        int number= scanner.nextInt();
//        for (int i = 1; i <=10 ; i++) {
//            int multiply=number*i;
//            System.out.println(number+"*"+i+"="+multiply);
//
//        }
//    }
//}
//
//
//
//class Task6{
//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Exercise 6");
//        int numb1= scanner.nextInt();
//        if (numb1>0){
//            System.out.println(numb1+" is positive");
//        } else if (numb1==0) {
//            System.out.println("numb1 is zero");
//        }
//        else {
//            System.out.println(numb1+" is negative");
//        }
//    }
//}
//
//
//
//
//class Task7{
//public static void main(String[]args){
//        System.out.println("Exercise 7");
//        Scanner scanner=new Scanner(System.in);
//        int eded= scanner.nextInt();
//        System.out.println((eded>0)?("eded is positive"):("eded is negative"));
//        }
//        }
//
//
//
//    class Task8{
//        public static void main(String[] args) {
//            Scanner scanner=new Scanner(System.in);
//            System.out.println("Exercise 8");
//            System.out.println("enter first number");
//            int number1= scanner.nextInt();
//            System.out.println("enter second number");
//            int number2= scanner.nextInt();
//            System.out.println("enter third number");
//            int number3= scanner.nextInt();
//
//            if (number1>number2 & number1>number3){
//                System.out.println(number1+"  is greatest");
//            }
//
//            else if (number2>number1 & number2>number3) {
//                System.out.println(number2+"  is greatest");
//            }
//            else {
//                System.out.println(number3+"  is greatest");
//            }
//        }
//    }
//
//
//
//
//
//class Task9 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("exercise 9");
//        int dayofweek = scanner.nextInt();
//        if (dayofweek == 1) {
//            System.out.println("today is Monday");
//        } else if (dayofweek == 2) {
//            System.out.println("today is Tuesday");
//        } else if (dayofweek == 3) {
//            System.out.println("today is Wednesday");
//        } else if (dayofweek == 4) {
//            System.out.println("today is Thursday");
//        } else if (dayofweek == 5) {
//            System.out.println("today is Friday");
//        } else if (dayofweek == 6) {
//            System.out.println("today is Saturday");
//        } else if (dayofweek == 7) {
//            System.out.println("today is Sunday");
//        } else {
//            System.out.println("please enter the number between 1 and 7");
//        }
//
//
//    }
//}
//
//
//class Task9a {
//    public static void main(String[] args) {
//
//
//        System.out.println("exercise 9 with switch");
//        Scanner scanner = new Scanner(System.in);
//        int weekday = scanner.nextInt();
//        switch (weekday) {
//            case 1:
//                System.out.println("monday");
//                break;
//            case 2:
//                System.out.println("tuesday");
//                break;
//            case 3:
//                System.out.println("wednesday");
//                break;
//            case 4:
//                System.out.println("thursday");
//                break;
//            case 5:
//                System.out.println("friday");
//                break;
//            case 6:
//                System.out.println("saturday");
//                break;
//            case 7:
//                System.out.println("sunday");
//                break;
//            default:
//                System.out.println("please enter between one and seven");
//        }
//    }
//}
//
//
//    class Task10 {
//        public static void main(String[] args) {
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Exercise 10");
//            System.out.println("enter the first number");
//            int num1 = scanner.nextInt();
//            System.out.println("enter the second number");
//            int num2 = scanner.nextInt();
//            if (num1 > 0 & num2 > 0 & num2 != 0) {
//                int sum = num1 + num2;
//                int multiply = num1 * num2;
//                int subtract = num1 - num2;
//                int division = num1 / num2;
//                int remainder = num1 % num2;
//                System.out.print(sum + " ," + multiply + " ," + subtract + " ," + division + " ," + remainder);
//
//            } else if (num1 < 0 | num2 < 0) {
//                System.out.println("Please enter the positive number");
//
//            } else {
//                System.out.println("second is 0.Please enter the valid second nummber");
//            }
//        }
//    }
//
//
//
//
//
//
//
//
