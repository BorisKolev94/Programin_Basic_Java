package Lab;

import java.util.Scanner;

public class fruitShopNEW {
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
            if (fruit.equals("banana")) {
                price = 2.50 * quntity;
                System.out.printf("%.2f", price);
                break;
            } else if (fruit.equals("apple")) {
                price = 1.20 * quntity;
                System.out.printf("%.2f", price);
                break;
            } else if (fruit.equals("orange")) {
                price = 0.85 * quntity;
                System.out.printf("%.2f", price);
                break;
            } else if (fruit.equals("grapefruit")) {
                price = 1.45 * quntity;
                System.out.printf("%.2f", price);
                break;
            } else if (fruit.equals("kiwi")) {
                price = 2.70 * quntity;
                System.out.printf("%.2f", price);
                break;
            } else if (fruit.equals("pineapple")) {
                price = 5.50 * quntity;
                System.out.printf("%.2f", price);
                break;
            } else if (fruit.equals("grapes")) {
                price = 3.85 * quntity;
                System.out.printf("%.2f", price);
                break;
            }
            case "Saturday":
            case "Sunday":
                if (fruit.equals("banana")) {
                    price = 2.70 * quntity;
                    System.out.printf("%.2f", price);
                    break;
                } else if (fruit.equals("apple")) {
                    price = 1.25 * quntity;
                    System.out.printf("%.2f", price);
                    break;
                } else if (fruit.equals("orange")) {
                    price = 0.90 * quntity;
                    System.out.printf("%.2f", price);
                    break;
                } else if (fruit.equals("grapefruit")) {
                    price = 1.60 * quntity;
                    System.out.printf("%.2f", price);
                    break;
                } else if (fruit.equals("kiwi")) {
                    price = 3.00 * quntity;
                    System.out.printf("%.2f", price);
                    break;
                } else if (fruit.equals("pineapple")) {
                    price = 5.60 * quntity;
                    System.out.printf("%.2f", price);
                    break;
                } else if (fruit.equals("grapes")) {
                    price = 4.20 * quntity;
                    System.out.printf("%.2f", price);
                    break;
                }
            default:
                System.out.println("error");
                break;
        }

    }
}
