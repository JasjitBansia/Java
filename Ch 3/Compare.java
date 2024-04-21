/*
 * Design a class to overload a function compare() as follows:
 * i. void compare(int, int) = To compare two integer values and print the greater of the two integers
 * ii. void compare(char, char) = To compare the numeric values of two characters and print the character with higher numeric value
 * iii. void compare(String, String) = To compare the length of the two strings and print the longer of the two
 */

import java.util.Scanner;

public class Compare {

    void compare(int a, int b) {
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }

    void compare(char a, char b) {
        int valueOfA = (int) a;
        int valueOfB = (int) b;
        if (valueOfA > valueOfB) {
            System.out.println(a);
        } else {
            System.out.println(b);

        }
    }

    void compare(String a, String b) {
        if (a.length() > b.length()) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Compare obj = new Compare();
        System.out.print("Enter first number: ");
        int intA = sc.nextInt();
        System.out.print("Enter second number: ");
        int intB = sc.nextInt();
        obj.compare(intA, intB);
        System.out.print("Enter first character: ");
        char charA = sc.next().charAt(0);
        System.out.print("Enter second character: ");
        char charB = sc.next().charAt(0);
        obj.compare(charA, charB);
        System.out.print("Enter first string: ");
        String stringA = sc.next();
        System.out.print("Enter second string: ");
        String stringB = sc.next();
        obj.compare(stringA, stringB);
        sc.close();
    }
}
