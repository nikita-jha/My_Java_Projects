import java.util.Scanner;

public class MultiplicationTablesPractice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a number: ");

        boolean hasAnInt = scanner.hasNextInt();
        if(hasAnInt) {
            int number = scanner.nextInt();
            for(int i = 1; i<= 10; i++) {
                int product = i * number;
                System.out.println(number + " x " + i + " = " + product);
            }
        }else{
            System.out.println("Invalid Number");
        }
        scanner.nextLine();
        scanner.close();
    }
}
