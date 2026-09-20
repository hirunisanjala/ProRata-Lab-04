import java.util.Scanner;

public class IT23249820Lab4Q3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        String result =
                (number > 0)
                ? "Positive"
                : (number < 0)
                    ? "Negative"
                    : "Zero";

        System.out.println("The number is: " + result);

        input.close();
    }
}