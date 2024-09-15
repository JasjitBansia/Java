/*
 * ii.
 * A
 * B C
 * D E F
 * G H I J
 * K L M N O
 */

class pattern2 {
    public static void main(String[] args) {
        int n = 65;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) n++ + " ");
            }
            System.out.println();
        }
    }
}