package aiteko.Tasks_1_to_9;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ArrayPrimeNumbers implements CanRun {
    @Override
    public void run() {
        System.out.println("Задание №1");

        Scanner scanner = new Scanner(System.in);
        List<Integer> linkedList = new LinkedList<>();
        System.out.println("Введите числа списка (для выхода нажмите q): ");
        while (scanner.hasNextInt()) {
            linkedList.add(scanner.nextInt());
        }


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
