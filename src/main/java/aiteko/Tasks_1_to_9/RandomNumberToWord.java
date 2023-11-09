package aiteko.Tasks_1_to_9;

import java.util.Random;

public class RandomNumberToWord implements CanRun{
    @Override
    public void run() {
        System.out.println("Задание №3");

        Random RandomNumber = new Random();
        int RandomNumberInDiapason = RandomNumber.nextInt(9 + 1);

        switch (RandomNumberInDiapason) {
            case 0:
                System.out.println("Нуль");
                break;
            case 1:
                System.out.println("Один");
                break;
            case 2:
                System.out.println("Два");
                break;
            case 3:
                System.out.println("Три");
                break;
            case 4:
                System.out.println("Четыре");
                break;
            case 5:
                System.out.println("Пять");
                break;
            case 6:
                System.out.println("Шесть");
                break;
            case 7:
                System.out.println("Семь");
                break;
            case 8:
                System.out.println("Восемь");
                break;
            case 9:
                System.out.println("Девять");
                break;
            default:
        }
        System.out.println();
    }
}
