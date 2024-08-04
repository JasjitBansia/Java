/*
 * Define a class FruitJuice with the following description:
 * Instance variables:
 * 
 * int product_code
 * String flavour
 * String pack_type
 * int pack_size
 * int product_price
 * 
 * Member methods:
 * 
 * FruitJuice() : Default constructor to initialise integer data members.
 * void input() : To input and store the product code, flavour, pack type, pack size and product price.
 * void discount() : To reduce the product price by 10.
 * void display() : To display product code, flavour, pack type, pack size and product price.
 */

import java.util.Scanner;

class FruitJuice {
    int product_code;
    String flavour;
    String pack_type;
    int pack_size;
    int product_price;

    FruitJuice() {
        product_code = 0;
        flavour = "";
        pack_type = "";
        pack_size = 0;
        product_price = 0;
    }

    void display(FruitJuice obj) {
        System.out.println("-----------------------");
        System.out.println("Product code: " + obj.product_code);
        System.out.println("Flavour: " + obj.flavour);
        System.out.println("Pack type: " + obj.pack_type);
        System.out.println("Pack size: " + obj.pack_size + " ml");
        System.out.println("Produt price: " + obj.product_price + " rupees");
    }

    void discount(FruitJuice obj) {
        obj.product_price -= 10;
    }

    void input() {
        FruitJuice obj = new FruitJuice();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the product code: ");
        obj.product_code = sc.nextInt();
        System.out.print("Enter the flavour: ");
        obj.flavour = sc.next();
        System.out.print("Enter the pack type: ");
        obj.pack_type = sc.next();
        System.out.print("Enter the pack size: ");
        obj.pack_size = sc.nextInt();
        System.out.print("Enter the product price: ");
        obj.product_price = sc.nextInt();
        sc.close();
        obj.discount(obj);
        obj.display(obj);
    }
}
