package javaoca;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson8 {
    public static void main(String[] args) {

        int count=1;
        for (int i = 1; i <=4; i++) {
            for (int j = 1; j <=4; j++) {
                for (int k = 1; k <=4; k++) {
                    if (i!=j & i!=k & k!=j){
                        System.out.println(count+"-"+i+""+j+""+k);
                        count++;
                    }
                }
            }
        }
    }
}

