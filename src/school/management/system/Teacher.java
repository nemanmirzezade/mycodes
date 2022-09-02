package school.management.system;

public class Teacher {
    private int ID;
    private  String name;
    private int salary;

    public Teacher(int ID,String name,int salary){
        this.ID=ID;
        this.name=name;
        this.salary=salary;
    }
    public int getID(){
        return ID;
    }

    public String getName(){
        return name;
    }
    /*
    return the salary of teacher
     */
    public int getSalary(){
        return salary;
    }

    /*
    update the salary
     */

    public void setSalary(int salary){
        this.salary=salary;
    }

}

