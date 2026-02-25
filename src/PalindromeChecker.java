import java.util.Stack;
import java.util.LinkedList;
import java.util.Deque;

public class PalindromeChecker {

    // Two Pointer approach
    public static boolean twoPointerCheck(String input) {
        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Stack approach
    public static boolean stackCheck(String input) {
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    // Deque approach
    public static boolean dequeCheck(String input) {
        Deque<Character> deque = new LinkedList<>();

        for (char c : input.toCharArray()) {
            deque.add(c);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }

    // Main method (ONLY ONE)
    public static void main(String[] args) {

        String input = "level";
        input = input.toLowerCase();

        // Benchmark Two Pointer
        long startTime1 = System.nanoTime();
        boolean result1 = twoPointerCheck(input);
        long duration1 = System.nanoTime() - startTime1;

        // Benchmark Stack
        long startTime2 = System.nanoTime();
        boolean result2 = stackCheck(input);
        long duration2 = System.nanoTime() - startTime2;

        // Benchmark Deque
        long startTime3 = System.nanoTime();
        boolean result3 = dequeCheck(input);
        long duration3 = System.nanoTime() - startTime3;

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome? " + result1);
        System.out.println();

        System.out.println("Two Pointer Execution Time: " + duration1 + " ns");
        System.out.println("Stack Execution Time: " + duration2 + " ns");
        System.out.println("Deque Execution Time: " + duration3 + " ns");
    }
}