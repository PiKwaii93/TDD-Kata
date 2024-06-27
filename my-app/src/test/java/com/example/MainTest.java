package com.example;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MainTest {

    @Test
    public void testConvertRomanNumeral() {
        String result = Main.convertRomanNumeral("I");
        assertThat(result).isEqualTo("1");
    }
}
