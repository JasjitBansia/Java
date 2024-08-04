/*
 * i. Define a class 'Find' to find out even/odd number. With the help of disp(), find whether an entered number is even/odd.
 * ii. Create another class to initialise and use paramaterised constructor through main() method.
 */

class Find {
    int num;

    Find(int n) {
        num = n;
        disp(num);
    }

    static void disp(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is an even number");
        } else {
            System.out.println(num + " is an odd number");
        }
    }

    public static void main(String[] args) {
        new Find(3);
    }
}

class Find2 {
    public static void main(String[] args) {
        new Find(8);
    }
}
