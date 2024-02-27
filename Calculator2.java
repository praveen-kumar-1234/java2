import java.util.Scanner;

class Calculator2 {

    public double add(double... numbers) {
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum;
    }

    public double sub(double... numbers) {
        double sub = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            sub -= numbers[i];
        }
        return sub;
    }

    public double mul(double... numbers) {
        double mul = 1;
        for (double num : numbers) {
            mul *= num;
        }
        return mul;
    }

    public double div(double... numbers) {
        double div = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }
            div /= numbers[i];
        }
        return div;
    }

    public static void main(String[] args) {
        boolean flag;
        char operator;
        double result = 0;
        // create an object of Scanner class
        Scanner input = new Scanner(System.in);
        do {
            // ask users to enter operator
            System.out.println("Choose an operator: +, -, *, or /");
            operator = input.next().charAt(0);

            if (!(operator == '+' || operator == '-' || operator == '*' || operator == '/')) {
                System.out.println("Invalid operator ");
                flag = true;
            } else {
                flag = false;
            }
        } while (flag);

        System.out.println("Enter the number of operands:");
        int numOperands = input.nextInt();
        // creating array to store operands
        double[] operands = new double[numOperands];

        //reading the numbers into array
        for (int i = 0; i < operands.length; i++) {
            System.out.println("Enter Operand " + (i + 1) + ":");
            operands[i] = input.nextDouble();
        }
        Calculator2 calculator = new Calculator2();

        switch (operator) {

            // performs addition between numbers
            case '+':
                result = calculator.add(operands);
                break;

            // performs subtraction between numbers
            case '-':
                result = calculator.sub(operands);
                break;

            // performs multiplication between numbers
            case '*':
                result = calculator.mul(operands);
                break;

            // performs division between numbers
            case '/':
                result = calculator.div(operands);
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }
        System.out.println("The result is...." + result);

        input.close();
    }
}