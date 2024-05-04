import java.util.Scanner;

class Calculator
{
    public int add(int num_one, int num_two)
    {
        int answer = num_one + num_two;
        return answer;
    }

    public int subtract(int num_one, int num_two)
    {
        int answer = num_one - num_two;
        return answer;
    }

    public int multiply(int num_one, int num_two)
    {
        int answer = num_one * num_two;
        return answer;
    }

    public int division(int num_one, int num_two)
    {
        int answer = num_one / num_two;
        return answer;
    }
}


public class Test {

    public static void main(String[] args) 
    {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        Calculator my_calc = new Calculator();

        // Perform addition
        int result = my_calc.add(num1, num2);
        System.out.println(result);

        // Perform subtraction
        result = my_calc.subtract(num1, num2);
        System.out.println(result);

        // Perform multiplication
        result = my_calc.multiply(num1, num2);
        System.out.println(result);

        // Perform division
        result = my_calc.division(num1, num2);
        System.out.println(result);

        // Close scanner
        scanner.close();
    }
}



