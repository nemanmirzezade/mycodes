package KodlamaVakti;

public class Metodlar {
    public static void main(String[] args) {

        System.out.println(add(2,3));
        System.out.println(add(2,3,3.0));
        System.out.println(add(2,2.5,3));


        // f(x)=(x+2)*6
//        f(4);
//        f(8);

 //      power(2,5);


       // ave(2,10,20);
    }

    static  void f(int x){
        int result=(x+2)*6;
        System.out.println(result);
    }

    static void power(int num,int power){
        int result=1;
        for (int i = 1; i <=power; i++) {
            result*=num;


        }
        System.out.println(result);
    }

    static void ave(int x,int y,int z){
        int result=(x+y+z)/3;
        System.out.println(result);
    }


    static int add(int a,int b){
        System.out.println("metod 1:");
        return a+b;
    }

    static int add(int a,int b,int c){
        System.out.println("metrod 2:");
        return a+b+c;
    }

    static double add(int a,double b,int c){
        System.out.println("metod 3:");
        return a+b+c;
    }

    static double add(int a,int b,double c){
        System.out.println("metod 4:");
        return a+b+c;
    }
}
