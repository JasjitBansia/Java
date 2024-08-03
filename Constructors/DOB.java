/*
 * Data members:
 * dd - date - integer
 * mm - month - integer
 * yy - year - integer
 * Member functions: 
 * i. default constructor
 * ii. parameterised constructor - initialises you and your friend's date of birth.
 * iii. plus(int) - increase years of both date of birth with parameter value of both persons.
 * iv. disp() - display actual and changed date of birth of both persons.
 */

import java.util.Scanner;

class DOB {
    int dd, mm, yy;

    DOB() {
        dd = 0;
        mm = 0;
        yy = 0;
    }

    DOB(int d, int m, int y) {
        dd = d;
        mm = m;
        yy = y;
    }

    void disp(String name, DOB obj) {
        System.out.println(name + "'s date of birth: " + obj.dd + "/" + obj.mm + "/" + obj.yy);
    }

    void plus(DOB oobj, DOB fobj, int increment) {
        oobj.yy += increment;
        fobj.yy += increment;
    }

    public static void main(String[] args) {
        DOB obj = new DOB();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your DOB (dd mm yyyy): ");
        String odob = sc.nextLine();
        int od = Integer.parseInt(odob.substring(0, 2));
        int om = Integer.parseInt(odob.substring(3, 5));
        int oy = Integer.parseInt(odob.substring(6, 10));
        DOB oobj = new DOB(od, om, oy);
        System.out.print("Enter your friend's name: ");
        String friendName = sc.nextLine();
        System.out.print("Enter your friend's DOB (dd mm yyyy): ");
        String fdob = sc.nextLine();
        int fd = Integer.parseInt(fdob.substring(0, 2));
        int fm = Integer.parseInt(fdob.substring(3, 5));
        int fy = Integer.parseInt(fdob.substring(6, 10));
        DOB fobj = new DOB(fd, fm, fy);
        System.out.print("Enter years to increase: ");
        int increment = sc.nextInt();
        sc.close();
        System.out.println("-----------------------------------");
        System.out.println("Actual date of birth: ");
        obj.disp(name, oobj);
        obj.disp(friendName, fobj);
        obj.plus(oobj, fobj, increment);
        System.out.println("Changed date of birth: ");
        obj.disp(name, oobj);
        obj.disp(friendName, fobj);
    }
}
