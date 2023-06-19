
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Data Entry block
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        if (scanner.hasNextInt()) {
            int num1 = scanner.nextInt();
            System.out.println("Вы ввели: " +num1);
            System.out.println("Введите ещё одно целое число: ");
            if (scanner.hasNextInt()) {
                int num2 = scanner.nextInt();
                System.out.println("Вы ввели: " +num2);
                // Result block
                System.out.println("Сумма введённых чисел - " + sum(num1,num2));
                System.out.println("Разность введённых чисел - " + minus(num1,num2));
                System.out.println("Произведение введённых чисел - " + multi(num1,num2));
                System.out.println("Частное введённых чисел - " + divide(num1,num2));
            } else {
                System.out.println("Вы ввели не целое число");
            }
        } else {
            System.out.println("Вы ввели не целое число");
        }
    }
    public static int sum(int x, int y) {
        return x + y;
    }
    public static int minus(int x, int y) {
        return x - y;
    }
    public static int multi(int x, int y) {
        return x * y;
    }
    public static int divide(int x, int y) {
        return x / y;
    }
}