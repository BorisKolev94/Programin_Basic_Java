package forLoopExercise;

import org.w3c.dom.Text;

import java.util.Scanner;

public class oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameOfActior = scanner.nextLine();
        double pointFromTheAcademy= Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        double totalPoints= pointFromTheAcademy;

        for (int i = 1; i<=n;i++) {
            String nameJury = scanner.nextLine();
            double pointJury = Double.parseDouble(scanner.nextLine());
            int lenght = nameJury.length();
            double calculatedPoints = pointJury * lenght / 2;
            totalPoints = totalPoints + calculatedPoints;

            if (totalPoints > 1250.5) {
                break;
            }
        }
if (totalPoints>1250.5){
    System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", nameOfActior, totalPoints);
}else {
    System.out.printf("Sorry, %s you need %.1f more!", nameOfActior, 1250.5-totalPoints);
}



        }
    }

