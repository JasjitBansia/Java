/*
 * Write a program to enter a line of text from the keyboard and count the number of times a particular word occurs in it.
 * Display the frequency of the word.
 */

import java.util.Scanner;

class wordFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.print("Enter the word to search in the entered string: ");
        String word = sc.nextLine();
        str = " " + str;
        sc.close();
        int frequency = 0;
        int index;
        for (int i = 0; i < str.length(); i++) {
            index = str.indexOf(" " + word + " ");
            if (index != -1) {
                str = str.substring(index + 1);
                frequency++;
            }
        }
        System.out.println("Frequency of word: " + frequency);
    }
}