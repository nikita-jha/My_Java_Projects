import java.util.Scanner;

public class MiniCalculator {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Input first number: ");

            boolean hasAnInt = scanner.hasNextInt();
            if(hasAnInt) {
                int firstNumber = scanner.nextInt();
                System.out.println("Input second number: ");

                boolean hasSecondInt = scanner.hasNextInt();
                if (hasSecondInt) {
                    int secondNumber = scanner.nextInt();
                    int sum = firstNumber + secondNumber;
                    int difference = firstNumber - secondNumber;
                    int product = firstNumber * secondNumber;
                    int quotient = firstNumber / secondNumber;
                    int mod = firstNumber % secondNumber;
                    System.out.println(firstNumber + " + " + secondNumber + " = " + sum);
                    System.out.println(firstNumber + " - " + secondNumber + " = " + difference);
                    System.out.println(firstNumber + " x " + secondNumber + " = " + product);
                    System.out.println(firstNumber + " / " + secondNumber + " = " + quotient);
                    System.out.println(firstNumber + " mod " + secondNumber + " = " + mod);
                }else{
                    System.out.println("Invalid number");
                }
            }else{
                System.out.println("Invalid Number");
            }
            scanner.nextLine();

            scanner.close();
        }

    }


