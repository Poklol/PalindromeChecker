public class PalindromeChecker {
    public static void main(String[] args){
        System.out.println("===================================");
        System.out.println("      PALINDROME CHECKER APP       ");
        System.out.println("===================================");
        System.out.println("Application Version: 1.0");
        System.out.println("Status: Application Started Successfully");


        String input = "madam";

        System.out.println("Checking Hardcoded String: " + input);

        boolean isPalindrome = true;

        // Compare characters from both ends
        for (int i = 0; i < input.length() / 2; i++) {

            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Display Result
        if (isPalindrome) {
            System.out.println("Result: The string is a Palindrome ");
        } else {
            System.out.println("Result: The string is NOT a Palindrome ");
        }

        System.out.println("\nProgram Ended Successfully.");
    }

}
