package javaoca;

import java.util.Scanner;

public class OcaTaskSeven {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Task 10");
        int num1= scanner.nextInt();
        int num2= scanner.nextInt();
        LessonSevenTasks taskten=new LessonSevenTasks();
        taskten.setSum(num1,num2);
        taskten.setSubtract(num1,num2);
        taskten.setRemainder(num1,num2);
        taskten.setMultiply(num1,num2);
        taskten.setDivision(num1,num2);

        taskten.mathOperation(taskten);

        System.out.println("-----------------------------");







    }
}
