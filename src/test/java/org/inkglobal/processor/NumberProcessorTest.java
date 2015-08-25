package org.inkglobal.processor;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberProcessorTest {
    int exponent = 12;
    String union = "And ";
    GeneralNumbersProcessor victim = new NumberProcessor(exponent, union);

    @Test
    public void testTranslate_1() {
        long l = 1;
        String expected = "One";
        String result = victim.translate(String.valueOf(l));
        assertEquals(expected, result);
    }

    @Test
    public void testTranslate_10() throws Exception {
        long l = 10;
        String expected = "Ten";
        String result = victim.translate(String.valueOf(l));
        assertEquals(expected, result);
    }

    @Test
    public void testTranslate_19() throws Exception {
        long l = 19;
        String expected = "Nineteen";
        String result = victim.translate(String.valueOf(l));
        assertEquals(expected, result);
    }

    @Test
    public void testTranslate_20() throws Exception {
        long l = 20;
        String expected = "Twenty";
        String result = victim.translate(String.valueOf(l));
        assertEquals(expected, result);
    }

    @Test
    public void testTranslate_99() throws Exception {
        long l = 99;
        String expected = "Ninety Nine";
        String result = victim.translate(String.valueOf(l));
        assertEquals(expected, result);
    }

    @Test
    public void testTranslate_100() throws Exception {
        long l = 100;
        String expected = "One Hundred";
        String result = victim.translate(String.valueOf(l));
        assertEquals(expected, result);
    }

    @Test
    public void testTranslate_374() throws Exception {
        long l = 374;
        String expected = "Three Hundred And Seventy Four";
        String result = victim.translate(String.valueOf(l));
        assertEquals(expected, result);
    }


    @Test
    public void testTranslate_1_005() throws Exception {
        long l = 1_005;
        String expected = "One Thousand And Five";
        String result = victim.translate(String.valueOf(l));
        assertEquals(expected, result);
    }

    @Test
    public void testTranslate_1_305() throws Exception {
        int l = 1_305;
        String expected = "One Thousand And Three Hundred And Five";
        String result = victim.translate(String.valueOf(l));
        assertEquals(expected, result);
    }

    @Test
    public void testTranslate_100_305() throws Exception {
        int l = 100_305;
        String expected = "One Hundred Thousand And Three Hundred And Five";
        String result = victim.translate(String.valueOf(l));
        assertEquals(expected, result);
    }

    @Test
    public void testTranslate_1_000_000() throws Exception {
        int l = 1_000_000;
        String expected = "One Million";
        String result = victim.translate(String.valueOf(l));
        assertEquals(expected, result);
    }

    @Test
    public void testTranslate_1_000_001() throws Exception {
        int l = 1_000_001;
        String expected = "One Million And One";
        String result = victim.translate(String.valueOf(l));
        assertEquals(expected, result);
    }

    @Test
    public void testTranslate_1_000_305() throws Exception {
        int l = 1_000_305;
        String expected = "One Million And Three Hundred And Five";
        String result = victim.translate(String.valueOf(l));
        assertEquals(expected, result);
    }

    @Test
    public void testTranslate_100_011_305() throws Exception {
        int l = 100_011_305;
        String expected = "One Hundred Million And Eleven Thousand And Three Hundred And Five";
        String result = victim.translate(String.valueOf(l));
        assertEquals(expected, result);
    }

    @Test
    public void testTranslate_2_101_021_305() throws Exception {
        int l = 2_101_021_305;
        String expected = "Two Billion And One Hundred And One Million And Twenty One Thousand And Three Hundred And Five";
        String result = victim.translate(String.valueOf(l));
        assertEquals(expected, result);
    }

    @Test
    public void testTranslate_312_100_021_305() throws Exception {
        long l = 312_100_021_305L;
        String expected = "Three Hundred And Twelve Billion And One Hundred Million And Twenty One Thousand And Three Hundred And Five";
        String result = victim.translate(String.valueOf(l));
        assertEquals(expected, result);
    }

    @Test
    public void testTranslate_24_312_100_021_305() throws Exception {
        long l = 24_312_100_021_305L;
        String expected = "Twenty Four Trillion And Three Hundred And Twelve Billion And One Hundred Million And Twenty One Thousand And Three Hundred And Five";
        String result = victim.translate(String.valueOf(l));
        assertEquals(expected, result);
    }
}