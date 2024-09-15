/*
 * Write a program to input two strings and check if they are equal, also do the same thing ignoring case differences.
 */

import java.util.Scanner;

class equality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();
        sc.close();
        if (str1.equals(str2)) {
            System.out.println("Both of the strings are equal");
        } else {
            System.out.println("Both of the strings are not equal");
        }
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("Both of the strings are equal, ignoring cases");
        } else {
            System.out.println("Both of the strings are not equal, ignoring cases");
        }
    }
}