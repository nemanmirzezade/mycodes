package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class arrayapp {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        boolean iscontinue=true;
        int count=0;

        int array[]=new int[3];

        while (iscontinue){
            System.out.println("reqem daxil edin: ");
            int x= scanner.nextInt();
            count++;
            if (array.length>count){
            for (int i = 0; i < array.length; i++) {
                if (array[i] == 0) {

                    array[i] = x;
                    break;
                }
            }

            }
            else {
                System.out.println("sizin yaddas yeriniz dolmusdur");
                break;
            }
            System.out.println("davam etmek isteyriseiz? - 0 yox- 1 he");
            int davam= scanner.nextInt();
            if (davam==0){
                iscontinue=false;
            }
        }
        System.out.println("sizin daxil etdiuiniz ededler"+ Arrays.toString(array));
        System.out.println("program finished");
    }
}
