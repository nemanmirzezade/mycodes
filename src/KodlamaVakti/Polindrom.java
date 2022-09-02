package KodlamaVakti;

public class Polindrom {

    static boolean isPalindrome(int input){
        int temp,terssayi=0,kalan;
        temp=input;

        while (temp!=0){
            kalan=temp%10;            //1 -->2-->1
            terssayi=terssayi*10+kalan;  //1 -->12-->121
            temp/=10;                  //12 -->1-->0

        }
        if (input==terssayi)
            return true;
        else
            return false;
    }


    public static void main(String[] args) {
        System.out.println(isPalindrome(121));

    }
}
