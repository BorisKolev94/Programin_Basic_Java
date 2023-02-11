package secondLecture;

import java.util.Scanner;

public class baseballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double annualTax = Double.parseDouble(scanner.nextLine());

        double basketballShoes = annualTax - (annualTax * 0.40);
        double baseballEkip = basketballShoes - (basketballShoes * 0.20);
        double ball = baseballEkip / 4;
        double aksesoari = ball / 5;
        double result = basketballShoes + baseballEkip + ball + aksesoari+annualTax;
        System.out.println(result);
    }
}
