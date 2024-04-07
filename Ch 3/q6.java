class q6 {
    int square(int num) {
        return num * num;
    }

    int cube(int num) {
        return num * num * num;
    }

    public static void main(String[] args) {
        int num = 5;
        q6 obj = new q6();
        int square = obj.square(num);
        int cube = obj.cube(num);
        System.out.println("The square of the number is " + square);
        System.out.println("The cube of the number is " + cube);

    }
}
