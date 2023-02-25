package exercises;

import java.util.Scanner;

public class hotelRoom2 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double priceStudio = 0;
        double priceApp = 0;
        switch (month) {
            case "May":
            case "October":
                priceStudio= nights * 50;
                priceApp = nights * 65;
                if (nights>14){
                    priceApp=priceApp-priceApp*0.10;
                    priceStudio=priceStudio-priceStudio*0.30;
                } else if (nights>7) {
                    priceStudio=priceStudio-(priceStudio*0.05);
                }
                break;
            case "June":
            case "September":
                priceStudio = nights * 75.20;
                priceApp = nights * 68.70;
                if (nights>14){
                    priceApp=priceApp*0.90;
                    priceStudio=priceStudio*0.80;
                }
                break;
            case "July":
            case "August":
                priceStudio = nights * 76;
                priceApp = nights * 77;
                if (nights>14){
                    priceApp=priceApp-priceApp*0.10;
                }

                break;
        }
        System.out.printf("Apartment: %.2f lv.%n", priceApp);
        System.out.printf("Studio: %.2f lv.", priceStudio);

    }
}


