package algo_8;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean hasTrueResult = false;

        while (true) {
            System.out.print("Input string >> ");
            String str = scanner.nextLine();

            boolean isPalindrome = isPalindrome(str);
            System.out.println(isPalindrome);

            if (isPalindrome) {
                hasTrueResult = true;
                break; // Break the loop if isPalindrome is true
            }
        }

        // Additional code or questions can be added here...

        scanner.close();
    }

    private static boolean isPalindrome(String A) {
        LinkedStack<Character> s = new LinkedStack<>();
        LinkedQueue<Character> q = new LinkedQueue<>();

        for (int i = 0; i < A.length(); i++) {
            char c = Character.toLowerCase(A.charAt(i));
            if (Character.isLetter(c)) {
                s.push(c);
                q.enqueue(c);
            }
        }

        while (!q.isEmpty()) {
            if (s.pop() != q.dequeue()) {
                return false;
            }
        }

        return true;
    }
}
