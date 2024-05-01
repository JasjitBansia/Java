/*
 * Write a complete java program that contains the following methods:
 * digits(): that accepts values of the digit at unit's place, the digit at ten's place and the digit at the hundred's place
 * findnum(): that finds the number corresponding to the accepted digit
 * main(): that calls the above methods and displays the computed number
 */

import java.util.Scanner;

class numberPlace {
    int unit;
    int ten;
    int hundred;

    void digits() {
        numberPlace obj = new numberPlace();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the digit at unit's place: ");
        obj.unit = sc.nextInt();
        System.out.print("Enter the digit at ten's place: ");
        obj.ten = sc.nextInt();
        System.out.print("Enter the digit at hundred's place: ");
        obj.hundred = sc.nextInt();
        sc.close();
        obj.findNum(obj);
    }

    void findNum(numberPlace obj1) {
        int number = ((obj1.hundred * 100) + (obj1.ten * 10) + (obj1.unit));
        System.out.println("The number corresponds to " + number);
    }

    public static void main(String args[]) {
        numberPlace obj = new numberPlace();
        obj.digits();
    }
}