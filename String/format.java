/*
 * Write a program to input a word and display it in the given format:
 * H
 * H E
 * H E L 
 * H E L L 
 * H E L L O
 * H E L L O
 * H E L L 
 * H E L 
 * H E 
 * H
 */

import java.util.Scanner;

class format {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        sc.close();
        for (int i = 1; i <= str.length(); i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(str.charAt(j - 1) + " ");
            }
            System.out.println();
        }
        for (int i = str.length(); i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(str.charAt(j - 1) + " ");
            }
            System.out.println();
        }
    }

}