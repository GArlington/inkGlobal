package org.inkglobal.processor;

import org.inkglobal.enums.TensNumbers;

/**
 * Created by GArlington on 25/08/2015.
 */
public class TensProcessor extends BaseProcessor {
    private GeneralNumbersProcessor processor = new UnitsProcessor();

    @Override
    public String translate(String value) {
        assert (value.length() <= 2);

        StringBuilder sb = new StringBuilder();
        boolean tensFound = false;
        int number;
        if (value.length() > 2) {
            number = Integer.valueOf(value.substring(value.length() - 2), 10);
        } else {
            number = Integer.valueOf(value, 10);
        }
        number %= 100;   // keep only two digits
        if (number >= 20) {
            sb.append(TensNumbers.values()[(number / 10) - 2].getTranslation());
            number %= 10;
            tensFound = true;
        } else {
            number %= 20;
        }

        if (number != 0) {
            if (tensFound) {
                sb.append(SEPARATOR);
            }
            sb.append(processor.translate(Long.toString(number)));
        }

        return sb.toString();
    }
}
