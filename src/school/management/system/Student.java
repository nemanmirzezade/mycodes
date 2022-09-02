package school.management.system;

public class Student {
   private int ID;
   private String name;
   private int grade;
   private int FeesPaid;
   private int FeesTotal;

   public Student(int ID,String name,int grade){
      this.ID=ID;
      this.name=name;
      this.grade=grade;
      this.FeesPaid=0;
      this.FeesTotal=30000;

   }

   public void setGrade(int grade){
      this.grade=grade;

   }

   public void updateFeesPaid(int fees){
      FeesPaid=FeesPaid+fees;
   }

/*
retrun the id of studenr
 */
   public int getID() {
      return ID;
   }

   /*
   return the name of student
    */
   public String getName() {
      return name;
   }
   /*
   return the grade of student
    */
   public int getGrade() {
      return grade;
   }
   /*
   return the feespaid by the student
    */
   public int getFeesPaid() {
      return FeesPaid;
   }

   /*
   return the totalfees of student
    */
   public int getFeesTotal() {
      return FeesTotal;
   }
}
