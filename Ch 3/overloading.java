/*
 * Design a class to overload a function series() as follows:
 * a. void series(int x, int n) - To display the sum of the series given below
 *  x^1 + x^2 + x^3 + ...... x^n terms 
 * b. void series(int p) - To display the following series
 *  0, 7, 26, 63 ..... p terms
 * c. void series() - To display the sum of the series given below
 * 1/2 + 1/3 + 1/4 ...... 1/10
 */

class overloading {
    void series(int x, int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += Math.pow(x, i);
        }
        System.out.println("The sum of the first series is " + sum);
    }

    void series() {
        double sum = 0.0;
        for (int i = 2; i <= 10; i++) {
            sum += (double) 1 / i;
        }
        System.out.println("The sum of the third series is " + sum);
    }

    public static void main(String args[]) {
        overloading obj = new overloading();
        obj.series(5, 4);
        obj.series();
    }
}