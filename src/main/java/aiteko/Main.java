package aiteko;

import aiteko.Tasks_1_to_9.*;
import java.util.stream.Stream;

public class Main
{
    public static void main( String[] args ) {
        Stream.of(new PrimeNumbersList(), new LuckyNumbersList(),
                new RandomNumberToWord(), new FermatTheorem(),
                new CalculateTheExpression(), new FibonacciNumberList(),
                new PalindromeNumbersList(), new FractionalPartList(),
                new PascalTriangle()).forEach(CanRun::run);
    }
}