package exercise;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("birinci reqemi daxil edin:");
        int number1=scanner.nextInt();
        System.out.println("ikinci reqemi daxil edin:");
        int number2= scanner.nextInt();

        int sum=number1+number2;
        int subtract=number1-number2;
        int division=number1/number2;
        int multiply=number1*number2;
        int mod=number1%number2;
        System.out.println(sum+" "+subtract+" "+division+" "+multiply+" "+mod);




    }
}
