package secondLecture;

import java.util.Scanner;

public class foodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chickenMenu = Integer.parseInt(scanner.nextLine());
        int fishMenu = Integer.parseInt(scanner.nextLine());
        int vegeterianMenu = Integer.parseInt(scanner.nextLine());

        double priceForChicken = chickenMenu * 10.35;
        double priceForFish = fishMenu * 12.50;
        double priceForVegeterian = vegeterianMenu * 8.15;

        double result = priceForChicken+ priceForFish + priceForVegeterian;
        double otstupka =  result * 0.2;
        double result3= result +otstupka+2.5;
        System.out.println(result3);

    }
}
