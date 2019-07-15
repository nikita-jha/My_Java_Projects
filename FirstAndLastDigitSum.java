public class FirstAndLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {
        int firstDigit = number;
        int lastDigit = number % 10;

        if (number < 0) {
            return -1;
        } else if (number > 0 && number < 10) {
            return number + number;

        }

        while (firstDigit >= 10) {
            firstDigit /= 10;
        }
        int sum = firstDigit + lastDigit;
        return sum;

    }

}
