//import java.util.Random;
//import java.util.Scanner;
//
//public class Game {
//    public static void main(String[] args) {
//        Random random=new Random();
//        Scanner scanner=new Scanner(System.in);
//
//
//
//        System.out.println("enter the chance count");
//        int chance=scanner.nextInt();
//
//        int userpoint=0;
//        int computer_point=0;
//
//        for (int i = 1; i <=chance; i++) {
//
//            System.out.println("enter the number between 1 and 3");
//            System.out.println("Please enter the number");
//            int UserInput=scanner.nextInt();
//
//            int computer_choice=random.nextInt(2)+1;
//
//            if (UserInput==1){
//                System.out.println("User choice: Rock");
//            }
//            if (UserInput==2) {
//                System.out.println("User choice: Paper");
//            }
//             if (UserInput==3) {
//                System.out.println("User choice: Scissors");
//            }
//
//            if (computer_choice==1){
//                System.out.println("computer choice: Rock");
//            }
//             if (UserInput==2) {
//                System.out.println("computer choice: Paper");
//            }
//             if (UserInput==3) {
//                System.out.println("computer choice: Scissors");
//            }
//
//
//            //Execution
//
//
//            if (UserInput==computer_choice){
//                System.out.println("draw");
//        }
//            else if (UserInput==1 & computer_choice==2) {
//                System.out.println("computer win");
//                computer_point++;
//            }
//
//            else if (UserInput==1 & computer_choice==3) {
//                System.out.println("user win");
//                userpoint++;
//            }
//
//            else if (UserInput==2 & computer_choice==1) {
//                System.out.println("user win");
//                userpoint++;
//            }
//
//
//
//            else if (UserInput==2 & computer_choice==3) {
//                System.out.println("computer win");
//                computer_point++;
//            }
//
//
//
//             if (UserInput==3 & computer_choice==1) {
//                System.out.println("computer win");
//                computer_point++;
//            }
//
//             else if (UserInput==3 & computer_choice==2) {
//                System.out.println("user win");
//                userpoint++;
//            }
//
//
//
//            }
//
//        System.out.println("computer_point: "+computer_point);
//        System.out.println("user point: "+userpoint);
//
//
//        }
//}
