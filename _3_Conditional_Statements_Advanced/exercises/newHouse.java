package exercises;

import java.util.Scanner;

public class newHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeFlowers = scanner.nextLine();
        int numberFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double finalPrice = 0;
        switch (typeFlowers) {
            case "Roses":
                finalPrice = 5 * numberFlowers;
                if (numberFlowers > 80) {
                    finalPrice = finalPrice - (finalPrice * 0.10);
                }
                break;
            case "Dahlias":
                finalPrice = 3.80 * numberFlowers;
                if (numberFlowers > 90) {
                    finalPrice = finalPrice - (finalPrice * 0.15);
                }
                break;
            case "Tulips":
                finalPrice = 2.80 * numberFlowers;
                if (numberFlowers > 80) {
                    finalPrice = finalPrice - (finalPrice * 0.15);
                }
                break;
            case "Narcissus":
                finalPrice = 3 * numberFlowers;
                if (numberFlowers < 120) {
                    finalPrice = finalPrice + (finalPrice * 0.15);
                }
                break;
            case "Gladiolus":
                finalPrice = 2.50 * numberFlowers;
                if (numberFlowers < 80) {
                    finalPrice = finalPrice + (finalPrice * 0.20);
                }
                break;
        }
        if (finalPrice <= budget) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", numberFlowers, typeFlowers,budget-finalPrice);
        }else{
            System.out.printf("Not enough money, you need %.2f leva more.", finalPrice-budget);
        }
    }
}

