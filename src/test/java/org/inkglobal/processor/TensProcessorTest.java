package org.inkglobal.processor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TensProcessorTest {
    GeneralNumbersProcessor victim = new TensProcessor();

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

    @Test(expected = AssertionError.class)
    public void testTranslate_100() throws Exception {
        long l = 100;
        String expected = "???";
        String result = victim.translate(String.valueOf(l));
        assertEquals(expected, result);
    }
}