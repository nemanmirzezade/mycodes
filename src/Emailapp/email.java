package Emailapp;


import java.util.Scanner;

public class email {
   private String firstName;
   private String lastName;
   private String password;
   private String department;
   private int mailboxCapacity;
   private int defaaultpasswordLength=10;
   private String alternateEmail;

   // Constructor receive the first name and last name

   public email(String firstName,String lastName){
      this.firstName=firstName;
      this.lastName=lastName;
      System.out.println("EMAIL CREATED: "+this.firstName+" "+this.lastName);

      // call a method asking for the department - return the department
      this.department=setDepartment();
      System.out.println("Deparment: "+this.department);

      // Call a method that returns a random password
      this.password=randomPassword(defaaultpasswordLength);
      System.out.println("Your password is "+this.password);
   }

   //    Ask for the department

   private String setDepartment(){
      System.out.println("DEPARTMENTCODES\n1 for Sales\n2 for Accounting\n3 for Development\n0 for None\nEnter department code:");
      Scanner scanner=new Scanner(System.in);
      int depChoice= scanner.nextInt();
      if (depChoice==1){return "Sales";}
      else if (depChoice==2) {return "Accounting";}
      else if (depChoice==3) {return "Development";}
      else {return "";}


   }

    // Generate a random password
   private String randomPassword(int length){
      String passwordset="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
      char[] password=new char[length];
      for (int i = 0; i < length; i++) {
         int rand=(int) (Math.random()*passwordset.length());
         password[i]=passwordset.charAt(rand);
      }
      return new String (password);
   }

    // Set the mailbox capacity

    // set the alternate email

    //Change the password


}
