/*
 * Define method in the class Algebra to find the difference in the two expressions given
 * f₁(x) = x² + 2x + 4
 * f₂(y) = -y² - 20y - 1
 * f₃ = f₁(x) - f₂(y)
 * Where values of x and y will be passwrd to the main() method
 */

public class Algebra {
    int compute(int x, int y) {
        int fx = x * x + 2 * x + 4;
        int fy = -(y * y) - 20 * y - 1;
        int fxy = fx - fy;
        return fxy;
    }

    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        Algebra obj = new Algebra();
        int result = obj.compute(x, y);
        System.out.println(result);
    }
}
