/*
 * Write a program to input a sentence and convert it into uppercase and count
 * and display the total number of words starting with a letter 'A'
 */

import java.util.Scanner;

class uppercaseCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        sc.close();
        str = str.toUpperCase();
        int Acount = 0;
        if (str.charAt(0) == 'A') {
            Acount++;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                if (str.charAt(i + 1) == 'A') {
                    Acount++;
                }
            }
        }
        System.out.println("Uppercase: " + str + "\nNumber of words starting with letter A: " + Acount);
    }
}