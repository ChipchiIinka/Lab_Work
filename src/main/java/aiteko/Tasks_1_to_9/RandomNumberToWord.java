package aiteko.Tasks_1_to_9;

import java.util.Random;

public class RandomNumberToWord implements CanRun{
    @Override
    public void run() {
        System.out.println("Задание №3");

        Random RandomNumber = new Random();
        int RandomNumberInDiapason = RandomNumber.nextInt(9+1);

        switch (RandomNumberInDiapason) {
            case 0 -> System.out.println("Нуль");
            case 1 -> System.out.println("Один");
            case 2 -> System.out.println("Два");
            case 3 -> System.out.println("Три");
            case 4 -> System.out.println("Четыре");
            case 5 -> System.out.println("Пять");
            case 6 -> System.out.println("Шесть");
            case 7 -> System.out.println("Семь");
            case 8 -> System.out.println("Восемь");
            case 9 -> System.out.println("Девять");
            default -> {
            }
        }
        System.out.println();
    }
}