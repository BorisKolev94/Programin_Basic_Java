import java.util.Scanner;

public class seriesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String serailName = scanner.nextLine();
        int sezons = Integer.parseInt(scanner.nextLine());
        int epizodes = Integer.parseInt(scanner.nextLine());
        double epizodLong = Double.parseDouble(scanner.nextLine());

        double epizodPlusAdv= epizodLong+(epizodLong*0.2);
        double lastLongEpizod=sezons*10;

        double allEpizodes= Math.floor(sezons*epizodes*epizodPlusAdv+lastLongEpizod);

        System.out.printf("Total time needed to watch the %s series is %.0f minutes.", serailName, allEpizodes
        );

    }
}
