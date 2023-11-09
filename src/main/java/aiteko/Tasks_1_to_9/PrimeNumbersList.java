package aiteko.Tasks_1_to_9;

import java.util.LinkedList;
import java.util.List;

public class PrimeNumbersList implements CanRun {
    @Override
    public void run() {
        System.out.println("Задание №1");

        RandomNumbersList randomNumbersList = new RandomNumbersList();
        List<Integer> linkedList = new LinkedList<>();

        linkedList.addAll(randomNumbersList.create()); //все числа случайного списка становится числами списка linkedList

        System.out.print("Простые числа списка: ");
        for (int number: linkedList)
        {
            if (isPrime(number)) {
                System.out.print(number + "; ");
            }
        }
        System.out.println("\n");
    }

    private boolean isPrime(int number)
    {
        boolean ItIsPrime=true;
        if (number <= 1) {
            ItIsPrime=false;
            if (ItIsPrime) {
                return true;
            } else {
                return false;
            }
        } else {
            for (int j = 2; j <= number / 2; j++)
            {
                if ((number) % j == 0) {
                    ItIsPrime=false;
                    break;
                }
            }
        }
        if (ItIsPrime) {
            return true;
        }else {
            return false;
        }
    }
}