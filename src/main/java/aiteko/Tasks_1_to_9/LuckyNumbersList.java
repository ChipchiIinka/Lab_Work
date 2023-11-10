package aiteko.Tasks_1_to_9;

import java.util.LinkedList;
import java.util.List;

public class LuckyNumbersList implements CanRun {
    @Override
    public void run() {
        System.out.println("Задание №2");

        RandomNumbersList randomNumbersList = new RandomNumbersList();
        List<Integer> numbers = randomNumbersList.create();

        int maxNumber = numbers.get(0);
        for (int number : numbers) { //нахождение макс числа списка
            if (maxNumber < number) {
                maxNumber = number;
            }
        }

        List<Integer> luckyNumbers = new LinkedList<>(); //создание списка от 1 до макс числа списка
        for (int i = 1; i <= maxNumber; i++) {
            luckyNumbers.add(i);
        }

        //Отбор Счастливых чисел
        List<Integer> precedingNumbers = new LinkedList<>(List.of(1));
        while (!precedingNumbers.equals(luckyNumbers)) {
            for (int luckyNumber : luckyNumbers) {
                if (precedingNumbers.contains(luckyNumber)) {
                    continue;
                }
                precedingNumbers.add(luckyNumber);
                if (precedingNumbers.contains(2)) {
                    precedingNumbers.remove((Integer) 2);
                }
                for (int i = luckyNumber - 1; i < luckyNumbers.size(); i += luckyNumber) {
                    luckyNumbers.set(i, null);
                }
                break;
            }
            while (luckyNumbers.contains(null)) {
                luckyNumbers.remove(null);
            }    //часть кода с отбором взял у Антона - https://github.com/shadowwizardshmoneygang/lab/blob/master/src/main/java/ru/penzgtu/tasks/LuckyNumbersOutput.java

        }
        System.out.print("Счастливые числа: ");
        for (int number : numbers) {
            for (int LuckyNumber : luckyNumbers) {
                if (LuckyNumber == number) {
                    System.out.printf("%d; ", number);
                }
            }
        }
        System.out.println("\n");
    }
}