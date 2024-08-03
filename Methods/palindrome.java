/*
 * Define a program in java to accept a number and check whether a number is Palindrome or not by using method name reverse(int n) 
 * which returns the number after reversing the digit
 */

import java.util.Scanner;

public class palindrome {
    static int reverse(int num) {
        int num1;
        int reverse = 0;
        while (num > 0) {
            num1 = num % 10;
            num /= 10;
            reverse = reverse * 10 + num1;
        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter the number: ");
        num = sc.nextInt();
        sc.close();
        int reversedNum = reverse(num);
        if (num == reversedNum) {
            System.out.println(num + " is a palindrome");
        } else {
            System.out.println(num + " is not a palindrome");
        }
    }
}
