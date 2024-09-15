/*
 * Write a program to count the vowels present in a string.
 */

import java.util.Scanner;

class vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        sc.close();
        int vowelCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'A' || str.charAt(i) == 'a' || str.charAt(i) == 'E' || str.charAt(i) == 'e'
                    || str.charAt(i) == 'I' || str.charAt(i) == 'i' || str.charAt(i) == 'O' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'U' || str.charAt(i) == 'u') {
                vowelCount++;
            }
        }
        System.out.println("Number of vowels in the string: " + vowelCount);
    }
}