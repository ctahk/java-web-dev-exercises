package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String aliceInWonderlandExcerpt = "Alice was beginning to get very tired of sitting by her sister on the bank," +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading," +
                "but it had no pictures or conversations in it, 'and what is the use of a book,' though Alice ' without pictures or conversation?'";

        System.out.println("What term would you like to search in this sentence: ");
        String term = input.nextLine();

        System.out.println("The term" + term);

    }
}
