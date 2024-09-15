/*
 * iv. 
 * B
 * L L 
 * U U U 
 * E E E E 
 * J J J J
 */

class pattern4 {
    public static void main(String[] args) {
        int index = 0;
        String str = "BLUEJ";
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(str.charAt(index) + " ");
            }
            System.out.println();
            index++;
        }
    }
}