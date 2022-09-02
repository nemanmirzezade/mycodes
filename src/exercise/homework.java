package exercise;

import java.util.Scanner;

public class homework {
    public static void main(String[] args) {

  Scanner scanner=new Scanner(System.in);
        System.out.println("1-ci reqemi daxil et: ");
        int i1= scanner.nextInt();
        System.out.println("2-ci reqemi daxil et: ");
        int i2= scanner.nextInt();

        System.out.println("operator daxil et: ");
        scanner.nextLine();
        String opetor= scanner.nextLine();



            if (opetor.equals("+")) {
            int result = i1 + i2;
            System.out.println("toplama: " + result);
        } else if (opetor.equals("-")) {
            int result = i1 - i2;
            System.out.println("cixma: " + result);
        } else if (opetor.equals("*")) {
            int result = i1*i2;
            System.out.println("vurma: " + result);
        } else if (opetor.equals("/")) {
            if (i2==0){
                System.out.println("ikinci reqem sifir ola bilmez");
            } else {
                int result = i1/i2;
            System.out.println("bolme: " + result);
            }


        } else if (opetor.equals("%")) {
            int result = i1%i2;
            System.out.println("qaliq: " + result);

        }

    }

    }