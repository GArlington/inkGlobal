package org.inkglobal.processor;

import org.inkglobal.enums.GroupNumbers;

/**
 * Created by GArlington on 25/08/2015.
 */
public class HundredsProcessor extends BaseProcessor {
    private final String UNION_AND;

    private GeneralNumbersProcessor unitsProcessor = new UnitsProcessor();
    private GeneralNumbersProcessor tensProcessor = new TensProcessor();

    public HundredsProcessor() {
        this("");
    }

    public HundredsProcessor(String union) {
        this.UNION_AND = union;
    }

    @Override
    public String translate(String value) {
        assert (value.length() <= 3);

        StringBuilder sb = new StringBuilder();

        int number;
        if (value.isEmpty()) {
            number = 0;
        } else if (value.length() > 4) {
            number = Integer.valueOf(value.substring(value.length() - 4), 10);
        } else {
            number = Integer.valueOf(value, 10);
        }
        number %= 1000;  // keep at least three digits

        if (number >= 100) {
            sb.append(unitsProcessor.translate(Long.toString(number / 100)));
            sb.append(SEPARATOR);
            sb.append(GroupNumbers.HUNDRED.getTranslation());
        }

        String tensName = tensProcessor.translate(Long.toString(number % 100));

        if (!tensName.isEmpty() && (number >= 100)) {
            sb.append(SEPARATOR);
            sb.append(UNION_AND);
        }
        sb.append(tensName);

        return sb.toString().trim();
    }
}
