/*
 * Write a class with the name "volume" using method overloading that computes the volume of a cube, a sphere and a cuboid
 * Volume of a cube (VC) = a * a * a
 * Volume of a cube (VS) = 4/3 * p * r³
 * Volume of a cube (VCd) = l * b * h
 */

class volume {
    int Volume(int a) {
        int volumeOfCube = a * a * a;
        return volumeOfCube;
    }

    double Volume(double r) {
        double volumeOfSphere = 4 / 3 * 3.14 * Math.pow(r, 3);
        return volumeOfSphere;
    }

    int Volume(int l, int b, int h) {
        int volumeOfCuboid = l * b * h;
        return volumeOfCuboid;
    }

    public static void main(String[] args) {
        int side = 5;
        double radius = 6.45;
        int length = 12;
        int breadth = 5;
        int height = 8;
        volume obj = new volume();
        int VC = obj.Volume(side);
        double VS = obj.Volume(radius);
        int VCd = obj.Volume(length, breadth, height);
        System.out.println("The volume of the cube is " + VC + " cm cube");
        System.out.println("The volume of the sphere is " + VS + " cm cube");
        System.out.println("The volume of the cuboid is " + VCd + " cm cube");
    }
}
