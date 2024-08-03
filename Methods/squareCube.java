/*
 * i. Define methods to find the square of a number and cube of a number. The number must be passed to the method from the calling statement
 * and computed result must be returned to calling module
 * ii. Define a main() method to call the above square and cube methods
 */

class squareCube {
    int square(int num) {
        return num * num;
    }

    int cube(int num) {
        return num * num * num;
    }

    public static void main(String[] args) {
        int num = 5;
        squareCube obj = new squareCube();
        int square = obj.square(num);
        int cube = obj.cube(num);
        System.out.println("The square of the number is " + square);
        System.out.println("The cube of the number is " + cube);

    }
}
