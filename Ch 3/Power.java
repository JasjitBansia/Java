/*
 * n^p means a number to a power p. Write a function called power which takes two arguments, a double value and an int value and returns the result as double value
 */

class Power{
    double power(double n, int p){
        double result = Math.pow(n, p);
        return result;
    }
    public static void main(String args[]){
        Power obj = new Power();
        double result = obj.power(5.65, 3);
        System.out.println("The result is " + result);
    }
}