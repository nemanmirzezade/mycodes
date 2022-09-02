package javaoca;

import java.util.Scanner;

public class Stringexample {
    public static void main(String[] args) {


        int[][]ints={{1,2,3},{4,5,6,7,8},{9,10}};
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j <ints[i].length; j++) {
                System.out.println(ints[i][j]);

            }

        }
        System.out.println("--------");

        for (int i = ints.length-1; i >= 0; i--) {
            for (int j = ints[i].length-1; j >=0; j--) {
                System.out.println(ints[i][j]);

            }

        }
    }
}
