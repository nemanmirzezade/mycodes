package exercise;

public class human {
     String name;
     String surname;
     int age;

     public void humanCanRun(){
          System.out.println(name+" running...");
     }

     public void eat(){
          System.out.println(name+surname+" eating");
     }

     public String  getFullName(){
          return name+" "+surname;

     }

}
