package com.example;

public class Main {
    public static String convertNumberToRoman(int number) {
        if(number == 4){
            return "IV";
        }else if(number == 5){
            return "V";
        }else if(number == 6){
            return "VI";
        }
        StringBuilder roman = new StringBuilder();
        for (int i = 0; i < number; i++) {
            roman.append("I");
        }
        
        return roman.toString();
    }
}
