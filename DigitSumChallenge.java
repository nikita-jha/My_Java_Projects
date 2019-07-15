public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println("The sum of the digits is " + sumDigits(38948937));
    }
    public static int sumDigits(int number) {
        if(number < 10 || number < 0) {
            return -1;
        }
        int sum = 0;
        //125 % 10 is 5. Sum is now 5. New number is now 125/10 = 12. 12 mod 10 is 2. Sum is now 7. New number is now
        //12 / 10 = 1. 1 mod 10 is 1. New sum is 8. New number is 0.
        while(number > 0) {
            int leastSignificantDigit = number%10;
            sum += leastSignificantDigit;

            number /= 10; //same thing as number = number / 10;
            continue;

        }
        return sum;
    }
}
