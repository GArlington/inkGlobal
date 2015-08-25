package org.inkglobal.processor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by GArlington on 24/08/2015.
 */

public class NumberToWordsTest {
    String union = "And ";
    NumberToWords victim = new NumberToWords(3, union);

    @Test
    public void testConvertNumberToWordsInt_0() throws Exception {
        int i = 0;
        String expected = "Zero";
        String result = victim.translate(i);
        assertEquals(expected, result);
    }

    @Test
    public void testConvertNumberToWordsInt_1() throws Exception {
        int i = 1;
        String expected = "One";
        String result = victim.translate(i);
        assertEquals(expected, result);
    }

    @Test
    public void testConvertNumberToWordsInt_10() throws Exception {
        int i = 10;
        String expected = "Ten";
        String result = victim.translate(i);
        assertEquals(expected, result);
    }

    @Test
    public void testConvertNumberToWordsInt_13() throws Exception {
        int i = 13;
        String expected = "Thirteen";
        String result = victim.translate(i);
        assertEquals(expected, result);
    }

    @Test
    public void testConvertNumberToWordsInt_100() throws Exception {
        int i = 100;
        String expected = "One Hundred";
        String result = victim.translate(i);
        assertEquals(expected, result);
    }

    @Test
    public void testConvertNumberToWordsInt_105() throws Exception {
        int i = 105;
        String expected = "One Hundred And Five";
        String result = victim.translate(i);
        assertEquals(expected, result);
    }

    @Test
    public void testConvertNumberToWordsInt_271() throws Exception {
        int i = 271;
        String expected = "Two Hundred And Seventy One";
        String result = victim.translate(i);
        assertEquals(expected, result);
    }

    @Test
    public void testConvertNumberToWordsInt_1_000() throws Exception {
        int i = 1_000;
        String expected = "One Thousand";
        String result = victim.translate(i);
        assertEquals(expected, result);
    }

    @Test
    public void testConvertNumberToWordsInt_1_005() throws Exception {
        int i = 1_005;
        String expected = "One Thousand And Five";
        String result = victim.translate(i);
        assertEquals(expected, result);
    }

    @Test
    public void testConvertNumberToWordsInt_1_305() throws Exception {
        int i = 1_305;
        String expected = "One Thousand And Three Hundred And Five";
        String result = victim.translate(i);
        assertEquals(expected, result);
    }

    @Test
    public void testConvertNumberToWordsInt_100_305() throws Exception {
        int i = 100_305;
        String expected = "One Hundred Thousand And Three Hundred And Five";
        String result = victim.translate(i);
        assertEquals(expected, result);
    }

    @Test
    public void testConvertNumberToWordsInt_1_000_000() throws Exception {
        int i = 1_000_000;
        String expected = "One Million";
        String result = victim.translate(i);
        assertEquals(expected, result);
    }

    @Test
    public void testConvertNumberToWordsInt_1_000_001() throws Exception {
        int i = 1_000_001;
        String expected = "One Million And One";
        String result = victim.translate(i);
        assertEquals(expected, result);
    }

    @Test
    public void testConvertNumberToWordsInt_1_000_305() throws Exception {
        int i = 1_000_305;
        String expected = "One Million And Three Hundred And Five";
        String result = victim.translate(i);
        assertEquals(expected, result);
    }

    @Test
    public void testConvertNumberToWordsInt_100_011_305() throws Exception {
        int i = 100_011_305;
        String expected = "One Hundred Million And Eleven Thousand And Three Hundred And Five";
        String result = victim.translate(i);
        assertEquals(expected, result);
    }

    @Test
    public void testConvertNumberToWordsInt_2_101_021_305() throws Exception {
        int i = 2_101_021_305;
        String expected = "Two Billion And One Hundred And One Million And Twenty One Thousand And Three Hundred And Five";
        String result = victim.translate(i);
        assertEquals(expected, result);
    }

    @Test
    public void testConvertNumberToWordsLong_312_100_021_305() throws Exception {
        long l = 312_100_021_305L;
        String expected = "Three Hundred And Twelve Billion And One Hundred Million And Twenty One Thousand And Three Hundred And Five";
        String result = victim.translate(l);
        assertEquals(expected, result);
    }

    @Test
    public void testConvertNumberToWordsLong_24_312_100_021_305() throws Exception {
        long l = 24_312_100_021_305L;
        String expected = "Twenty Four Trillion And Three Hundred And Twelve Billion And One Hundred Million And Twenty One Thousand And Three Hundred And Five";
        String result = victim.translate(l);
        assertEquals(expected, result);
    }
}