public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(75457));
    }
    public static boolean isPalindrome(int number) {
        int palindrome = number;
        int reverse = 0;

        while (palindrome != 0) {
            int lastDigit = palindrome % 10;
            reverse = reverse * 10 + lastDigit;
            palindrome = palindrome / 10;
        }

        if (number == reverse) {
            return true;
        }
        return false;
    }

}
