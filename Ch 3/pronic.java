/*
 * Write a program to input a number and check and print whether it a pronic number or not 
 * (Pronic number is the number which is the product of two consecutive integers)
 */

import java.util.Scanner;

public class pronic {
    boolean check(int num) {
        boolean state = false;
        for (int i = 1; i <= num; i++) {
            if (i * (i + 1) == num) {
                state = true;
                break;
            }
        }
        return state;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        sc.close();
        pronic obj = new pronic();
        boolean state = obj.check(num);
        if (state == true) {
            System.out.println("The entered number is a pronic number");
        } else {
            System.out.println("The entered number is not a pronic number");
        }
    }

}
