import java.util.Scanner;

public class footballResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstMatch = scanner.nextLine();
        String secondMatch = scanner.nextLine();
        String thirthMatch = scanner.nextLine();

        int countWon = 0;
        int countLost = 0;
        int countDrawn = 0;

        char firstMatchHost = firstMatch.charAt(0);
        char firstMatchGuest = firstMatch.charAt(2);
        if (firstMatchHost > firstMatchGuest) {
            countWon++;
        } else if (firstMatchGuest>firstMatchHost) {
            countLost++;
        } else if (firstMatchGuest==firstMatchHost) {
            countDrawn++;
        }
        char secondMatchHost = secondMatch.charAt(0);
        char secondMatchGuest = secondMatch.charAt(2);
        if (secondMatchHost > secondMatchGuest) {
            countWon++;
        } else if (secondMatchGuest>secondMatchHost) {
            countLost++;
        } else if (secondMatchGuest==secondMatchHost) {
            countDrawn++;
        }
        char thirthMatchHost = thirthMatch.charAt(0);
        char thirthMatchGuest = thirthMatch.charAt(2);
        if (thirthMatchHost > thirthMatchGuest) {
            countWon++;
        } else if (thirthMatchGuest>thirthMatchHost) {
            countLost++;
        } else if (thirthMatchGuest==thirthMatchHost) {
            countDrawn++;
        }
        System.out.printf("Team won %d games.%n", countWon);
        System.out.printf("Team lost %d games.%n", countLost);
        System.out.printf("Drawn games: %d", countDrawn);
    }
}
