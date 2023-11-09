package aiteko.Tasks_1_to_9;

import java.util.LinkedList;
import java.util.Random;

public final class RandomNumbersList {
    public LinkedList create() {
        Random random = new Random();
        int length = random.nextInt(1000 + 100);
        LinkedList<Integer> randomList = new LinkedList<>();
        for (int i =0;i<length;i++){
            randomList.add(random.nextInt(1000 + 1));
        }
        return randomList;
    }
}