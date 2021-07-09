package by.dma.easy;

import java.util.Scanner;

/**
 * Checks the password complexity if it has minimum 6 characters length, at least one digit, one lower-case character
 * and one upper-case character.
 */
public class PasswordComplexity {

    public static boolean isPasswordComplex(String password) {

        return password.length() >= 6 &&
                password.matches(".*\\d.*") &&   // at least one digit
                password.matches(".*[a-z].*") && // at least one lower-case character
                password.matches(".*[A-Z].*");   // at least one upper-case character
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a password: ");
        String userInput = scanner.nextLine();
        System.out.println("Is the password complex? " + isPasswordComplex(userInput));
    }
}
