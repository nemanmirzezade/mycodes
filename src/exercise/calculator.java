package exercise;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("birinci reqemi daxil et: ");
        int i1= scanner.nextInt();
        System.out.println("ikinci reqemi daxil et: ");
        int i2= scanner.nextInt();

        System.out.println("operator daxil et: ");
        String operator= scanner.nextLine();

        if (operator.equals("+")){
            int result=i1+i2;
            System.out.println("toplama: "+result);
        }
        else if (operator.equals("-")) {
            int result = i1 - i2;
            System.out.println("cixma: " + result);
        }
            else if (operator.equals("*")){
                int result=i1*i2;
                System.out.println("vurma"+result);
            }

            else if (operator.equals("/")){
                if (i2!=0) {
                    int result = i1 / i2;
                    System.out.println("bolme: "+result);
                    } else{
                        System.out.println("ikinci eded sifir ola bilmez");
                    }
                }


    }
}

