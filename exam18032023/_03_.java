import java.util.Scanner;

public class _03_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfDancers = Integer.parseInt(scanner.nextLine());
        double points = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String place = scanner.nextLine();

        double money = 0;

        if (place.equals("Bulgaria")) {
            money = points * numberOfDancers;
            if (season.equals("summer")){
                money= money-(money*0.05);
            } else if (season.equals("winter")) {
                money=money-(money*0.08);
            }
        } else if (place.equals("Abroad")) {
            money= numberOfDancers*points+((numberOfDancers*points)*0.5);
            if (season.equals("summer")){
                money= money-(money*0.1);
            } else if (season.equals("winter")) {
                money=money-(money*0.15);
            }
        }

        double allMoney= money-(money*0.75);
        double moneyForDancer= allMoney/numberOfDancers;
        double moneyForCharity= money*0.75;

        System.out.printf("Charity - %.02f%n", moneyForCharity);
        System.out.printf("Money per dancer - %.02f%n", moneyForDancer);

    }
}
