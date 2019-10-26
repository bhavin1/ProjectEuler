package com.bhavin;

/*
The sum of the squares of the first ten natural numbers is,
12 + 22 + ... + 102 = 385

The square of the sum of the first ten natural numbers is,
(1 + 2 + ... + 10)2 = 552 = 3025

Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */

public class Problem6 {

    public int sumOfSquares = 0;
    public int squareOfSum = 0;
    public int sumDifference = 0;

    public Problem6(){

    }

    public int calculateSumOfSquares(int n){

        for(int i = 1; i <= n; i++){
            sumOfSquares += i * i;
        }
        return sumOfSquares;
    }

    public void displaySumOfSquares()
    {
        System.out.println("Value of Sum of the square is: " + sumOfSquares);
    }

    public int calculateSquaresOfSum(int n){

        int tempSum = 0;

        for(int i = 1; i <= n; i++){
            tempSum += i;
        }

        squareOfSum = tempSum * tempSum;

        return squareOfSum;
    }

    public void getSquareOfSum(){
        System.out.println("Value of Square of the sum is: " + squareOfSum);
    }

    public int calculateDifference()
    {
        sumDifference = squareOfSum - sumOfSquares;
        return sumDifference;
    }

    public void displayDifference(){
        System.out.println("The difference between the sum of the squares is: " + sumDifference);
    }

    public static void main(String[] args)
    {
        Problem6 p = new Problem6();
        p.calculateSumOfSquares(100);
        p.displaySumOfSquares();
        p.calculateSquaresOfSum(100);
        p.getSquareOfSum();
        p.calculateDifference();
        p.displayDifference();
    }
}
