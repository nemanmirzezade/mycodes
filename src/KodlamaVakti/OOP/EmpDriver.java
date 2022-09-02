package KodlamaVakti.OOP;

public class EmpDriver {
    public static void main(String[] args) {
        Employee isci1=new Employee(2015,60,1200,"fahri");
        System.out.println("tax: "+isci1.Tax());
        System.out.println("bonus "+isci1.bonus());

    }
}
