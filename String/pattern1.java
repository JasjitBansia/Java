/*
 * Write a program to display the following
 * 
 * i.
 * A B C D E
 * B C D E
 * C D E
 * D E
 * E
 * 
 */

class pattern1 {
    public static void main(String[] args) {
        for (int i = 65; i <= 69; i++) {
            for (int j = i; j <= 69; j++) {
                System.out.print((char) j + " ");
            }
            System.out.println();
        }
    }
}
