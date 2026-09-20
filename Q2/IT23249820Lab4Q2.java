import java.util.Scanner;

public class IT23249820Lab4Q2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter exam marks (out of 100): ");
        double examMark = input.nextDouble();

        if (examMark < 0 || examMark > 100) {

            System.out.println(
                    "Invalid input for exam marks. Terminating program."
            );

        } else {

            System.out.print(
                    "Please enter lab submission marks (out of 100): "
            );
            double labMark = input.nextDouble();

            if (labMark < 0 || labMark > 100) {

                System.out.println(
                        "Invalid input for lab submission marks. " +
                        "Terminating program."
                );

            } else {

                System.out.print(
                        "Please enter the percentage given for the exam: "
                );
                int examPercentage = input.nextInt();

                System.out.print(
                        "Please enter the percentage given for " +
                        "the lab submission: "
                );
                int labPercentage = input.nextInt();

                if (examPercentage + labPercentage != 100) {

                    System.out.println(
                            "The percentages must add up to 100. " +
                            "Terminating program."
                    );

                } else {

                    double finalMark =
                            (examMark * examPercentage / 100.0)
                            +
                            (labMark * labPercentage / 100.0);

                    System.out.println();
                    System.out.println(
                            "Final Exam Mark is : " + finalMark
                    );
                }
            }
        }

        input.close();
    }
}