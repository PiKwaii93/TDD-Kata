package com.example;

public class Main {
    public static String convertNumberToRoman(int number) {
        StringBuilder roman = new StringBuilder();

        if(number >= 10){
            int tempNumber = number - 10;
            roman.append("X");
            roman.append(convertInferiorTo10(tempNumber));
        } else {
            roman.append(convertInferiorTo10(number));
        }
        
        return roman.toString();
    }

    public static String convertInferiorTo10(int numberInferiorTo10) {
        StringBuilder romanTemp = new StringBuilder();
        if(numberInferiorTo10 < 10){
            if(numberInferiorTo10 == 9){
                romanTemp.append("IX");
            } else if(numberInferiorTo10 >= 5){
                romanTemp.append("V");
                for(int i = 5; i<numberInferiorTo10; i++){
                    romanTemp.append("I");
                }
            } else if(numberInferiorTo10 == 4){
                romanTemp.append("IV");
            } else {
                for(int i = 0; i<numberInferiorTo10; i++){
                    romanTemp.append("I");
                }
            }
        }
        return romanTemp.toString();
    }
}
