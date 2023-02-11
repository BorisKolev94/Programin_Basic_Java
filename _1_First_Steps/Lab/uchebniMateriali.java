import java.util.Scanner;

public class uchebniMateriali {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numberPens = Double.parseDouble(scanner.nextLine());
        double numberMarkers = Double.parseDouble(scanner.nextLine());
        double literPreparat = Double.parseDouble(scanner.nextLine());
        double discountPercent = Double.parseDouble(scanner.nextLine());

        double cenaPens = numberPens * 5.80;
        double cenaMarkers = numberMarkers * 7.20;
        double cenaPrearat = literPreparat * 1.20;
        double result1 = cenaPens + cenaMarkers + cenaPrearat;
        double result2 = result1 - (result1 * (discountPercent / 100));
        System.out.println(result2);


    }
}
