import java.util.Scanner;

public class _4_Serials {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int numberOfSerials = Integer.parseInt(scanner.nextLine());

        double neededMoney = 0;
        for (int i = 0; i < numberOfSerials; i++) {
            String serialName = scanner.nextLine();
            double price = Double.parseDouble(scanner.nextLine());
            if (serialName.equals("Thrones")) {
                price = price * 0.5;
            } else if (serialName.equals("Lucifer")) {
                price = price * 0.6;
            } else if (serialName.equals("Protector")) {
                price = price * 0.7;
            } else if (serialName.equals("TotalDrama")) {
                price = price * 0.8;
            } else if (serialName.equals("Area")) {
                price = price * 0.9;
            }
            neededMoney += price;
        }
        if (budget >=neededMoney) {
            System.out.printf("You bought all the series and left with %.02f lv.", budget - neededMoney);
        } else  {
            System.out.printf("You need %.02f lv. more to buy the series!", neededMoney - budget);
        }
    }
}
