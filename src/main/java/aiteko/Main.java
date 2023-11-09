package aiteko;

import aiteko.Tasks_1_to_9.*;

public class Main
{
    public static void main(String[] args) {

        //1
        ArrayPrimeNumbers arrayPrimeNumbers = new ArrayPrimeNumbers();
        arrayPrimeNumbers.run();
        //2
        ArrayLuckyNumbers arrayLuckyNumbers = new ArrayLuckyNumbers();
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
        ArrayFibonacciNumber arrayFibonacciNumber = new ArrayFibonacciNumber();
        arrayFibonacciNumber.run();
        //7
        ArrayPalindromeNumbers arrayPalindromeNumbers = new ArrayPalindromeNumbers();
        arrayPalindromeNumbers.run();
        //8
        ArrayFractionalPart arrayFractionalPart = new ArrayFractionalPart();
        arrayFractionalPart.run();
        //9
        PascalTriangle pascalTriangle = new PascalTriangle();
        pascalTriangle.run();

    }

}
