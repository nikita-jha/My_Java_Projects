import java.util.Scanner;

public class MinAndMaxChallenge {

    public static void main(String[] args) {
        //Every code with comment after it can be avoided. Alternative solution is to set min to max value an int can
        //hold and set max to the min value an int can hold
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 0;

        boolean first = true; // this part

        while(true) {
            System.out.println("Enter number:");

            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt) {
                int number = scanner.nextInt();
                if(first) { //this part
                    first = false; // this part
                    min = number; // this part
                    max = number; // this part
                }

                if(number > max) {
                    max = number;
                }
                if(number < min) {
                    min = number;
                }

            }else{
                break;
            }
            scanner.nextLine();
        }
        System.out.println("The maximum number is " + max + ", and the minimum number is " + min);
        scanner.close();
    }
}
