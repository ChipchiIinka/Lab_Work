package aiteko.Tasks_1_to_9;

import java.util.List;

public class PalindromeNumbersList implements CanRun{
    @Override
    public void run() {
        System.out.println("Задание №7");

        RandomNumbersList randomNumbersList = new RandomNumbersList();
        List<Integer> linkedList = randomNumbersList.create();

        System.out.print("Числа-полиндромы списка: ");
        for (int number : linkedList){
            String StrNumber = Integer.toString(number);
            if (IsPalindromeNumber(StrNumber)){
                System.out.printf("%d; ", number);
            }
        }
        System.out.println("\n");
    }
    private static boolean IsPalindromeNumber(String StrNumber) {
        int length = StrNumber.length();                                        //Движение от начала и конца к серидине
        for (int i = 0; i < (length / 2); i++) {                                //Сравнение символов парами
            if (StrNumber.charAt(i) != StrNumber.charAt(length - i - 1)) {      //Несоответствие - не палиндром
                return false;
            }
        }
        return true;
    }
}