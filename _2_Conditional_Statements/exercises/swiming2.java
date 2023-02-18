package exercises;

import java.util.Scanner;

public class swiming2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordSec = Double.parseDouble(scanner.nextLine());
        double razstoqnieMetres = Double.parseDouble(scanner.nextLine());
        double timeForOneMeter = Double.parseDouble(scanner.nextLine());

        double totalTime = razstoqnieMetres * timeForOneMeter;
        double addTimee = Math.floor((razstoqnieMetres / 15));
        double additionalTime=addTimee* 12.5;
        double totalTimePlusAdditional = totalTime + additionalTime;

        if (totalTimePlusAdditional < recordSec) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTimePlusAdditional);
        } else if (totalTimePlusAdditional >= recordSec) {
            double resultTwo = totalTimePlusAdditional - recordSec;
            System.out.printf("No, he failed! He was %.2f seconds slower.", (resultTwo));
        }


    }
}


