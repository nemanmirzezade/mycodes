package exercise;

import java.util.Scanner;

public class textclass {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String word= scanner.nextLine();
        String result=validateserialnumber(word);
        System.out.println(result);

    }
    public static String validateserialnumber(String word){
        if (word.startsWith("AZE")){
            word=word.substring(3,word.length());
            if (word.length()==8){
                return word+"-ok";

            }
            else {
                return word+"-!ok";
            }

        }
        else {
            return word+"-!ok";
        }

    }
}
