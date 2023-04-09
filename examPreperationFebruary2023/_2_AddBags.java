import java.util.Scanner;

public class _2_AddBags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceBaggageAbove20 = Double.parseDouble(scanner.nextLine());
        double kgBagage = Double.parseDouble(scanner.nextLine());
        int daysToTravvel = Integer.parseInt(scanner.nextLine());
        int numberOfBaggage = Integer.parseInt(scanner.nextLine());

        double priceKg = 0;

        if (kgBagage< 10) {
            priceKg = priceBaggageAbove20* 0.20;
        } else if (kgBagage>= 10 && kgBagage <= 20) {
            priceKg = priceBaggageAbove20 * 0.50;
        }else {
            priceKg=priceBaggageAbove20;
        }

        if (daysToTravvel < 7) {
            priceKg = priceKg + (0.4 * priceKg);
        } else if ( daysToTravvel <= 30) {
            priceKg = priceKg + (0.15 * priceKg);
        } else{
            priceKg = priceKg + (0.1 * priceKg);
        }

        double totalPrice = priceKg*numberOfBaggage;

        System.out.printf("The total price of bags is: %.02f lv.", totalPrice);
    }
}

