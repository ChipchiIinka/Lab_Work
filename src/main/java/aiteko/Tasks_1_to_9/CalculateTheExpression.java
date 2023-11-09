package aiteko.Tasks_1_to_9;

import java.util.Random;

public class CalculateTheExpression implements CanRun{
    @Override
    public void run() {
        System.out.println("Задание №5");

        Random random = new Random();
        double result, n = random.nextInt( 20+ 1);
        result = n;
        System.out.println("Для выражения - (n-n/2+n/3-n/4+...+n/9999-n/10000) n = " + n);
        for(int i =2;i<10_000;i+=2){
            result-=n/i;
            if (i==10_000) break;
            else result+=n/(i+1);
        }
        System.out.println("Итог вычислений = " + result);
        System.out.println();
    }
}