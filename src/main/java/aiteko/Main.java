package aiteko;

import aiteko.Tasks_1_to_9.*;

public class Main
{
    public static void main(String[] args) {

        //1
        PrimeNumbersList arrayPrimeNumbers = new PrimeNumbersList();
        arrayPrimeNumbers.run();
        //2
        LuckyNumbersList arrayLuckyNumbers = new LuckyNumbersList();
        arrayLuckyNumbers.run();
        //3
        RandomNumberToWord randomNumberToWord = new RandomNumberToWord();
        randomNumberToWord.run();
        //4
        FermatTheorem fermatTheorem = new FermatTheorem();
        fermatTheorem.run();
        //5
        CalculateTheExpression calculateTheExpression = new CalculateTheExpression();
        calculateTheExpression.run();
        //6
        FibonacciNumberList arrayFibonacciNumber = new FibonacciNumberList();
        arrayFibonacciNumber.run();
        //7
        PalindromeNumbersList arrayPalindromeNumbers = new PalindromeNumbersList();
        arrayPalindromeNumbers.run();
        //8
        FractionalPartList arrayFractionalPart = new FractionalPartList();
        arrayFractionalPart.run();
        //9
        PascalTriangle pascalTriangle = new PascalTriangle();
        pascalTriangle.run();

    }
}