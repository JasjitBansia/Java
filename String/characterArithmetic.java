/*
 * Write a program to accept two characters from the user and then display the sum and difference between the two characters.
 */

import java.util.Scanner;

class characterArithemetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first character: ");
        char ch1 = sc.nextLine().charAt(0);
        System.out.print("Enter the second character: ");
        char ch2 = sc.nextLine().charAt(0);
        sc.close();
        int sum = ((int) ch1) + ((int) ch2);
        int difference = ((int) ch1) - ((int) ch2);
        System.out.println("Sum: " + sum + "\nDifference: " + difference);
    }
}