package org.example;

import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
public class AgeValidator {
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18 || age > 65) {
            throw new InvalidAgeException("Age must be between 18 and 65.");
        }
    }

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in))
        {
            int userAge;
            System.out.print("Please enter age: ");
            userAge = scanner.nextInt();
            validateAge(userAge);
            System.out.println("Age is valid: " + userAge);
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
