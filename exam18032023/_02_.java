import java.util.Scanner;

public class _02_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceMomisnko = Double.parseDouble(scanner.nextLine());
        int lubovniPoslania = Integer.parseInt(scanner.nextLine());
        int vosachniRozi = Integer.parseInt(scanner.nextLine());
        int kluchodarjateli = Integer.parseInt(scanner.nextLine());
        int karikatura = Integer.parseInt(scanner.nextLine());
        int kasmetiIznenadi = Integer.parseInt(scanner.nextLine());

        double priceLubovnoPoslanie = 0.60;
        double priceVosachniRozi = 7.20;
        double priceKluchodarjatel = 3.60;
        double priceKarikatura = 18.20;
        double priceKasmetiIznenadi = 22;

        double totalPrice= (lubovniPoslania*priceLubovnoPoslanie)+(vosachniRozi*priceVosachniRozi)+(kluchodarjateli*priceKluchodarjatel)+(karikatura*priceKarikatura)+(kasmetiIznenadi*priceKasmetiIznenadi);
        double totalPriceAll=totalPrice-(totalPrice*0.1);
        if ((lubovniPoslania+vosachniRozi+kluchodarjateli+karikatura+kasmetiIznenadi)>25){
            totalPriceAll =totalPriceAll-(totalPriceAll*0.35);
        }

        if (totalPriceAll>=priceMomisnko){
            System.out.printf("Yes! %.02f lv left.", totalPriceAll-priceMomisnko);
        }else {
            System.out.printf("Not enough money! %.02f lv needed.", priceMomisnko-totalPriceAll);
        }

    }
}
