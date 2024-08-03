/*
 * Write a Java class Box whose default constructor initialises the dimensions length, width and height of the box to zero. 
 * The parameterised constructor is passed 3 double values, each for its dimensions.
 * Write a main method of the above class that creates a Box object of dimensions 3.89cm, 2.1cm and 1.5cm. Compute the volume of the box
 */

class Box {
    double length, width, height;

    Box() {
        length = 0.0;
        width = 0.0;
        height = 0.0;
    }

    Box(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
    }

    public static void main(String[] args) {
        Box obj = new Box(3.89, 2.1, 1.5);
        double volume = obj.length * obj.width * obj.height;
        System.out.println("The volume of the box is: " + volume + " cm cube");
    }
}
