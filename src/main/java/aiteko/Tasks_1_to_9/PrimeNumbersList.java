package aiteko.Tasks_1_to_9;

import java.util.LinkedList;
import java.util.List;

public class PrimeNumbersList implements CanRun {
    @Override
    public void run() {
        System.out.println("Задание №1");

        RandomNumbersList randomNumbersList = new RandomNumbersList();
        List<Integer> linkedList = randomNumbersList.create();

        System.out.print("Простые числа списка: ");
        for (int number: linkedList)
        {
            if (isPrime(number)) {
                System.out.printf("%d; ", number);
            }
        }
        System.out.println("\n");
    }

    private boolean isPrime(int number)
    {
        boolean itIsPrime=true;
        if (number <= 1) {
            itIsPrime=false;
            if (itIsPrime) {
                return true;
            } else {
                return false;
            }
        } else {
            for (int j = 2; j <= number / 2; j++)
            {
                if ((number) % j == 0) {
                    itIsPrime=false;
                    break;
                }
            }
        }
        return itIsPrime;
    }
}