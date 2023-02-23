package exercises;

import java.util.Scanner;

public class cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String projection = scanner.nextLine();
        double row = Double.parseDouble(scanner.nextLine());
        double colum = Double.parseDouble(scanner.nextLine());
        double price = 0;
        double finalPrice = 0;
        switch (projection) {
            case "Premiere":
                price = 12.00;
                finalPrice = price * row * colum;
                System.out.printf("%.2f", finalPrice);
                break;
            case "Normal":
                price = 7.50;
                finalPrice = price * row * colum;
                System.out.printf("%.2f", finalPrice);
                break;
            case "Discount":
                price = 5.00;
                finalPrice = price * row * colum;
                System.out.printf("%.2f", finalPrice);
                break;
        }


    }

}


