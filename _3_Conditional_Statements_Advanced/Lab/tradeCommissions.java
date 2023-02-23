package Lab;

import java.util.Scanner;

public class tradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String town = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());

        double commision = 0;

        switch (town) {
            case "Sofia":
                if (sales >= 0 && sales <= 500) {
                    commision = sales * 0.05;
                    System.out.printf("%.2f", commision);
                } else if (sales > 500 && sales <= 1000) {
                    commision = sales * 0.07;
                    System.out.printf("%.2f", commision);
                } else if (sales > 1000 && sales <= 10000) {
                    commision = sales * 0.08;
                    System.out.printf("%.2f", commision);
                } else if (sales > 10000) {
                    commision = sales * 0.12;
                    System.out.printf("%.2f", commision);
                } else {
                    System.out.printf("%.2f", commision);
                }
                break;
            case "Varna":
                if (sales >= 0 && sales <= 500) {
                    commision = sales * 0.045;
                    System.out.printf("%.2f", commision);
                } else if (sales > 500 && sales <= 1000) {
                    commision = sales * 0.075;
                    System.out.printf("%.2f", commision);
                } else if (sales > 1000 && sales <= 10000) {
                    commision = sales * 0.10;
                    System.out.printf("%.2f", commision);
                } else if (sales > 10000) {
                    commision = sales * 0.13;
                    System.out.printf("%.2f", commision);
                } else {
                    System.out.println("error");
                }
                break;

            case "Plovdiv":
                if (sales >= 0 && sales <= 500) {
                    commision = sales * 0.055;
                    System.out.printf("%.2f", commision);
                } else if (sales > 500 && sales <= 1000) {
                    commision = sales * 0.08;
                    System.out.printf("%.2f", commision);
                } else if (sales > 1000 && sales <= 10000) {
                    commision = sales * 0.12;
                    System.out.printf("%.2f", commision);
                } else if (sales > 10000) {
                    commision = sales * 0.145;
                    System.out.printf("%.2f", commision);
                } else {
                    System.out.println("error");
                }
                break;
            default:
                System.out.println("error");
        }

    }
}
