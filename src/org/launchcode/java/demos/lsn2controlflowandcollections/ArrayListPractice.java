package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.ArrayList;
import java.util.Scanner;


public class ArrayListPractice {
    public static int sumEven (ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;

    }

    public static String [] num = {"Ted", "Rebecca", "Roy", "Keeley", "Beard"};

    public static void printWord(String[] numArray) {
        Scanner input = new Scanner(System.in);
        for(int i = 0; i <= numArray.length; i++) {
            System.out.println(numArray[i]);
        }

        System.out.println("Enter a word length: ");
        int numChars = input.nextInt();

    }
}
