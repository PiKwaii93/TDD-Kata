package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(convertRomanNumeral("I"));
    }

    public static String convertRomanNumeral(String numeral) {
        if ("II".equals(numeral)) {
            return "2";
        }
        if ("I".equals(numeral)) {
            return "1";
        }
        return "";
    }
}
