public class algebra {
    int compute(int x, int y) {
        int fx = x * x + 2 * x + 4;
        int fy = -(y * y) - 20 * y - 1;
        int fxy = fx - fy;
        return fxy;
    }

    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        algebra obj = new algebra();
        int result = obj.compute(x, y);
        System.out.println(result);
    }
}
