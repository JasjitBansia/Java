/* 
 * Write a function to calculate and return the sum of the series, the value of n must be passed as a parameter
 * i. 1 + 2 + 3 + ...n
 * ii. 2² + 4² + 6² + 8² + ...n terms
 * iii. fn(x) = 1 + x²/3! + x³/5! + x^4/7! + x^n/(2n - 1)!
 */

class seriesSum {
    int series1(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    int series2(int n) {
        int sum = 0;
        for (int i = 2; i <= n; i += 2) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    double series3(int x, int n) {
        double sum = 0;
        int factorial = 1;

        for (int power = 2; power <= n; power++) {
            int noForFactorial = 2 * power - 1;
            for (int i = 1; i <= noForFactorial; i++) {
                factorial *= i;
            }
            sum += 1 + Math.pow(x, power) / factorial;
            factorial = 1;
        }
        return sum;
    }

    public static void main(String args[]) {
        seriesSum obj = new seriesSum();
        int sum = obj.series1(4);
        System.out.println("The sum of first series is " + sum);
        int sum2 = obj.series2(10);
        System.out.println("The sum of second series is " + sum2);
        double sum3 = obj.series3(6, 7);
        System.out.println("The sum of third series is " + sum3);
    }
}