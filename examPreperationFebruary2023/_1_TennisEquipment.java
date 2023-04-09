import java.util.Scanner;

public class _1_TennisEquipment {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double tennisRaketPrice= Double.parseDouble(scanner.nextLine());
        int numberTenisRakets= Integer.parseInt(scanner.nextLine());
        int maratonki = Integer.parseInt(scanner.nextLine());

        double priceTenisRakets = tennisRaketPrice*numberTenisRakets*1.0;
        double priceMaratonki = maratonki *(tennisRaketPrice/6)*1.0;
        double totalPrice=priceTenisRakets+priceMaratonki;

        double priceOtherEqupment=totalPrice*0.20;
        double totalPriceFinal= totalPrice+priceOtherEqupment;

        double price1=Math.floor(totalPriceFinal/8);
        double price2=Math.ceil(totalPriceFinal*7/8);

        System.out.printf("Price to be paid by Djokovic %.0f\n", price1);
        System.out.printf("Price to be paid by sponsors %.0f", price2);


    }
}
