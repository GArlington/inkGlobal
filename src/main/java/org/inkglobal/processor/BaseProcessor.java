package org.inkglobal.processor;

/**
 * Created by GArlington on 25/08/2015.
 */
public abstract class BaseProcessor implements GeneralNumbersProcessor {
    static protected final String SEPARATOR = " ";
    static protected final int NO_VALUE = -1;

    public String translate(long value) {
        return translate(Long.toString(value));
    }
}
