import java.util.Scanner;

public class _05_new {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalMeters = 5364;
        int days = 1;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("END")) {
                if (totalMeters >= 8848) {
                    System.out.printf("Goal reached for %d days!", days);
                } else {
                    System.out.printf("Failed!%n%d", totalMeters);
                }
                break;
            }

            if (input.equals("Yes")) {
                days++;
                continue;
            } else if (input.equals("No")) {
                int continueClaiming = Integer.parseInt(scanner.nextLine());
                totalMeters += continueClaiming;
            } else {
                totalMeters += Integer.parseInt(input);
            }

            if (totalMeters >= 8848) {
                System.out.printf("Goal reached for %d days!", days);
                break;
            } else if (days == 5) {
                System.out.printf("Failed!%n%d", totalMeters);
                break;
            }
        }


    }
}
