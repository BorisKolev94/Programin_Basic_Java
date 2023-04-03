package Exercise;

import java.util.Scanner;

public class trainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int countAllGrades = 0;
        double allGrades=0;

        String command = scanner.nextLine();
        while (!command.equals("Finish")) {
            String presentation = command;

            double sumCurrentGrades = 0;
            for (int i = 1; i <= n; i++) {
                double currentGrades = Double.parseDouble(scanner.nextLine());
                countAllGrades++;
                sumCurrentGrades = sumCurrentGrades + currentGrades;
            }
            allGrades= allGrades+sumCurrentGrades;
            double avgCurrentGrade= sumCurrentGrades/n;
            System.out.printf("%s - %.2f.\n", presentation, avgCurrentGrade);

            command = scanner.nextLine();
        }
        double finalGrade= allGrades/countAllGrades;
        System.out.printf("Student's final assessment is %.2f.\n", finalGrade);
    }
}
