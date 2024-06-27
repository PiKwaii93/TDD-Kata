package com.example;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

    public class MainTest {
        
        @Test
        public void Function_1_should_return_II() {
            String result = Main.convertNumberToRoman(1);
            assertThat(result).isEqualTo("I");
        }

        @Test
        public void Function_2_should_return_II() {
            String result = Main.convertNumberToRoman(2);
            assertThat(result).isEqualTo("II");
        }   

        @Test
        public void Function_3_should_return_III() {
            String result = Main.convertNumberToRoman(3);
            assertThat(result).isEqualTo("III");
        }   

        @Test
        public void Function_4_should_return_IV() {
            String result = Main.convertNumberToRoman(4);
            assertThat(result).isEqualTo("IV");
        }   
        
        @Test
        public void Function_5_should_return_V() {
            String result = Main.convertNumberToRoman(5);
            assertThat(result).isEqualTo("V");
        }   
        
        @Test
        public void Function_6_should_return_VI() {
            String result = Main.convertNumberToRoman(6);
            assertThat(result).isEqualTo("VI");
        }   
        
        @Test
        public void Function_7_should_return_VII() {
            String result = Main.convertNumberToRoman(7);
            assertThat(result).isEqualTo("VII");
        }   
        
        @Test
        public void Function_8_should_return_VIII() {
            String result = Main.convertNumberToRoman(8);
            assertThat(result).isEqualTo("VIII");
        }   
        
        @Test
        public void Function_9_should_return_IX() {
            String result = Main.convertNumberToRoman(9);
            assertThat(result).isEqualTo("IX");
        }    
        
        @Test
        public void Function_10_should_return_X() {
            String result = Main.convertNumberToRoman(10);
            assertThat(result).isEqualTo("X");
        }   
        
        @Test
        public void Function_11_should_return_XI() {
            String result = Main.convertNumberToRoman(11);
            assertThat(result).isEqualTo("XI");
        }    
        
        @Test
        public void Function_12_should_return_XII() {
            String result = Main.convertNumberToRoman(12);
            assertThat(result).isEqualTo("XII");
        }   
}
