import java.util.Scanner;

public class balls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int redPoints = 0;
        int orangePoints = 0;
        int yellowPoints = 0;
        int blackPoint = 0;
        int whitePoint = 0;
        int othercolors = 0;
        int totalPoints = 0;

        for (int i = 1; i <= n; i++) {
            String color = scanner.nextLine();
            switch (color) {
                case "red":
                    totalPoints += 5;
                    redPoints++;
                    break;
                case "orange":
                    totalPoints += 10;
                    orangePoints++;
                    break;
                case "yellow":
                    totalPoints += 15;
                    yellowPoints++;
                    break;
                case "white":
                    totalPoints += 20;
                    whitePoint++;
                    break;
                case "black":
                    totalPoints = totalPoints / 2;
                    blackPoint++;
                    break;
                default:
                    othercolors++;
                    break;
            }
        }
        System.out.printf("Total points: %d%n", totalPoints);
        System.out.printf("Red balls: %d%n", redPoints);
        System.out.printf("Orange balls: %d%n", orangePoints);
        System.out.printf("Yellow balls: %d%n", yellowPoints);
        System.out.printf("White balls: %d%n", whitePoint);
        System.out.printf("Other colors picked: %d%n", othercolors);
        System.out.printf("Divides from black balls: %d%n", blackPoint);

    }
}
