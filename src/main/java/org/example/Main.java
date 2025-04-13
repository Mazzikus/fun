package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get string input from the user
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Get the letter to count
        System.out.print("Enter a letter to count: ");
        char targetChar = scanner.next().charAt(0);

        // Count occurrences
        int count = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == targetChar) {
                count++;
            }
        }

        // Display result
        System.out.println("The letter '" + targetChar + "' appears " + count + " times.");

        scanner.close();
    }
}
