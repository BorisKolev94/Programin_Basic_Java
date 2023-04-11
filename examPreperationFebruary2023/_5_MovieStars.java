import java.util.Scanner;

public class _5_MovieStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String command = scanner.nextLine();

        while (!command.equals("ACTION")) {
            double payment = 0;
            if (command.length() > 15) {
                payment = budget * 0.2;
            } else {
                payment = Double.parseDouble(scanner.nextLine());
            }
            budget-=payment;
            if (budget <= 0) {
                break;
            }
            command = scanner.nextLine();
        }
        if (budget <=0) {
            System.out.printf("We need %.2f leva for our actors.", Math.abs(budget));
        }else {
            System.out.printf("We are left with %.2f leva.", budget );
        }
    }
}
