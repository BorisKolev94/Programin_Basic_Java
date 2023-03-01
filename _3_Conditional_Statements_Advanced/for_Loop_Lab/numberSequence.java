package for_Loop_Lab;

import java.util.Scanner;

public class numberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int maxNumber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (maxNumber < num) { //ako maksimalniqt number e po-malak ot num, to maxNumber da stane ravno na num i taka maxnumber ve4e e ravno na purvoto 4islo, sled tova maxnumber sravnqva purvoto 4islo, 4iato stoynost e vselo sys sledva6otto i taka.
                maxNumber = num;
            }
            if (minNumber > num) {
                minNumber = num;
            }
        }
        System.out.printf("Max number: %d\n",maxNumber);
        System.out.printf("Min number: %d", minNumber);
    }
}
