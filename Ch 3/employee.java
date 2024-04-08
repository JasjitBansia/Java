public class employee {
    public static void main(String[] args) {
        int basic = 40000;
        int DA = (25 * basic) / 100;
        int HRA = (15 * basic) / 100;
        double PF = (8.33 * basic) / 100;
        int NP = basic + DA + HRA;
        int GP = (int) (NP - PF);
        System.out.println("Dearness allowance: " + DA + " rupees");
        System.out.println("House rent allowance: " + HRA + " rupees");
        System.out.println("Provident fund: " + (int) PF + " rupees");
        System.out.println("Net pay: " + NP + " rupees");
        System.out.println("Gross pay: " + GP + " rupees");
    }
}
