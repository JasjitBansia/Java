/*
 * Sasha Travels Pvt. Ltd gives the following discount to its customers:
 * Above 70000 : 18% Discount
 * 55001 to 70000 : 16% Discount
 * 35001 to 55000 : 12% Discount
 * 25001 to 35000 : 10% Discount
 * Less than 25001 : 2% Discount
 * 
 * Write a program to input the name and ticket amount for the customer and calculate the discount amount and net amount to be paid. 
 * Display the output in the following format for each customer:
 * 
 * Sr No.     Name     Ticket Charges     Discount     Net Amount
 *   -         -             -               -             -
 */

import java.util.Scanner;

class Ticket {
    int price = 0;
    String name;

    Ticket(int p, String n) {
        price = p;
        name = n;
    }

    void display(Ticket obj, int i) {
        int price = obj.price;
        int discount = 0;
        if (price > 70000) {
            discount = (18 * price) / 100;
        } else if (price >= 55001 && price <= 70000) {
            discount = (16 * price) / 100;
        } else if (price >= 35001 && price <= 55000) {
            discount = (12 * price) / 100;
        } else if (price >= 25001 && price <= 35000) {
            discount = (10 * price) / 100;
        } else if (price < 25001) {
            discount = (2 * price) / 100;
        }
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("Sr NO.          Name        Ticket Charges          Discount          Net Amount");
        System.out.println();
        System.out.println(
                " " + i + "             " + obj.name + "           " + obj.price + "                 " + discount
                        + "               "
                        + (obj.price - discount));
        System.out.println("----------------------------------------------------------------------------------------");
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        String choice;
        int index = 0;
        do {
            System.out.print("Enter your name: ");
            String name = sc.next();
            System.out.print("Enter the ticket amount: ");
            int price = sc.nextInt();
            Ticket obj = new Ticket(price, name);
            obj.display(obj, ++index);
            System.out.print("New Customer? (yes/no): ");
            choice = sc.next();
            if (choice == "no") {
                sc.close();
            }
        } while (choice.toLowerCase().equals("yes"));
    }

    public static void main(String[] args) {
        Ticket obj = new Ticket(0, "");
        obj.input();

    }
}
