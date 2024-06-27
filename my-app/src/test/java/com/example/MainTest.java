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
}
