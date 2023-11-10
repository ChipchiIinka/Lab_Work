package aiteko.Tasks_1_to_9;

import java.util.List;

public class FibonacciNumberList implements CanRun{
    @Override
    public void run() {
        System.out.println("Задание №6");

        RandomNumbersList randomNumbersList = new RandomNumbersList();
        List<Integer> linkedList = randomNumbersList.create();

        System.out.print("Числа ряда Фибоначи в списке: ");
        for (int number: linkedList) {
            if (IsItFibonacci(number) & number>=0) {
                System.out.printf("%d; ", number);
            }
        }
        System.out.println("\n");
    }
    private static boolean IsNumberEqualsPowSqrt(int number)
    {
        int numberSqrt = (int)Math.sqrt(number);
        return (numberSqrt * numberSqrt == number);
    }
    private static boolean IsItFibonacci(int number) {
        return IsNumberEqualsPowSqrt(5 * number * number + 4) ||
                IsNumberEqualsPowSqrt(5 * number * number - 4);
    }
}