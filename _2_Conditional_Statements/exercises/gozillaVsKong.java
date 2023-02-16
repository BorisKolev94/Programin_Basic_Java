package exercises;

import java.util.Scanner;

public class gozillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int statisti = Integer.parseInt(scanner.nextLine());
        double priceClothes = Double.parseDouble(scanner.nextLine());
        double decor = budget*0.10;
        if (statisti>=150){
            priceClothes= priceClothes*0.90;
        }
        double expences= priceClothes*statisti+decor;
        if (expences>budget){
            double diff = expences-budget;
            System.out.printf("Not enough money!\nWingard needs %.2f leva more.", diff);
        }
        if (budget>=expences){
            double diff = budget-expences;
            System.out.printf("Action!\nWingard starts filming with %.2f leva left.", diff);
        }

    }
}
