package Exercise;

import java.util.Scanner;

public class coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double change = Double.parseDouble(scanner.nextLine());
        double changeInCoins = Math.round(change * 100);
        int coins = 0;

        while (changeInCoins>0) {
            if (changeInCoins >= 200) {
                coins++;
                changeInCoins = changeInCoins - 200;
            } else if (changeInCoins >= 100) {
                coins++;
                changeInCoins = changeInCoins - 100;
            } else if (changeInCoins >= 50) {
                coins++;
                changeInCoins = changeInCoins - 50;
            } else if (changeInCoins >= 20) {
                coins++;
                changeInCoins = changeInCoins - 20;
            } else if (changeInCoins >= 10) {
                coins++;
                changeInCoins = changeInCoins - 10;
            } else if (changeInCoins >= 5) {
                coins++;
                changeInCoins = changeInCoins - 5;
            } else if (changeInCoins >= 2) {
                coins++;
                changeInCoins = changeInCoins - 2;
            } else if (changeInCoins >= 1) {
                coins++;
                changeInCoins = changeInCoins - 1;
            } else  {
                break;
            }
        }
        System.out.println(coins);
    }
}
