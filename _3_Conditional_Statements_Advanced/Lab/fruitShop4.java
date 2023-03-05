package Lab;

import java.util.Scanner;

public class fruitShop4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double quntity = Double.parseDouble(scanner.nextLine());
        double price = 0;

        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                switch (fruit) {
                    case "banana":
                        price = 2.50 * quntity;
                    case "apple":
                        price = 1.20 * quntity;
                    case "orange":
                        price = 0.85 * quntity;
                    case "grapefruit":
                        price = 1.45 * quntity;
                    case "kiwi":
                        price = 2.70 * quntity;
                    case "pineapple":
                        price = 5.50 * quntity;
                    case "grapes":
                        price = 3.85 * quntity;
                        System.out.printf("%.2f", price);
                        break;
                }
            case "Saturday":
            case "Sunday":
                switch (fruit) {
                    case "banana":
                        price = 2.70 * quntity;
                    case "apple":
                        price = 1.25 * quntity;
                    case "orange":
                        price = 0.90 * quntity;
                    case "grapefruit":
                        price = 1.60 * quntity;
                    case "kiwi":
                        price = 3.00 * quntity;
                    case "pineapple":
                        price = 5.60 * quntity;
                    case "grapes":
                        price = 4.20 * quntity;
                        System.out.printf("%.2f", price);
                        break;

                } default:
                System.out.println("error");
                break;
        }

    }
}
