package javaoca;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;
import java.awt.*;
import javax.swing.*;


public class Neman {
    public static void main(String[] args) {
//        Random random=new Random();
//        int rand=random.nextInt(3);
//        System.out.println(rand);


//        int number=2;
//        number++;
//        System.out.println("answer "+number+2);





















//        Scanner scanner=new Scanner(System.in);
//        DecimalFormat decform=new DecimalFormat("0.##");
//        double x1=0;
//        double y1=0;
//        double x2=0;
//        double y2=0;
//
//        System.out.println("enter x1 coordinate");
//        x1=scanner.nextDouble();
//        System.out.println("enter y1 coordinate");
//        y1=scanner.nextDouble();
//        System.out.println("enter x2 coordinate");
//        x2=scanner.nextDouble();
//        System.out.println("enter y2 coordinate");
//        y2=scanner.nextDouble();
//        scanner.close();
//
//        double distance=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
//        System.out.println("distance is: "+decform.format(distance));
//
//
//








        Random rand=new Random();

        for (int i = 1; i <=10; i++) {
            for (int j =1; j <=10; j++) {
                System.out.print(i*j+"\t");
            }
            System.out.println("");
        }


//        int i=1;
//        int j=1;
//        while (i<=30){
//            while (j<=30){
//                System.out.print(i*j+"\t");
//                j++;
//            }
//            j=1;
//            System.out.println("");
//            i++;
//        }

















//        int number=scanner.nextInt();
//        int count=0;
//        for (int i = 0; i < number; i++) {
//            if(i%23==0){
//                count++;
//                System.out.println(count+"-"+i+", ");
//
//            }
//
//        }















//        String firstname;
//        String lastname;
//        String finalname;
//
//        System.out.println("please enter first name");
//        firstname=scanner.next();
//        System.out.println("please enter last name");
//        lastname=scanner.next();
//
//        while (lastname.length()<5){
//            System.out.println("Last name must be at least 5 characters long.Try again");
//            lastname=scanner.next();
//        }
//
//        scanner.close();
//        finalname=firstname.substring(0,1);
//        finalname+=lastname.substring(0,5);
//        finalname+=rand.nextInt(99)+10;
//        System.out.println(finalname);





//        int number= rand.nextInt(30);
//
//
//        for (int i = 0; i <2; i++) {
//            int guess= scanner.nextInt();
//            if (guess==number){
//                System.out.println("ok.you find the number");
//                break;
//              }
//            else {
//                System.out.println("you cant find");
//
//
//            }
//
//
//        }




//         int first= rand.nextInt(7);
//         int second= rand.nextInt(7);
//         int third= rand.nextInt(7);
//         int middle= rand.nextInt(741);
//         int last= rand.nextInt(9999);
//
//         String middleString;
//         String lastString;
//
//         middleString=Integer.toString(middle);
//         lastString=Integer.toString(last);
//
//         while (middleString.length()<3){
//             middleString="0"+middleString;
//         }
//
//         while (lastString.length()<4){
//             lastString="0"+lastString;
//         }
//
//        System.out.println(Integer.toString(first)+Integer.toString(second)+Integer.toString(third)+"-"+middleString+"-"+lastString);








    }
}




