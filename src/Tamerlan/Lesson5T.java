package Tamerlan;

import java.util.Arrays;

public class Lesson5T {
    public static void main(String[] args) {
        int[] oldArray = new int[10];
        oldArray[0] = 14;
        oldArray[1] = 22;
        oldArray[2] = 32;
        oldArray[3] = 42;
        oldArray[4] = 52;
        oldArray[5] = 62;
        oldArray[6] = 72;
        oldArray[7] = 82;
        oldArray[8] = 92;
        oldArray[9] = 100;

        System.out.println(Arrays.toString(oldArray));

        System.out.println("--------------------");
        int[] NewArray = new int[oldArray.length * 2];
        for (int i = 0; i < oldArray.length; i++) {
            NewArray[i] = oldArray[i];
        }
        NewArray[10]=57;
        NewArray[11]=58;
        NewArray[12]=59;
            System.out.println(Arrays.toString(NewArray));

            NewArray[9]=57;
            NewArray[10]=58;
            NewArray[11]=59;
        }


    }







