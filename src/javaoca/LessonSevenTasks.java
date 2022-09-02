package javaoca;

import java.util.Scanner;

public class LessonSevenTasks {

    public int sum;
    public int subtract;
    public int multiply;
    public int division;
    public int remainder;


    public LessonSevenTasks(){

    }

    public void setDivision(int num1,int num2) {
       // this.division = division;
        division=num1/num2;
    }

    public int getDivision() {
        return division;
    }

    public void setMultiply(int num1,int num2) {
      //  this.multiply = multiply;
        multiply=num1*num2;
    }

    public int getMultiply() {
        return multiply;
    }

    public void setSum(int num1,int num2) {
       // this.sum = sum;
        sum=num1+num2;
    }

    public int getSum() {
        return sum;
    }

    public void setSubtract(int num1,int num2) {
      //  this.subtract = subtract;
        subtract=num1-num2;
    }

    public int getSubtract() {
        return subtract;
    }

    public void setRemainder(int num1,int num2) {
       // this.remainder = remainder;
        remainder=num1%num2;
    }

    public int getRemainder() {
        return remainder;
    }

    public void mathOperation(LessonSevenTasks lessonSevenTasks){


        System.out.println("sum: "+sum);
        System.out.println("subtract: "+subtract);
        System.out.println("multiply: "+multiply);
        System.out.println("division: "+division);
        System.out.println("remainder: "+remainder);


    }



}
