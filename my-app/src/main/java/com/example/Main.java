package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(convertRomanNumeral("I"));
    }

    public static int convertRomanNumeral(String numeral) {
        int result = 0;

        // Parcourir la chaîne de caractères
        for (int i = 0; i < numeral.length(); i++) {
            result++;
        }

        return result;
    }
}
