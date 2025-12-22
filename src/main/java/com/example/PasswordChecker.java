package com.example;

import java.util.Scanner;

public class PasswordChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        int score = 0;

        if (password.length() >= 8) score++;
        if (password.matches(".*[A-Z].*")) score++;
        if (password.matches(".*[a-z].*")) score++;
        if (password.matches(".*[0-9].*")) score++;
        if (password.matches(".*[!@#$%^&*()_+=<>?/{}~].*")) score++;

        System.out.println("\nPassword Analysis:");
        System.out.println("Length >= 8: " + (password.length() >= 8));
        System.out.println("Uppercase Letter: " + password.matches(".*[A-Z].*"));
        System.out.println("Lowercase Letter: " + password.matches(".*[a-z].*"));
        System.out.println("Digit: " + password.matches(".*[0-9].*"));
        System.out.println("Special Character: " + password.matches(".*[!@#$%^&*()_+=<>?/{}~].*"));

        System.out.println("\nPassword Strength:");

        if (score <= 2) {
            System.out.println("WEAK");
        } else if (score <= 4) {
            System.out.println("MEDIUM");
        } else {
            System.out.println("STRONG");
        }

        scanner.close();
    }
}
