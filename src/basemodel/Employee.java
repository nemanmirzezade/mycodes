package basemodel;

public class Employee {
    private String name;
    private String surname;
    private int age;
    private double salary;



    public String getfullname(){
        return name+" "+surname;
    }

    public void printAllEmployeeData(){
        System.out.println("Name: "+name+"\n"+"Surname: "+surname+"\n"+"age: "+age+"\n"+"salary: "+salary);

    }

    public String getReport(){
        return name+" "+surname+" maasi"+" "+salary+" "+"manat";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        if (age>=16){
            this.age = age;
        }else {
            System.out.println("yas yanlisdir minimum 16");
            System.exit(1);
        }

    }

    public void setSalary(double salary) {
        if (salary>300){
        this.salary = salary;
    }else{
            System.out.println("maas duzgun daxil edilmeyib");
            System.exit(2);
        }
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
}



