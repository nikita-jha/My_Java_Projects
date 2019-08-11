import java.util.Scanner;

public class addingBinaryNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first binary number: ");


            String binaryString = scanner.nextLine();
            int intConversion = Integer.parseInt(binaryString,2);

            System.out.println("Input second binary number: ");

                String secondBinaryString = scanner.nextLine();
                int secondIntConversion = Integer.parseInt(secondBinaryString,2);
                int sum = intConversion + secondIntConversion;
                String binarySum = Integer.toBinaryString(sum);
                System.out.println("Sum of the two binary numbers: " + binarySum + "\r");


    }
}
