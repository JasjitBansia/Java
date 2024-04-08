import java.util.Scanner;;

public class salary {

    double incomeTax(int salary) {
        if (salary > 175000) {
            double tax = (5 * salary) / 100;
            return tax;
        } else {
            return 0.0;
        }
    }

    void acceptDetails() {
        String name;
        String address;
        int phoneNumber;
        String subject;
        int Salary;
        Scanner sc = new Scanner(System.in);
        salary obj = new salary();
        System.out.println("Enter your name: ");
        name = sc.nextLine();
        System.out.println("Enter your address: ");
        address = sc.nextLine();
        System.out.println("Enter your phone number: ");
        phoneNumber = sc.nextInt();
        System.out.println("Enter your subject of specialisation: ");
        subject = sc.next();
        System.out.println("Enter your monthly salary: ");
        Salary = sc.nextInt();
        sc.close();
        obj.displayDetails(name, address, phoneNumber, subject, Salary);

    }

    void displayDetails(String name, String address, int phoneNumber, String subject, int Salary) {
        salary obj = new salary();
        System.out.println("----------------------------------------");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone number: +91 " + phoneNumber);
        System.out.println("Subject of specialisation: " + subject);
        System.out.println("Monthly salary: " + Salary + " rupees");
        int annualSalary = Salary * 12;
        System.out.println("Annual income tax: " + obj.incomeTax(annualSalary) + " rupees");
        System.out.println("----------------------------------------");

    }

    public static void main(String[] args) {
        salary obj = new salary();
        obj.acceptDetails();
    }
}
