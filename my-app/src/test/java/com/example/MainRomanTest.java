package com.example;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MainRomanTest {

    @Test
    public void I_should_return_1() {
        int result = MainRoman.convertRomanNumeral("I");
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void II_should_return_2() {
        int result = MainRoman.convertRomanNumeral("II");
        assertThat(result).isEqualTo(2);
    }

    @Test
    public void III_should_return_3() {
        int result = MainRoman.convertRomanNumeral("III");
        assertThat(result).isEqualTo(3);
    }

    @Test
    public void IV_should_return_4() {
        int result = MainRoman.convertRomanNumeral("IV");
        assertThat(result).isEqualTo(4);
    }

    @Test
    public void V_should_return_5() {
        int result = MainRoman.convertRomanNumeral("V");
        assertThat(result).isEqualTo(5);
    }

    @Test
    public void VI_should_return_6() {
        int result = MainRoman.convertRomanNumeral("VI");
        assertThat(result).isEqualTo(6);
    }
    
    @Test
    public void VII_should_return_7() {
        int result = MainRoman.convertRomanNumeral("VII");
        assertThat(result).isEqualTo(7);
    }
    
    @Test
    public void VIII_should_return_8() {
        int result = MainRoman.convertRomanNumeral("VIII");
        assertThat(result).isEqualTo(8);
    }
    
    @Test
    public void IX_should_return_9() {
        int result = MainRoman.convertRomanNumeral("IX");
        assertThat(result).isEqualTo(9);
    }
    
    @Test
    public void X_should_return_10() {
        int result = MainRoman.convertRomanNumeral("X");
        assertThat(result).isEqualTo(10);
    }
    
    
}
