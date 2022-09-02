package KodlamaVakti.OOP;

public class Employee {
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    Employee(int hireYear,int workHours,double salary,String name){
        this.hireYear=hireYear;
        this.workHours=workHours;
        this.salary=salary;
        this.name=name;
    }

    public double Tax(){
        if (this.salary>=1000){
            return 1000*0.03;
        }else {
            return 0.0;
        }
    }

    public double bonus(){
        int extrahours=this.workHours-40;
        if (extrahours>0){
            return 30*extrahours;
        }else {
            return 00;
        }


    }

    public double raisofSalary(){
        int year=2022-hireYear;
        if (year<10){
            return this.salary*0.05;
        }
        else if (year>=10 && year<20) {
            return this.salary*0.1;
        }
        else {
            return this.salary*0.15;
        }

    }



}
