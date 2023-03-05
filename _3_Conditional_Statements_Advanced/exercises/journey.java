package exercises;

import java.util.Scanner;

public class journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String seazon = scanner.nextLine();

        String destination = "";
        String typeOfVacation = "";

        if (budget <= 100) {
            destination = "Bulgaria";
            if (seazon.equals("summer")) {
                typeOfVacation = "Camp";
                budget = budget * 0.30;
            } else if (seazon.equals("winter")) {
                typeOfVacation = "Hotel";
                budget = budget * 0.70;
            }
        } else if (budget>100 && budget <= 1000) {
            destination = "Balkans";
            if (seazon.equals("summer")) {
                typeOfVacation = "Camp";
                budget = budget * 0.40;
            } else if (seazon.equals("winter")) {
                typeOfVacation = "Hotel";
                budget = budget * 0.80;
            }
        } else if (budget>1000){
            destination = "Europe";
            typeOfVacation = "Hotel";
            budget = budget * 0.90;
        }
        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", typeOfVacation,budget);
    }
}