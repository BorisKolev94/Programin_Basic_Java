import java.util.Scanner;

public class pcGameShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberSoldGames = Integer.parseInt(scanner.nextLine());
        int countHeart = 0;
        int countFornite = 0;
        int countOver = 0;
        int countOthers = 0;
        for (int i = 1; i <= numberSoldGames; i++) {
            String gameName = scanner.nextLine();
            if (gameName.equals("Hearthstone")) {
                countHeart++;
            } else if (gameName.equals("Fornite")) {
                countFornite++;
            } else if (gameName.equals("Overwatch")) {
                countOver++;
            } else {
                countOthers++;
            }
        }
        System.out.printf("Hearthstone - %.2f%%%n", countHeart*1.0/numberSoldGames*100);
        System.out.printf("Fornite - %.2f%%%n", countFornite*1.0/numberSoldGames*100);
        System.out.printf("Overwatch - %.2f%%%n", countOver*1.0/numberSoldGames*100);
        System.out.printf("Others - %.2f%%%n", countOthers*1.0/numberSoldGames*100);
    }
}