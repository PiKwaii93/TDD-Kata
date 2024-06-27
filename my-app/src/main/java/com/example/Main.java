package com.example;

public class Main {
    public static String convertNumberToRoman(int number) {
        if (number == 1) {
            return "I";
        } else if (number == 2) {
            return "II";
        } else if (number == 3) {
            return "III";
        } else {
            return "";
        }
    }
}
