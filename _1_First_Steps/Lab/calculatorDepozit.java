import java.util.Scanner;

public class calculatorDepozit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double depoziranaSuma = Double.parseDouble(scanner.nextLine());
        double srokDepozit = Double.parseDouble(scanner.nextLine());
        double godshenLihvenProcent = Double.parseDouble(scanner.nextLine());
        double natrupanaLihva = depoziranaSuma * (godshenLihvenProcent/100);
        double lihva = natrupanaLihva / 12;
        double rezult = depoziranaSuma + srokDepozit * lihva;
        System.out.println(rezult);
    }
}
