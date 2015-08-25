package org.inkglobal.processor;

import org.inkglobal.enums.UnitsNumbers;

/**
 * Created by GArlington on 25/08/2015.
 */
public class UnitsProcessor extends BaseProcessor {
    @Override
    public String translate(String value) {

        assert (value.length() <= 2);

        StringBuilder sb = new StringBuilder();

        int offset = NO_VALUE;
        int number;
        if (value.length() > 2) {
            number = Integer.valueOf(value.substring(value.length() - 2), 10);
        } else {
            number = Integer.valueOf(value, 10);
        }
        number %= 100;
        if (number < 20) {
            offset = (number % 20) - 1;
            //number /= 100;
        }

        if (offset != NO_VALUE && offset < UnitsNumbers.values().length) {
            sb.append(UnitsNumbers.values()[offset + 1].getTranslation());
        }

        return sb.toString();
    }
}
