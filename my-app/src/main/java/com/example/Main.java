package com.example;

public class Main {
    public static String convertNumberToRoman(int number) {
        StringBuilder roman = new StringBuilder();
        for (int i = 0; i < number; i++) {
            roman.append("I");
        }
        
        return roman.toString();
    }
}
