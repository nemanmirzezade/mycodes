package exercise;//import java.util.Scanner;
//
//public class iteration {
//    public static void main(String[] args) {
        //for (int i = 1; i <=10; i++) {
        //    System.out.println(i);

       // }
//            int sumnumber=0;
//
//        for (int i = 1; i <=10; i++) {
//             sumnumber=sumnumber+i;
//
//        }
//        System.out.println(sumnumber);
//       Scanner scanner=new Scanner(System.in);
//       int num;
//
//        System.out.println("Enter any positive nymber:");
//        num= scanner.nextInt();
//        System.out.println("Multiplication Table of "+num);
//
//        for (int i = 1; i <10 ; i++) {
//
//            System.out.println(num+"x"+i+"="+(num*i));

//        }

import java.util.*;

        public class isItPresent {

            public static void main(String[] args) {

                Scanner input = new Scanner(System.in);

                int [] a = new int[10];

                boolean present = true;

                for(int i = 0; i < a.length; i++) {

                    a[i] = input.nextInt();//take 10 inputs from the user

                }

                System.out.println("Please enter the number you want to check: ");

                int number = input.nextInt();

                for(int j : a)

                    if(j != number)

                        present = false;

                System.out.println(present);

            }

        }




//    }
//}
