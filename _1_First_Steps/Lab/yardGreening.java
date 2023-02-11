import java.util.Scanner;

public class yardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceFor1M = 7.61;
        double kvMeters = Double.parseDouble(scanner.nextLine());
        double priseForAllYard = priceFor1M * kvMeters;
        double priceDiscount = 0.18;
        double discount = priseForAllYard * priceDiscount;
        double finalPrice = priseForAllYard - discount;
        System.out.println("The final price is: " + finalPrice + " lv.");
        System.out.println("The discount is: " + discount + " lv.");


    }
}
