package com.ikoru;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ConvertToRomanTest {

    @Test
    public void shouldConvertToRoman() {
        assertEquals("I", ConvertToRoman.convertToRoman(1), "solution(1) should equal to I");
        assertEquals("IV", ConvertToRoman.convertToRoman(4), "solution(4) should equal to IV");
        assertEquals("VI", ConvertToRoman.convertToRoman(6), "solution(6) should equal to VI");
    }

    @Test
    public void shouldConvertToRoman2(){
        assertEquals("MCMXC", ConvertToRoman.convertToRoman(1990), "1990");
        assertEquals("MMVIII", ConvertToRoman.convertToRoman(2008), "2008");
        assertEquals("MDCLXVI", ConvertToRoman.convertToRoman(1666), "1666");
    }
}