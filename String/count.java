/*
 * Write a program that inputs a string and counts the number of digits and spaces in it.
 */

import java.util.Scanner;

class count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        sc.close();
        int digits = 0, spaces = 0;
        for (int i = 0; i < str.length(); i++) {
            if ((int) str.charAt(i) >= 48 && (int) str.charAt(i) <= 57) {
                digits++;
            }
            if (str.charAt(i) == ' ') {
                spaces++;
            }
        }
        System.out.println("Number of digits: " + digits + "\nNumber of spaces: " + spaces);
    }
}