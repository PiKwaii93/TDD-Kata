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

    @Test
    public void IV_should_return_4() {
        int result = Main.convertRomanNumeral("IV");
        assertThat(result).isEqualTo(4);
    }

    @Test
    public void V_should_return_5() {
        int result = Main.convertRomanNumeral("V");
        assertThat(result).isEqualTo(5);
    }

    @Test
    public void VI_should_return_6() {
        int result = Main.convertRomanNumeral("VI");
        assertThat(result).isEqualTo(6);
    }
    
    @Test
    public void VII_should_return_7() {
        int result = Main.convertRomanNumeral("VII");
        assertThat(result).isEqualTo(7);
    }
    
    @Test
    public void VIII_should_return_8() {
        int result = Main.convertRomanNumeral("VIII");
        assertThat(result).isEqualTo(7);
    }
    
    
}
