// Strategy Interface
interface PalindromeStrategy {
    boolean check(String input);
}


// Stack-based implementation
class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean check(String input) {

        java.util.Stack<Character> stack = new java.util.Stack<>();

        // Push all characters into stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare original string with popped characters
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}


// Deque-based implementation
class DequeStrategy implements PalindromeStrategy {

    @Override
    public boolean check(String input) {

        java.util.Deque<Character> deque = new java.util.LinkedList<>();

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
}
public class PalindromeChecker {
    public static void main(String[] args){



        String input = "Level";

        // Normalize for case-insensitive comparison
        input = input.toLowerCase();

        // Choose strategy at runtime
        PalindromeStrategy strategy;

        // You can switch algorithm here dynamically
        strategy = new StackStrategy();
        // strategy = new DequeStrategy();

        boolean result = strategy.check(input);

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome?: " + result);
    }



}
