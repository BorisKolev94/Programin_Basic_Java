import java.util.Scanner;

public class _3_oscarsWeekInCinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movieName = scanner.nextLine();
        String typeOfHall = scanner.nextLine();
        int tiketsBought = Integer.parseInt(scanner.nextLine());

        double price = 0;

        switch (movieName) {
            case "A Star Is Born":
                if (typeOfHall.equals("normal")){
                    price=price+7.50;
                } else if (typeOfHall.equals("luxury")) {
                    price=price+10.50;
                } else if (typeOfHall.equals("ultra luxury")) {
                    price=price+13.50;
                }
                break;
            case "Bohemian Rhapsody":
                if (typeOfHall.equals("normal")){
                    price=price+7.35;
                } else if (typeOfHall.equals("luxury")) {
                    price=price+9.45;
                } else if (typeOfHall.equals("ultra luxury")) {
                    price=price+12.75;
                }
                break;
            case "Green Book":
                if (typeOfHall.equals("normal")){
                    price=price+8.15;
                } else if (typeOfHall.equals("luxury")) {
                    price=price+10.25;
                } else if (typeOfHall.equals("ultra luxury")) {
                    price=price+13.25;
                }
                break;
            case "The Favourite":
                if (typeOfHall.equals("normal")){
                    price=price+8.75;
                } else if (typeOfHall.equals("luxury")) {
                    price=price+11.55;
                } else if (typeOfHall.equals("ultra luxury")) {
                    price=price+13.95;
                }
                break;
        }
        System.out.printf("%s -> %.02f lv.", movieName, price*tiketsBought);
    }
}
