/*
 * Write a program to generate a pattern of a string entered by the user based
 * on the user's choice.
 */

import java.util.Scanner;

class differentPatterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.print("Enter 1 for first character of each word and 2 for last character: ");
        int choice = sc.nextInt();
        sc.close();
        String pattern1 = "";
        String pattern2 = "";
        if (choice == 1) {
            str = " " + str;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ') {
                    pattern1 += str.charAt(i + 1) + " ";
                }
            }
            System.out.println(pattern1);
        } else if (choice == 2) {
            str += " ";
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ') {
                    pattern2 += str.charAt(i - 1) + " ";
                }
            }
            System.out.println(pattern2);
        } else {
            System.out.println("Invalid choice");
        }
    }
}