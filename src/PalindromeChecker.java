public class PalindromeChecker {
    public static void main(String[] args){



        String input = "madam";

        System.out.println("Original String: " + input);

        String reversed = "";

        // Iterate from the last character to the first
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        System.out.println("Reversed String: " + reversed);

        // Compare original and reversed using equals()
        if (input.equals(reversed)) {
            System.out.println("Result: The string is a Palindrome ✅");
        } else {
            System.out.println("Result: The string is NOT a Palindrome ❌");
        }
    }



}
