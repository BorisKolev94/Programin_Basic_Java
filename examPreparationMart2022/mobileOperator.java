import java.util.Scanner;

public class mobileOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String timeOfContract = scanner.nextLine();
        String typeOfContract = scanner.nextLine();
        String intergnet = scanner.nextLine();
        double months = Integer.parseInt(scanner.nextLine());


        double price = 0.0;

        if (timeOfContract.equals("one") && typeOfContract.equals("Small")) {
            price = 9.98;
        } else if (timeOfContract.equals("one") && typeOfContract.equals("Middle")) {
            price = 18.99;
        } else if (timeOfContract.equals("one") && typeOfContract.equals("Large")) {
            price = 25.98;
        } else if (timeOfContract.equals("one") && typeOfContract.equals("ExtraLarge")) {
            price = 35.99;
        }
        if (timeOfContract.equals("two") && typeOfContract.equals("Small")) {
            price = 8.58;
        } else if (timeOfContract.equals("two") && typeOfContract.equals("Middle")) {
            price = 17.09;
        } else if (timeOfContract.equals("two") && typeOfContract.equals("Large")) {
            price = 23.59;
        } else if (timeOfContract.equals("two") && typeOfContract.equals("ExtraLarge")) {
            price = 31.79;
        }
        if (intergnet.equals("yes")){
            if (price<=10){
                price=price+5.50;
            } else if (price<=30) {
                price=price+4.35;
            }else {
                price=price+3.85;
            }
        }
        double totalSum = price * months;
        if (timeOfContract.equals("two")){
            totalSum=totalSum-(totalSum*0.0375);
        }
        System.out.printf("%.02f lv.", totalSum);
    }
}
