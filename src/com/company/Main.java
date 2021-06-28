package com.company;

public class Main {

    public static void main(String[] args) {
        double firstValue;
        double secondValue;

        firstValue = 3;
        secondValue = 7;
        String operator = "max";

        //System.out.println(doArithmetic(firstValue, secondValue, operator));
        System.out.println(compare(firstValue, secondValue, operator));

        double six = 6;

        six = six + compare(3, 7, "max");
        System.out.println(six);

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

    public static double compare (double firstNr, double secondNr, String operator) {
        double answer = 0;

        switch (operator) {
            case "min":
                answer = Math.min(firstNr, secondNr);
                return answer;
            case "max":
                answer = Math.max(firstNr, secondNr);
                return answer;
            default:
                System.out.println("Enter a valid operator");
                return answer;
        }

    }

    // Create a method that checks 2 numbers and uses a switch to
    // return max, min
}
