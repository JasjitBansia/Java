public class q4 {
    int volume(int a) {
        int volumeOfCube = a * a * a;
        return volumeOfCube;
    }

    double volume(double r) {
        double volumeOfSphere = 4 / 3 * 3.14 * Math.pow(r, 3);
        return volumeOfSphere;
    }

    int volume(int l, int b, int h) {
        int volumeOfCuboid = l * b * h;
        return volumeOfCuboid;
    }

    public static void main(String[] args) {
        int side = 5;
        double radius = 6.45;
        int length = 12;
        int breadth = 5;
        int height = 8;
        q4 obj = new q4();
        int VC = obj.volume(side);
        double VS = obj.volume(radius);
        int VCd = obj.volume(length, breadth, height);
        System.out.println("The volume of the cube is " + VC + " cm cube");
        System.out.println("The volume of the sphere is " + VS + " cm cube");
        System.out.println("The volume of the cuboid is " + VCd + " cm cube");
    }
}
