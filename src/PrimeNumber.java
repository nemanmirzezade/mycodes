import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number");
        //int number=scanner.nextInt();
       // System.out.println("enter the number limit that count the prime number");
        int numberlimit=scanner.nextInt();
        System.out.print("prime number:2,3,5,7,");
        int count=0;


        for (int number = 10; number < numberlimit; number++) {

            if (!(number%2==0|number%3==0|number%5==0|number%7==0)){
                System.out.print(number+",");
                count++;
            }

//            else {
//                System.out.println(number+" -prime");
//            }

        }
        System.out.println();
        System.out.print("count of prime number is ");
        System.out.print(count+4);

    }
}
