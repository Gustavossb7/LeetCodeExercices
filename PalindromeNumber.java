public class PalindromeNumber {

    public static boolean isPalindrome(int x) {
        String original = String.valueOf(x);
        StringBuilder reversed = new StringBuilder(original).reverse();
        return original.equals(reversed.toString());
    }


    public static void main(String[] args) {
        int number = 4312134;
        boolean result = isPalindrome(number);

        if (result) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }
}
