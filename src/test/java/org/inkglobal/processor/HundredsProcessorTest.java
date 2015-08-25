package org.inkglobal.processor;

import org.junit.Test;

import static org.junit.Assert.*;

public class HundredsProcessorTest {
    String union = "And ";
    GeneralNumbersProcessor victim = new HundredsProcessor(union);

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

    @Test(expected = AssertionError.class)
    public void testTranslate_1_100() throws Exception {
        long l = 1_100;
        String expected = "???";
        String result = victim.translate(String.valueOf(l));
        assertEquals(expected, result);
    }
}