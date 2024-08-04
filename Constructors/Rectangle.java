/*
 * i. Write a class called Rectangle with two float data members. Write a default and a parameterised constructor for the class
 * to initialise the data members. Write the main() function to invoke both of them.
 * 
 * ii. Write a method called showData() that will display the data of both the objects from the main method.
 * 
 * iii. Write a statement to call the parameterised constructor from the default constructor using the this keyword. 
 * Also call the method from the parameterised constructor.
 */

class Rectangle {
    float length;
    float width;

    Rectangle() {
        this(7.24f, 14.45f);
    }

    Rectangle(float l, float w) {
        length = l;
        width = w;
        showData(length, width);
    }

    static void showData(float length, float width) {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
    }

    public static void main(String[] args) {
        new Rectangle();
        new Rectangle(7.24f, 14.45f);
    }
}
