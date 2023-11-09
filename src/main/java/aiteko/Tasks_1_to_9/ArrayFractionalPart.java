package aiteko.Tasks_1_to_9;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ArrayFractionalPart implements CanRun{
    @Override
    public void run() {
        System.out.println("Задание №8");

        int m,n,result;
        double mDouble, nDouble, resultDouble,FractionalPart;

        Scanner scanner = new Scanner(System.in);
        List<Integer> linkedList = new LinkedList<>();
        System.out.println("Введите числа списка (для выхода нажмите q): ");
        while (scanner.hasNextInt()) {
            linkedList.add(scanner.nextInt());
        }


        for (int i =0; i<linkedList.size(); i++){
            int number = linkedList.get(i);
            int nextNumber = linkedList.get(i+1);
            if (i < linkedList.size()-1 & number>=0 & nextNumber>=0) {
                n = number; System.out.println("n = "+ n);
                m = nextNumber; System.out.println("m = "+ m);
                nDouble = number; mDouble = nextNumber;
                result =m/n; resultDouble = mDouble / nDouble;
                FractionalPart= resultDouble - result;
                System.out.print("Дробная часть p = " + FractionalPart);
                break;
            }
        }
        System.out.println("\n");
    }
}
