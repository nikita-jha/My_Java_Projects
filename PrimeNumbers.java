public class PrimeNumbers {
    public static void main(String[] args) {

        int result = 0;

        for (int i = 10; i < 50; i++) {
            if(isPrime(i)) {

                result += i;

                }
            }
        System.out.println(result);
        }



    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= n/ 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
