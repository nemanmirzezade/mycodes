package javaoca;

import java.util.Scanner;

public class Lesson11Task {
    //Task1
    public static void main(String[] args) {
        int[]array={1,2,3,4,5,6,7,8,9,10};
        for (int i = array.length-1; i >=0; i--) {
            System.out.println(array[i]);
        }
    }
}

class Task2{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s1= scanner.nextLine();
        for (int i = s1.length()-1; i >=0; i--) {
            char c=s1.charAt(i);
            System.out.print(c);
        }
    }
}



class Task3{
    public static void main(String[] args) {
        String s1="Hello world";
        String s2="world";









       // System.out.println(s1.contains(s2));

    }
}
