package exercises;

import java.util.Scanner;

public class toyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double excursionPrice = Double.parseDouble(scanner.nextLine());
        double puzzles = Double.parseDouble(scanner.nextLine());
        double dols = Double.parseDouble(scanner.nextLine());
        double teddyBears = Double.parseDouble(scanner.nextLine());
        double minions = Double.parseDouble(scanner.nextLine());
        double trucks = Double.parseDouble(scanner.nextLine());

        double pricePuzzles = puzzles * 2.60;
        double priceDols = dols * 3;
        double priceteddyBears = teddyBears * 4.10;
        double priceMinions = minions * 8.20;
        double priceTrucks = trucks * 2;

        double totalToys = puzzles + dols + teddyBears + minions + trucks;
        double totalPrice = pricePuzzles + priceDols + priceteddyBears + priceMinions + priceTrucks;


        if (totalToys >= 50) {
            totalPrice = totalPrice * 0.75;
        }
        totalPrice = totalPrice * 0.90;

        if (totalPrice >= excursionPrice) {
            System.out.printf("Yes! %.2f lv left.", totalPrice - excursionPrice);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", excursionPrice - totalPrice);
        }
    }
    }
