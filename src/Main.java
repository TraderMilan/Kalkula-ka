import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        BasicCalculator basicCalculator = new BasicCalculator("");
        AdvancedCalculator advancedCalculator = new AdvancedCalculator("");
        while (true) {
            System.out.println("Write number, then type operation (+, -, *, /) and number again");
            int type = 0;
            double val1;
            String operation;
            double val2;

            try {
                val1 = scanner.nextDouble();
                operation = scanner.next();
                val2 = scanner.nextDouble();
            } catch (InputMismatchException e){
                System.out.println("Hups, invalid input, try again...");
                scanner.nextLine();
                continue;
            }

            

            type = checkType(operation);

                if (type == 1) {
                    basicCalculator.setOperator(operation);
                    basicCalculator.result(val1,val2);
                } else if (type == 2) {
                    advancedCalculator.setOperator(operation);
                    advancedCalculator.result(val1, val2);
                } else {
                    System.out.println("Hups, wrong operator, try again...");
                }

        }


    }
    public static int checkType (String operation){
        if (operation.equals("+") || operation.equals("-")) {
            return 1;
        } else if (operation.equals("*") || operation.equals("/")) {
            return 2;
        } else {
            return 3;
        }
    }
}