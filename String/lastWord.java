/*
 * Write a program to input a string and display its last word only
 */

import java.util.Scanner;

class lastWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        sc.close();
        int lastSpace = str.lastIndexOf(' ');
        String lastWord = str.substring(lastSpace + 1);
        System.out.println(lastWord);
    }
}