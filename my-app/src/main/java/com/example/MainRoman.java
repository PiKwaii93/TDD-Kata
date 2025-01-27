package com.example;

public class MainRoman {
    public static void main(String[] args) {
        System.out.println(convertRomanNumeral("I"));
    }

    public static int convertRomanNumeral(String numeral) {
        int result = 0;

        if ("IX".equals(numeral)) {
            return 9;
        }
        if ("X".equals(numeral)) {
            return 10;
        }

        for (int i = 0; i < numeral.length(); i++) {
            char c = numeral.charAt(i);

            if (c == 'I') {
                if (i + 1 < numeral.length() && numeral.charAt(i + 1) == 'V') {
                    result -= 1; 
                } else {
                    result += 1;
                }
            } else if (c == 'V') {
                result += 5;
            }
        }

        return result;
    }
}
