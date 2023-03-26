import java.util.Scanner;

public class easterLunch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberEasternBread= Integer.parseInt(scanner.nextLine());
        int koriEggs= Integer.parseInt(scanner.nextLine());
        int kurabiiInKg= Integer.parseInt(scanner.nextLine());

        double total= (numberEasternBread*3.20) + (koriEggs*4.35) + (koriEggs*12*0.15) + (kurabiiInKg*5.40);
        System.out.printf("%.02f", total);
    }
}
