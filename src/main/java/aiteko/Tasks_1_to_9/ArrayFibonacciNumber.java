package aiteko.Tasks_1_to_9;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ArrayFibonacciNumber implements CanRun{
    @Override
    public void run() {
        System.out.println("Задание №6");

        Scanner scanner = new Scanner(System.in);
        List<Integer> linkedList = new LinkedList<>();
        System.out.println("Введите числа списка (для выхода нажмите q): ");
        while (scanner.hasNextInt()) {
            linkedList.add(scanner.nextInt());
        }

        System.out.print("Числа ряда Фибоначи в списке: ");
        for (int number: linkedList) {
            if (IsItFibonacci(number) & number>=0) {
                System.out.print(number + "; ");
            }
        }
        System.out.println("\n");
    }
    private static boolean IsNumberEqualsPowSqrt(int number)
    {
        int NumberSqrt = (int)Math.sqrt(number);
        return (NumberSqrt * NumberSqrt == number);
    }
    private static boolean IsItFibonacci(int number) {
        return IsNumberEqualsPowSqrt(5 * number * number + 4) ||
                IsNumberEqualsPowSqrt(5 * number * number - 4);
    }
}
