package com.example;

public class Main {
    public static String convertNumberToRoman(int number) {
        if(number == 4){
            return "IV";
        }else if(number == 5){
            return "V";
        }
        StringBuilder roman = new StringBuilder();
        for (int i = 0; i < number; i++) {
            roman.append("I");
        }
        
        return roman.toString();
    }
}
