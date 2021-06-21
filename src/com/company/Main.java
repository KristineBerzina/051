package com.company;

public class Main {

    public static void main(String[] args) {
        double firstValue;
        double secondValue;
        double answer;

        firstValue = 22;
        secondValue = 7;
        String operator = "+";

        System.out.println(doArithmetic(firstValue, secondValue, operator));

    }

    public static double doArithmetic (double firstNr, double secondNr, String operator) {
        double answer = 0;

        switch (operator) {
            case "+":
                answer = firstNr + secondNr;
                return answer;
            case "-":
                answer = firstNr - secondNr;
                return answer;
            case "*":
                answer = firstNr * secondNr;
                return answer;
            case "/":
                answer = firstNr / secondNr;
                return answer;
            default:
                System.out.println("Enter a valid operator");
                break;
        }

        return answer;
    }

    // Create a method that checks 2 numbers and uses a switch to
    // return max, min
}
