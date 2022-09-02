package mathematics;

import java.util.Scanner;

public class maxmin {

        //Exercise 1
//    public static void main(String[] args) {
//        Scanner in=new Scanner(System.in);
//        System.out.println("Enter the first number");
//        double x= in.nextDouble();
//        System.out.println("Enter the second number");
//        double y=in.nextDouble();
//        System.out.println("Enter the third number");
//        double z= in.nextDouble();
//        System.out.println("The smallest value is "+smallest(x,y,z)+"\n");
//    }
//    public static double smallest(double x,double y,double z){
//        return Math.min(Math.min(x,y),z);
//    }

    //Exercise 2

//    public static void main(String[] args) {
//        Scanner in=new Scanner(System.in);
//        System.out.println("Enter the first number");
//        double x=in.nextDouble();
//        System.out.println("Enter the second number");
//        double y=in.nextDouble();
//        System.out.println("Enter the third number");
//        double z=in.nextDouble();
//        System.out.println("The average of three number is "+average(x,y,z));
//    }
//
//    public static double average(double x,double y,double z){
//        return (x+y+z)/3;
//    }

            //exercise 3

//            Write a Java method to display the middle character of a string. Go to the editor
//    Note: a) If the length of the string is odd there will be two middle characters.
//    b) If the length of the string is even there will be one middle character.

//    public static void main(String[] args) {
//        Scanner in=new Scanner(System.in);
//        System.out.println("Enter the string");
//        String str=in.nextLine();
//        System.out.println("the middle of the string is "+middle(str)+"\n");
//    }
//    public static String middle(String str){
//        int position;
//        int length;
//
//        if (str.length()%2==0){
//            position=str.length()/2-1;
//            length=2;
//        }
//        else {
//            position=str.length()/2;
//            length=1;
//        }
//        return str.substring(position,position+length);
//    }

                    //exercise 4
                    //Write a Java method to count all vowels in a string.
//    public static void main(String[] args) {
//        Scanner in=new Scanner(System.in);
//        System.out.println("Input the word");
//        String word=in.nextLine();
//        System.out.println("The number of vowel in word is "+numvowel(word)+"\n");
//    }
//    public static int numvowel(String word){
//        int count=0;
//        for (int i = 0; i <word.length() ; i++) {
//            if (word.charAt(i)=='a'||word.charAt(i)=='e'||word.charAt(i)=='i'||word.charAt(i)=='o'||word.charAt(i)=='u')
//            {
//                count++;
//            }
//        }
//        return count;
//
//    }

                        //exercise 4

//                        Write a Java method to count all words in a string.

//    public static void main(String[] args) {
//        Scanner in=new Scanner(System.in);
//        System.out.println("Enter the sentence");
//        String word=in.nextLine();
//        System.out.println("number of words in sentence is "+numwords(word)+"\n");
//    }

//    public static int numwords(String word){
//        int count=0;
//        if (!(" ".equals(word.substring(0,1)))|| !(" ".equals(word.substring(word.length()-1)))){
//            for (int i = 0; i < word.length(); i++) {
//                if (word.charAt(i)==' '){
//                    count++;
//                }
//
//            }
//            count=count+1;
//        }
//        return count;

//    }

    //exercise 5
//    public static void main(String[] args) {
//        Scanner in=new Scanner(System.in);
//        System.out.println("enter the first number: ");
//        int firstnum= in.nextInt();
//        System.out.println("enter the second number: ");
//        int secondnum=in.nextInt();
//        System.out.println("the sum of two number is "+gettotal( firstnum, secondnum));
//    }
//    public static int gettotal(int number1,int number2){
//        return number1+number2;
//
//    }



}
