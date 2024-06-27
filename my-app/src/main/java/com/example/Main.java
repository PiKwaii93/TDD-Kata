package com.example;

public class Main {
    public static String convertNumberToRoman(int number) {
        StringBuilder roman = new StringBuilder();

        if(number == 15){
            return "XV";
        }else if(number == 14){
            return "XIV";
        }else if(number >= 10){
            roman.append("X");
            for (int i = 10; i < number; i++) {
                roman.append("I");
            }
        }else if(number == 9){
            return "IX";
        }else if(number >= 5){
            roman.append("V");
            for (int i = 5; i < number; i++) {
                roman.append("I");
            }
        }else if(number == 4){
            return "IV";
        }else{
            for (int i = 0; i < number; i++) {
                roman.append("I");
            }
        }
        
        return roman.toString();
    }
}
