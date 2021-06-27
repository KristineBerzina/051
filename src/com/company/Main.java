package com.company;

public class Main {

    public static void main(String[] args) {
        double firstValue;
        double secondValue;

        firstValue = 3;
        secondValue = 7;
        String operator = "+";

        //System.out.println(doArithmetic(firstValue, secondValue, operator));
        System.out.println(compare(firstValue, secondValue));

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

    public static double compare (double firstNr, double secondNr) {
        double maxNr = 0;
        double minNr = 0;

        if (firstNr > secondNr) {
            maxNr = firstNr;
            minNr = secondNr;
            System.out.println("Maximum number is " + maxNr + ". " + "Minimum number is " + minNr + ".");
        }
        else if (secondNr > firstNr) {
            maxNr = secondNr;
            minNr = firstNr;
            System.out.println("Maximum number is " + maxNr + ". " + "Minimum number is " + minNr + ".");
        }
        else if (firstNr == secondNr) {
            System.out.println("Entered numbers are equal");
        }
        return maxNr;

    }

    // Create a method that checks 2 numbers and uses a switch to
    // return max, min
}
