package com.example;

public class Main {
    public static String convertNumberToRoman(int number) {
        StringBuilder roman = new StringBuilder();
        if(number == 4){
            return "IV";
        }else if(number < 5){
            for (int i = 0; i < number; i++) {
                roman.append("I");
            }
        }else if(number == 5){
            return "V";
        }else{
            roman.append("V");
            for (int i = 5; i < number; i++) {
                roman.append("I");
            }
        }
        
        return roman.toString();
    }
}
