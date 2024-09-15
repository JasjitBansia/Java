/*
 * Write a program to replace every occurence of the letter A with O
 */

import java.util.Scanner;

class replace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        sc.close();
        str = str.replace('A', 'O');
        str = str.replace('a', 'o');
        System.out.println(str);
    }
}