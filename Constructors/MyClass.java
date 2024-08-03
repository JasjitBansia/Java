/*
 * Write a Java class MyClass. The description of the class is: 
 * Members: Instance variable, constructror, main method
 * Member name: age
 * Description: To store age of a stuudent. Initialises age to 14 and increments age by 1 and displays result.
 */

class MyClass {
    int age;

    MyClass() {
        age = 14;
    }

    public static void main(String args[]) {
        MyClass obj = new MyClass();
        System.out.println(++obj.age);
    }
}