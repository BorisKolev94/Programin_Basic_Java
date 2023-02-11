import java.util.Scanner;

public class petShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numOfDogFood = Double.parseDouble(scanner.nextLine());
        double numOfCatFood = Double.parseDouble(scanner.nextLine());
        double priceDogFood = numOfDogFood * 2.50;
        double priceCatFood = numOfCatFood * 4;
        double result = priceDogFood + priceCatFood;
        System.out.println(result + " "+"lv.");
    }
}
