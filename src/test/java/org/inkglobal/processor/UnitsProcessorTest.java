package org.inkglobal.processor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UnitsProcessorTest {
    GeneralNumbersProcessor victim = new UnitsProcessor();

    @Test
    public void testTranslate_1() throws Exception {
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
        // Out of range for units
        long l = 20;
        String expected = "";
        String result = victim.translate(String.valueOf(l));
        assertEquals(expected, result);
    }
}