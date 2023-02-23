package exercises;

import java.util.Scanner;

public class fishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String seazon = scanner.nextLine();
        int numberOfFishermen = Integer.parseInt(scanner.nextLine());

        double priceTourism = 0;

        switch (seazon) {
            case "Spring":
                priceTourism = 3000;
                break;
            case "Summer":
                priceTourism = 4200;
                break;
            case "Autumn":
                priceTourism = 4200;
                break;
            case "Winter":
                priceTourism = 2600;
                break;
        }
        if (numberOfFishermen <= 6) {
            priceTourism = priceTourism - (priceTourism * 0.10);
        } else if (numberOfFishermen > 7 && numberOfFishermen <= 11) {
            priceTourism = priceTourism - (priceTourism * 0.15);
        } else if (numberOfFishermen > 12) {
            priceTourism = priceTourism - (priceTourism * 0.25);
        }
        if (numberOfFishermen % 2 == 0 && !seazon.equals("Autumn")) {
            priceTourism = priceTourism - (priceTourism * 0.05);
        }
        if (budget >= priceTourism) {
            System.out.printf("Yes! You have %.2f leva left.", budget - priceTourism);

        } else {
            System.out.printf("Not enough money! You need %.2f leva.", priceTourism - budget);
        }
    }
}