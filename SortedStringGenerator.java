// time complexity: O(k(c)^k)


import java.util.Scanner;

public class SortedStringGenerator {

    static int numChars = 26;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        printSortedStrings(number);
    }

    static void printSortedStrings(int remaining) {
        printSortedStrings(remaining, "");
    }

    static void printSortedStrings(int remaining, String prefix) {
        if (remaining == 0) {
            if (isInOrder(prefix)) {
                System.out.println(prefix);
            }
        } else {
            for (int i = 0; i < numChars; i++) {
                char c = ithLetter(i);
                printSortedStrings(remaining - 1, prefix + c);
            }
        }
    }

    static boolean isInOrder(String s) {
        for (int i = 1; i < s.length(); i++) {
            int prev = ithLetter(s.charAt(i - 1));
            int curr = ithLetter(s.charAt(i));
            if (prev > curr) {
                return false;
            }
        }
        return true;
    }

    static char ithLetter(int i) {
        return (char) (((int) 'a') + i);
    }
}
