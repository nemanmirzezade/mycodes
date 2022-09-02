package javaoca;

public class Taask7 {

    public void divsionTak1() {
        System.out.println("\ndivided by 3:");
        int x = 0;
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                x = i;
                System.out.print(x + ",");
            }
        }
        System.out.println("\ndivided by 5:");
        int y = 0;
        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0) {
                y = i;
                System.out.print(y + ",");
            }
        }
        System.out.println("\ndivided by 15:");
        int z = 0;
        for (int i = 1; i < 100; i++) {
            if (i % 15 == 0) {
                z = i;
                System.out.print(z + ",");
            }
        }
    }


    public void FindFactorial(int num) {
        System.out.println("Answer of factorial: ");
        int fact1 = 1;

        if (num > 0) {
            int fact = 1;

            for (int i = 1; i <= num; i++) {
                fact = fact * i;

            }
            System.out.println(fact);
        } else {
            System.out.println("Please enter the positive number");
        }
    }


    public void StudentScoreAve() {
        int[] scores = new int[11];
        scores[0] = 85;
        scores[1] = 95;
        scores[2] = 87;
        scores[3] = 75;
        scores[4] = 23;
        scores[5] = 27;
        scores[6] = 29;
        scores[7] = 65;
        scores[8] = 75;
        scores[9] = 58;
        scores[10] = 85;

        int sum = 0;

        for (int i = 1; i < 11; i++) {
            System.out.println("score of student " + i + " is " + scores[i]);


            sum = sum + scores[i];

        }
        System.out.println("average of students' scores is " + sum / 10);
    }











}
