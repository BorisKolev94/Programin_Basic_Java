package exercises;

import java.util.Scanner;

public class shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        double videoCards = Double.parseDouble(scanner.nextLine());
        double procesors = Double.parseDouble(scanner.nextLine());
        double ram = Double.parseDouble(scanner.nextLine());

        double priceVideo = videoCards * 250;
        double priceProcesors = procesors * (priceVideo * 0.35);
        double priceRam = ram * (priceVideo * 0.10);
        double finalPrice = priceVideo + priceProcesors + priceRam;

        if (videoCards > procesors) {
           finalPrice = finalPrice - (finalPrice * 0.15);
        }

       if (budget >= finalPrice) {
            System.out.printf("You have %.2f leva left!", budget - finalPrice );
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", finalPrice - budget);
        }

    }
}

