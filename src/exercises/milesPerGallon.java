package exercises;

import java.util.Scanner;

public class milesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have you driven: ");
        Double miles = input.nextDouble();

        System.out.println("How many gallons of gas have you used: ");
        Double gallons = input.nextDouble();

        Double mpg = miles/gallons;
        System.out.println("You are currently at " + mpg + "mpg");


    }
}
