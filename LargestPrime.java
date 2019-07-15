public class LargestPrime {
    public static int largestPrimeFactor(int number) {
        int i;
        int copyOfInput = number;
        for (i = 2; i <= copyOfInput; i++) {
            if (copyOfInput % i == 0) {
                copyOfInput /= i;
                i--;

            }

        }
        return i;

    }
}
