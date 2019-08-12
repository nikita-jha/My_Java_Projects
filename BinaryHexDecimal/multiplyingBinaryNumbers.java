import java.util.Scanner;

public class multiplyingBinaryNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the first binary number: ");

        String binaryString = scanner.nextLine();
        int firstIntConversion = Integer.parseInt(binaryString, 2);

        int firstInt = firstIntConversion;

        System.out.println("Input the second binary number: ");

        String binaryStringTwo = scanner.nextLine();
        int secondIntConversion = Integer.parseInt(binaryStringTwo, 2);

        int secondInt = secondIntConversion;

        int product = firstInt * secondInt;

        String binaryProduct = Integer.toBinaryString(product);

        System.out.println("The product of " + binaryString + " and " + binaryStringTwo + " = " + binaryProduct);
    }
}
