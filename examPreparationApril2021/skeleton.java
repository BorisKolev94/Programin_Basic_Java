import java.util.Scanner;

public class skeleton {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minutesContorla = Integer.parseInt(scanner.nextLine());
        int secondsControla = Integer.parseInt(scanner.nextLine());
        double longUlei = Double.parseDouble(scanner.nextLine());
        int secundsFor100Metres = Integer.parseInt(scanner.nextLine());

        double allTimeControlaInSeconds = minutesContorla * 60 + secondsControla;
        double razlika = (longUlei / 120) * 2.5;
        double timeOfMartin = (longUlei / 100) * secundsFor100Metres - razlika;

        if (timeOfMartin <= allTimeControlaInSeconds) {
            System.out.println("Marin Bangiev won an Olympic quota!");
            System.out.printf("His time is %.03f.", timeOfMartin);
        } else {
            System.out.printf("No, Marin failed! He was %.03f second slower.", Math.abs(timeOfMartin - allTimeControlaInSeconds));
        }


    }
}
