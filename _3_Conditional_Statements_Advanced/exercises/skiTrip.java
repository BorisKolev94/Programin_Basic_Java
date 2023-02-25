package exercises;

import java.util.Scanner;

public class skiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        String room = scanner.nextLine();
        String mark = scanner.nextLine();

        double price = 0;

        switch (room) {
            case "room for one person":
                    price = (days - 1) * 18.0;
                break;
            case "apartment":
                price = (days-1) * 25.00;
                if (days < 10) {
                    price = price - (price * 0.30);
                } else if (days >= 10 && days <= 15) {
                    price = price - (price * 0.35);
                } else if (days > 15) {
                    price = price - (price * 0.50);
                }
                break;
            case "president apartment":
                price = (days-1) *35.00;
                if (days < 10) {
                    price = price - (price * 0.30);
                } else if (days >= 10 && days <= 15) {
                    price = price - (price * 0.15);
                } else if (days > 15) {
                    price = price - (price * 0.20);
                }
                break;
        }
        if (mark.equals("positive")) {
            price = price + (price * 0.25);
        } else if (mark.equals("negative")) {
            price = price - (price * 0.10);
        }

        System.out.printf("%.2f", price);
    }
}