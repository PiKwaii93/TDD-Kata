package com.example;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MainTest {

    @Test
    public void I_should_return_1() {
        int result = Main.convertRomanNumeral("I");
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void II_should_return_2() {
        int result = Main.convertRomanNumeral("II");
        assertThat(result).isEqualTo(2);
    }

    @Test
    public void III_should_return_3() {
        int result = Main.convertRomanNumeral("III");
        assertThat(result).isEqualTo(3);
    }
    
    
}
