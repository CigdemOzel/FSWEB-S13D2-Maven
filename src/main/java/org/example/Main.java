package org.example;

public class Main {
    public static boolean isPalindrome(int number) {
        int originalNumber = Math.abs(number);
        int reversedNumber = 0;
        int temp = originalNumber;
        while(temp>0) {
            int lastDigit = temp % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            temp/=10;
        }
        return originalNumber == reversedNumber;
    }


    public static boolean isPerfectNumber(int number) {
        if(number<1) {
            return false;
        }
        int sum = 0;
        for(int i = 1; i <= number / 2; i++ ) {
            if(number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }

    public static String numberToWords(int number) {
        if (number < 0) {
            return "Invalid Value";
        }
        if (number == 0) {
            return "Zero";
        }

        StringBuilder result = new StringBuilder();
        String numberAsString = String.valueOf(number);
        for (int i = 0; i < numberAsString.length(); i++) {
            char digit = numberAsString.charAt(i);
            switch (digit) {
                case '0' -> result.append("Zero ");
                case '1' -> result.append("One ");
                case '2' -> result.append("Two ");
                case '3' -> result.append("Three ");
                case '4' -> result.append("Four ");
                case '5' -> result.append("Five ");
                case '6' -> result.append("Six ");
                case '7' -> result.append("Seven ");
                case '8' -> result.append("Eight ");
                case '9' -> result.append("Nine ");
            }
        }
        return result.toString().trim();
    }
}
