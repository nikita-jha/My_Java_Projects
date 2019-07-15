public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(11, 22, 31));
    }

    public static boolean hasSameLastDigit(int iFirst, int iSecond, int iThird) {
        if ((iFirst < 10 || iFirst > 1000) || (iSecond < 10 || iSecond > 1000) || (iThird < 10 || iThird > 1000)) {
            return false;
        }
        int lastDigitF = iFirst % 10;
        int lastDigitS = iSecond % 10;
        int lastDigitT = iThird % 10;

        if ((lastDigitF == lastDigitS) || (lastDigitS == lastDigitT) || (lastDigitT == lastDigitF) ||
                ((lastDigitF == lastDigitS) && lastDigitS == lastDigitT)) {
            return true;

        }
        return false;
    }

    public static boolean isValid(int number) {
        if (number >= 10 && number <= 1000) {
            return true;
        }
        return false;
    }
}