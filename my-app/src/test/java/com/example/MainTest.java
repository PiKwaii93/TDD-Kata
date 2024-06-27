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
}
