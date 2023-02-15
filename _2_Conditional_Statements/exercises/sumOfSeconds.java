package exercises;

import java.util.Scanner;

public class sumOfSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int timeFirst = Integer.parseInt(scanner.nextLine());
        int timeSecond = Integer.parseInt(scanner.nextLine());
        int timeeThird = Integer.parseInt(scanner.nextLine());
        int totalTime = timeFirst+timeSecond+ timeeThird;


        int totalTimeInMin = totalTime/60;
        int totalTimeInSec = totalTime%60;
        if (totalTimeInSec<10){
            System.out.printf("%d:0%d",totalTimeInMin, totalTimeInSec);
        } else {
            System.out.printf("%d:%d", totalTimeInMin, totalTimeInSec);
        }

        }
}
