package com.example;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

    public class MainTest {
        
        @Test
        public void I_should_return_1() {
            String result = Main.convertNumberToRoman(1);
            assertThat(result).isEqualTo("I");
        }
}
