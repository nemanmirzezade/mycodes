package exercise;

public class stringmethod {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("Hello");
        sb1.append("Hello World");
        System.out.println(sb1);


        String s1="Hello";
        s1.replace("a","A");
        System.out.println(s1);

        int x=20;
        int y=x;
        y=0;
        System.out.println(y);
    }
}
