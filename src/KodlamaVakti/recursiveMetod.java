package KodlamaVakti;

public class recursiveMetod {

    static int f(int x) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        return sum;
    }

    static int r(int x){
        if (x==1){
            return 1;
        }
        return x+r(x-1);
    }





    public static void main(String[] args) {
        System.out.println(r(9));





    }
}
