
class Nurlan {
    public static void main(String[] args) {
      power(5,3);
      power(3,2);
        System.out.println();

        Math.pow(2,3);

    }


    static void power(int number1,int number2){
        int result=1;
        for (int i = 1; i <=number2; i++) {
            result ^=number1;
        }
        System.out.println("answer: "+result);
    }
}
