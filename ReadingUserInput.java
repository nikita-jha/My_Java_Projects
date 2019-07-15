import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year of birth:");

        boolean hasNextInt = scanner.hasNextInt();

        if (hasNextInt) {
            int yearOfBirth = scanner.nextInt(); //By saying nextInt, what the user types is automatically converted into an integer and saved in the variable
            scanner.nextLine(); //done to handle next line character (enter key)

            System.out.println("Enter you name: ");
            String name = scanner.nextLine();

            int age = 2019 - yearOfBirth;
            if (age >= 0 && age <= 100) {
                System.out.println("Your name is " + name + ", and you are " + age + " years old.");
            } else {
                System.out.println("Invalid year of birth");
            }
        }else{
            System.out.println("Unable to pass year of birth. ");

        }


        scanner.close();
    }
}
