/*
 * Write a program in Java to accept a string in lower case and change the first
 * letter of every word to upper case. Display the new string.
 */

import java.util.Scanner;

class invertCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string in lowercase: ");
        String str = scanner.nextLine();
        scanner.close();
        String newString = "";
        boolean isFirstWord = true;

        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);

            if (character == ' ') {
                isFirstWord = true;
            } else if (isFirstWord) {
                character = Character.toUpperCase(character);
                isFirstWord = false;
            }
            newString += character;
        }
        System.out.println("Uppercased: " + newString.toString());
    }
}