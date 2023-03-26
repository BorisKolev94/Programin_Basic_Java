import java.util.Scanner;

public class _01_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rolkiHartia = Integer.parseInt(scanner.nextLine());
        int rolkiPlat = Integer.parseInt(scanner.nextLine());
        double litriLepilo = Double.parseDouble(scanner.nextLine());
        int procentDiscount = Integer.parseInt(scanner.nextLine());

        double priceHartia = 5.80;
        double pricePlat = 7.20;
        double priceLepilo = 1.20;

        double totalPrice= (rolkiHartia*priceHartia)+(rolkiPlat*pricePlat)+(litriLepilo*priceLepilo);
        double finalPrice= totalPrice-(totalPrice*procentDiscount/100);
        System.out.printf("%.03f", finalPrice);

    }
}
