package forLoopExercise;

import java.util.Scanner;

public class cleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double priceWashingMachine = Double.parseDouble(scanner.nextLine());
        int priceToys = Integer.parseInt(scanner.nextLine());

        double moneyEven = 0;
        double allMoney=0;
        int toyCount = 0;
        int brother = 0;



        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                moneyEven = moneyEven + 10;
                allMoney=allMoney+moneyEven;
                brother++;
            } else {
                toyCount++;
            }
        }
        double totalToyPrice = toyCount * priceToys;
        double totalMoney = totalToyPrice +allMoney-brother;
        double diff= Math.abs(priceWashingMachine-totalMoney);
        if (totalMoney >= priceWashingMachine) {
            System.out.printf("Yes! %.2f",diff);
        }else{
            System.out.printf("No! %.2f", diff);
    }
    }
}
