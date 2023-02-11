package secondLecture;

import java.util.Scanner;

public class akvarium {
    public static void main(String[] args) {
        Scanner scanne = new Scanner(System.in);
        int dalgina = Integer.parseInt(scanne.nextLine());
        int shiro4ina = Integer.parseInt(scanne.nextLine());
        int viso4ina = Integer.parseInt(scanne.nextLine());
        double procent = Double.parseDouble(scanne.nextLine());
     int result1 = dalgina+shiro4ina+viso4ina;
     double result2 = result1/1000;
     double prostranstvo = result2 * (1-procent);
        System.out.println(prostranstvo);


    }
}
