public class EvenDigitSum {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
    }
    public static int getEvenDigitSum(int number) {
        if(number < 0) {
            return -1;
        }
        int count = 0;
        int resultingNumber = number;

        while(resultingNumber != 0) {
            if((resultingNumber % 10) % 2 == 0) {
                count += resultingNumber % 10;
            }
            resultingNumber = resultingNumber / 10;
        }
        return count;
    }
}
