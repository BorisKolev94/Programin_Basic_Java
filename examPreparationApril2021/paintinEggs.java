import java.util.Scanner;

public class paintinEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sizeEggs = scanner.nextLine();
        String colorEggs = scanner.nextLine();
        int numberPartidies = Integer.parseInt(scanner.nextLine());
        int price = 0;

        switch (sizeEggs) {
            case "Large":
                if (colorEggs.equals("Red")) {
                    price = price + 16;
                }
                if (colorEggs.equals("Green")) {
                    price = price + 12;
                }
                if (colorEggs.equals("Yellow")) {
                    price = price + 9;
                }
                break;
            case "Medium":
                if (colorEggs.equals("Red")) {
                    price = price + 13;
                }
                if (colorEggs.equals("Green")) {
                    price = price + 9;
                }
                if (colorEggs.equals("Yellow")) {
                    price = price + 7;
                }
                break;
            case "Small":
                if (colorEggs.equals("Red")) {
                    price = price + 9;
                }
                if (colorEggs.equals("Green")) {
                    price = price + 8;
                }
                if (colorEggs.equals("Yellow")) {
                    price = price + 5;
                }
                break;
        }
        double totalPartisies = numberPartidies * price;
        double razhodi = totalPartisies - (totalPartisies * 0.35);
        System.out.printf("%.02f leva.", razhodi);
    }
}

