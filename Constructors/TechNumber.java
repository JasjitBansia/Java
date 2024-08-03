/*
 * A tech number has even number of digits. If the number is split in two equal halves, then the square of sum of these halves is equal to the number itself.
 * Write a program to generate and print all four digit tech numbers.
 */

class TechNumber {

    static void techNumberGenerator() {
        for (int i = 1; i < 10000; i++) {
            String numString = Integer.toString(i).trim();
            if (numString.length() == 4) {
                int firstHalf = Integer.parseInt(numString.substring(0, 2));
                int secondHalf = Integer.parseInt(numString.substring(2, 4));
                if (Math.pow(firstHalf + secondHalf, 2) == Integer.parseInt(numString)) {
                    System.out.println(i + " is a tech number");
                }
            }
        }
    }

    public static void main(String[] args) {
        techNumberGenerator();
    }

}
