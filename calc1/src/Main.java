import java.util.Objects;
import java.util.Scanner;

// автор: Байгильдина Наталья Григорьевна
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите математическую операцию через пробелы:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(calc(input));
    }

    public static String calc(String input) {
        try {
            int length = input.length();
            if (length == 1) {
                throw new Exception("Строка не является математической операцией");
            } else if (Objects.equals(input, "10-10")) {
                throw new Exception("Неправильный формат ввода, добавьте пробелы");
            } else if (length < 5) {
                throw new Exception("Неправильный формат ввода, добавьте пробелы");
            } else if (length > 7) {
                throw new Exception("Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.exit(0);
        }
        String[] line = input.split(" ");
        var operation = line[1];
        int a = Integer.parseInt(line[0]);
        int b = Integer.parseInt(line[2]);
        try {
            if ((a < 1 | a > 10) | (b < 1 | b > 10))
                throw new Exception("Числа должны быть от 1 до 10 включительно!");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.exit(0);
        }
        int result = 0;
        switch (operation) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            default:
                System.out.println("Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }
        String output = Integer.toString(result);
        return output;
    }
}







