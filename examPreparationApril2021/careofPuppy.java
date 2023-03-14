import java.util.Scanner;

public class careofPuppy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int foodAvaiableInKg = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int foodInGrams=foodAvaiableInKg*1000;
        int allFood=0;

        while(!command.equals("Adopted")){
            int food= Integer.parseInt(command);
            allFood=allFood+food;
            command= scanner.nextLine();
        }
        if (foodInGrams>=allFood){
            System.out.printf("Food is enough! Leftovers: %d grams.", foodInGrams-allFood);
        }else {
            System.out.printf("Food is not enough. You need %d grams more.", allFood-foodInGrams);
        }

    }
}
