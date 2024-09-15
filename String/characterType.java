/*
 * Write a program to accept a character from the user and check whether it is a
 * letter/digit/special character.
 */

import java.util.Scanner;

class characterType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String str = sc.nextLine();
        sc.close();
        char character = str.charAt(0);
        int charValue = (int) character;
        if (charValue >= 65 && charValue <= 90 || charValue >= 97 && charValue <= 122) {
            System.out.println("Character is a letter");
        } else if (charValue >= 48 && charValue <= 57) {
            System.out.println("Character is a digit");
        } else {
            System.out.println("Character is a special character");
        }
    }
}