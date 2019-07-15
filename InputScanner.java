import java.util.Scanner;

public class InputScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int XX = 0;
        double YY;
        int count = 0;


        while (true) {
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                double number = scanner.nextInt();
                XX += number;
                count++;
            } else {
                break;
            }
        }
            YY= ((double)XX/count);
            YY = (int)Math.round(YY);
        scanner.nextLine();
        System.out.println("SUM = " + XX + " AVG = " + (int)YY);
        scanner.close();
    }
}
