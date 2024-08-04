/*
 * Create a calss with the follow specifications:
 * 
 * Class name: Calculate
 * Member variables: num
 * Constructor: Parameterised
 * 
 * Member method:
 * a. reverse() to generate the reverse of a number.
 * b. palindrome() to check whether an entered number is palindrome or not.
 * c. prime() to check whether an entered number is prime or not.
 */

class Calculate {
  int num;

  Calculate(int n) {
    num = n;
  }

  void reverse(Calculate obj) {
    int n = obj.num;
    int reversed = 0;
    while (n != 0) {
      int digit = n % 10;
      reversed = reversed * 10 + digit;
      n /= 10;
    }
    System.out.println("Reverse of " + obj.num + " is: " + reversed);

  }

  void palindrome(Calculate obj) {

    int n = obj.num;
    int reversed = 0;
    while (n != 0) {
      int digit = n % 10;
      reversed = reversed * 10 + digit;
      n /= 10;
    }
    if (reversed == obj.num) {
      System.out.println(obj.num + " is a palindrome");
    } else {
      System.out.println(obj.num + " is not a palindrome");
    }
  }

  void prime(Calculate obj) {
    int n = obj.num;
    int i = 2;
    for (; i <= n; i++) {
      if (n % i == 0) {
        if (n == i) {
          System.out.println(obj.num + " is a prime number");
        } else {
          System.out.println(obj.num + " is not a prime number");
        }
        return;
      }
    }
  }

  public static void main(String[] args) {
    Calculate obj = new Calculate(1091);
    obj.reverse(obj);
    obj.palindrome(obj);
    obj.prime(obj);
  }
}
