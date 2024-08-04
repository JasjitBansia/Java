/*
 * Create a class Vol having data members as r (radius) and h (height). Use parameterised constructor to initialise the object.
 * With the help of volume(); calculate and display the volume of cylinder.
 */

class Vol {
    double r;
    double h;

    Vol(double radius, double height) {
        r = radius;
        h = height;
    }

    void volume(Vol obj) {
        double volume = Math.PI * Math.pow(obj.r, 2) * obj.h;
        System.out.println("Volume of the cylinder is " + volume + " cm cube");
    }

    public static void main(String[] args) {
        Vol obj = new Vol(16.35, 27.35);
        obj.volume(obj);
    }
}