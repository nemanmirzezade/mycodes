package exercise;

import java.util.Scanner;

public class tapsiriq1 {
    public static void main(String[] args) {
        Scanner scaner=new Scanner(System.in);
        //exercise 3
//        System.out.println("3 reqemli eded daxil et: ");
//        int a= scaner.nextInt();
//        int b=a/100;
//        int c=a%100;
//        int d=c/10;
//        int e=c%10;
//        int result=b+d+e;
//        System.out.println(result);
//        if (result%3==0){
//        System.out.println("ugurlu");}
//        else
//        System.out.println("ugursuz");

            //exercise 4
//        System.out.println("dord reqemli eded daxil edin: ");
//        int a= scaner.nextInt();
//        int x=a/100;
//        if (x<100){
//            System.out.println("eded dord reqemlidir");
//        }
//        else if(x>100){
//            System.out.println("zehmet olmasa dord reqemli eded daxil edin");}
//
//        int b=a/1000;
//        int c=a/100;
//        int d=c%10;
//        int e=a/10;
//        int f=e%10;
//        int g=a%10;
//        int h=a%100;
//        int result=b+d+f+g;
//        System.out.println("dordreqemli ededin reqemleri cemi: "+result);
//        if (h%4==0){
//            System.out.println("eded 4-e tam bolunur");
//        }
//        else
//            System.out.println("eded 4-e bolunmur");


            //exercise 5

//        System.out.println("3 reqemli eded daxil et");
//        int a= scaner.nextInt();
//
//        int firstnum=a/100;
//        int thirdnum=a%10;
//        int x=a%100;
//        int secondnum=x/10;
//        System.out.println(thirdnum+""+secondnum+""+firstnum);

            // exercise 6

//        System.out.println("4 reqemli eded daxil et");
//        int a= scaner.nextInt();
//
//        int firstTwodigit=a/100;
//        int lastTwodigit=a%100;
//        int result=firstTwodigit-lastTwodigit;
//        System.out.println(result);

           // exercise 1

        System.out.println("enter two sides of triangle");
        System.out.println("hypothenus: ");
        int hypo= scaner.nextInt();

        System.out.println("first side: ");
        int firstSide= scaner.nextInt();

        int a=hypo*hypo;
        int b=firstSide*firstSide;
        int c=a-b;
        double thirdSide=Math.sqrt(c);
        if (firstSide+hypo<thirdSide){
            System.out.println("this triangle is not exist");
        }
        else


        System.out.println("third side:"+Math.sqrt(c));



    }
}
