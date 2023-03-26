import java.util.Scanner;

public class easterDecoration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfPeople = Integer.parseInt(scanner.nextLine());
        double totalSum = 0.0;

        for (int i = 1; i <= countOfPeople; i++) {
            String input = scanner.nextLine();
            int count = 0;
            double price = 0.0;
            while (!input.equals("Finish")) {
                String type = input;
                switch (type) {
                    case "basket":
                        price += 1.5;
                        break;
                    case "wreath":
                        price += 3.8;
                        break;
                    case "chocolate bunny":
                        price += 7;
                        break;
                }
                count++;
                input = scanner.nextLine();
            }
            if (count % 2 == 0) {
                price = price - (price * 0.2);
            }
            totalSum += price;
            System.out.printf("You purchased %d items for %.2f leva.%n", count, price);
        }
        System.out.printf("Average bill per client is: %.2f leva.", totalSum / countOfPeople);
    }
}
