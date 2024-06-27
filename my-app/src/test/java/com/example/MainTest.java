package com.example;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MainTest {

    @Test
    public void I_should_return_1() {
        String result = Main.convertRomanNumeral("I");
        assertThat(result).isEqualTo("1");
    }

    @Test
    public void II_should_return_2() {
        String result = Main.convertRomanNumeral("II");
        assertThat(result).isEqualTo("2");
    }

    @Test
    public void III_should_return_3() {
        String result = Main.convertRomanNumeral("III");
        assertThat(result).isEqualTo("3");
    }
    
    
}
