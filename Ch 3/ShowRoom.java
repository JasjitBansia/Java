/*
 * Design a class name ShowRoom with the following desription
 * Instance variables/ Data members:
 *     String name - To store the name of the customer
 *     long mobno - To store the mobile number of the customer
 *     double cost - To store the cost of the items purchased
 *     double dis - To store the discount amount
 * Member methods:
 *     ShowRoom() - default cuonstructor to initialize data members
 *     void input() - To input customer name, mobile number, cost
 *     void calculate - To calculate discount on the cost of purchased items, based on the following criteria:
 *       Cost: Less than or equal to 10000 Discount: 5%
 *       Cost: More than 10000 and less than or equal to 20000 Discount: 10%
 *       Cost: More than 20000 and less than or equal to 35000 Discount: 15%
 *       Cost: More than 35000 Discount: 20%
 *     void display - To display customer name, mobile number, amount to be paid after discount
 * Write a main method to create an object of the class and call the above member methods
 *     
 */

import java.util.Scanner;

public class ShowRoom {

    String name;
    long mobno;
    double cost;
    double dis;
    double amount;

    void input(ShowRoom obj) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        obj.name = sc.nextLine();
        System.out.print("Enter your mobile number: ");
        obj.mobno = sc.nextLong();
        System.out.print("Enter the cost of items purchased: ");
        obj.cost = sc.nextDouble();
        sc.close();
    }

    void calculate(ShowRoom obj) {
        double discount;
        if (obj.cost <= 10000) {
            discount = (5 * obj.cost) / 100;
            obj.amount = obj.cost - discount;
        } else if (obj.cost > 10000 && obj.cost <= 20000) {
            discount = (10 * obj.cost) / 100;
            obj.amount = obj.cost - discount;
        } else if (obj.cost > 20000 && obj.cost <= 35000) {
            discount = (15 * obj.cost) / 100;
            obj.amount = obj.cost - discount;
        } else {
            discount = (20 * obj.cost) / 100;
            obj.amount = obj.cost - discount;
        }
    }

    void display(ShowRoom obj) {
        System.out.println("--------------------------------------------------");
        System.out.println("Customer's name: " + obj.name);
        System.out.println("Customer's mobile number: " + obj.mobno);
        System.out.println("Amount to be paid after discount: " + obj.amount);
        System.out.println("--------------------------------------------------");
    }

    public static void main(String[] args) {
        ShowRoom obj = new ShowRoom();
        obj.input(obj);
        obj.calculate(obj);
        obj.display(obj);
    }
}
