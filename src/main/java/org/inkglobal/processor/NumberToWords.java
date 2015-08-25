package org.inkglobal.processor;

import org.inkglobal.enums.UnitsNumbers;

/**
 * Created by GArlington on 24/08/2015.
 */

public class NumberToWords {
    private final int GROUP_SIZE;
    private final String union;


    public NumberToWords() {
        this(3, "And ");
    }

    public NumberToWords(int size, String union) {
        this.GROUP_SIZE = size;
        this.union = union;
    }

    public String translate(final int i) {
        return translate((long) i);
    }

    public String translate(final long l) {
        if (l == 0) {
            return UnitsNumbers.ZERO.getTranslation();
        }
        return translate(Long.toString(l));
    }

    private String translate(final String number) {
        int exponent = number.length() - (number.length() % GROUP_SIZE) + GROUP_SIZE;
        GeneralNumbersProcessor generalNumbersProcessor = new NumberProcessor(exponent, union);
        return generalNumbersProcessor.translate(number);
    }
}
