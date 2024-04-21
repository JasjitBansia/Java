/* 
 * Write a program using a function called area() to compute the area of a: 
  i. Circle (pi*r*r) 
  ii. Square (side * side)
  iii. Rectangle (length * breadth)
  Display the menu to output the area as per the user's choice
*/

import java.util.*;

class Area {
    void area(double r) {
        double areaOfCircle = 3.14 * r * r;
        System.out.println("The area of the circle is " + areaOfCircle + " sq cm");
    }

    void area(int s) {
        int areaOfSquare = s * s;
        System.out.print("The area of the square is " + areaOfSquare + " sq cm");
    }

    void area(int l, int b) {
        int areaOfRectangle = l * b;
        System.out.print("The area of the rectangle is " + areaOfRectangle + " sq cm");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius;
        int side, length, breadth;
        char choice;
        Area obj = new Area();
        System.out.print("Enter the choice ('c' - circle, 's' - square, 'r' - rectangle): ");
        choice = sc.next().toLowerCase().charAt(0);
        switch (choice) {
            case 'c': {
                System.out.print("Enter the radius: ");
                radius = sc.nextDouble();
                obj.area(radius);
                break;
            }
            case 's': {
                System.out.print("Enter the side: ");
                side = sc.nextInt();
                obj.area(side);
                break;
            }
            case 'r': {
                System.out.print("Enter the length: ");
                length = sc.nextInt();
                System.out.print("Enter the breadth: ");
                breadth = sc.nextInt();
                sc.close();
                obj.area(length, breadth);
                break;
            }
            default: {
                System.out.println("Invalid choice entered");
            }
        }
    }
}
