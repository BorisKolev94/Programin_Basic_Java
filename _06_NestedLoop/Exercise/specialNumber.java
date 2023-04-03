package Exercise;

import java.util.Scanner;

public class specialNumber {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        for (int i =1; i<=9; i++){
            for (int j=1; j<=9; j++){
                for (int k=1; k<=9; k++){
                    for (int m=1; m<=9; m++){
                        if (number%i==0 && number%j==0 && number%k==0 && number%m==0){
                            System.out.printf("%d%d%d%d ", i, j, k, m);
                        }
                    }
                }
            }
        }

    }
}
