/*
 * Write a program that computes your initials from your full name and displays them.
 */

import java.util.Scanner;

class initials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        sc.close();
        int lastSpace = name.lastIndexOf(' ');
        String lastName = " " + name.substring(lastSpace + 1);
        String initials = "";
        initials += name.charAt(0) + ".";
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == ' ') {
                initials += name.charAt(i + 1) + ".";
            }
        }
        initials = initials.substring(0, initials.length() - 2);
        System.out.println(initials + lastName);
    }
}