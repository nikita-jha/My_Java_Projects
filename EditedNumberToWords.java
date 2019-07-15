public class EditedNumberToWords {
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }

        if (number == 0) {
            System.out.println("Zero");
        }
        int difference = getDigitCount(number) - getDigitCount(reverse(number));
        //System.out.println("difference : " + difference) ;
        number = reverse(number);

        while (number > 0) {
            int lastDigit = number % 10;
            if (lastDigit == 0) {
                System.out.println("Zero");
            } else if (lastDigit == 1) {
                System.out.println("One");
            } else if (lastDigit == 2) {
                System.out.println("Two");
            } else if (lastDigit == 3) {
                System.out.println("Three");
            } else if (lastDigit == 4) {
                System.out.println("Four");
            } else if (lastDigit == 5) {
                System.out.println("Five");
            } else if (lastDigit == 6) {
                System.out.println("Six");
            } else if (lastDigit == 7) {
                System.out.println("Seven");
            } else if (lastDigit == 8) {
                System.out.println("Eight");
            } else {
                System.out.println("Nine");
            }
            number /= 10;

        }
        for (int i = 0; i < difference; i++) {
            System.out.println("Zero");
        }

    }

    public static int reverse(int number) {
        int reverse = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number /= 10;
        }
        return reverse;
    }

    public static int getDigitCount(int number) {
        int count = 0;
        if (number < 0) {
            return -1;
        }
        if (number == 0) {
            return 1;
        }
        while (number > 0) {
            number /= 10;
            count++;

        }
        return count;
    }
}

