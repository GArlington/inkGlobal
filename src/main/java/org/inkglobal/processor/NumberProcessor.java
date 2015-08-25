package org.inkglobal.processor;

import org.inkglobal.enums.GroupNumbers;

/**
 * Created by GArlington on 25/08/2015.
 */
public class NumberProcessor extends BaseProcessor {
    private final String UNION_AND;

    private GeneralNumbersProcessor hundredProcessor;
    private GeneralNumbersProcessor lowProcessor;
    private int exponent;

    public NumberProcessor(int exponent, String union) {
        hundredProcessor = new HundredsProcessor(union);
        if (exponent <= 3) {
            lowProcessor = hundredProcessor;
        } else {
            lowProcessor = new NumberProcessor(exponent - 3, union);
        }
        this.UNION_AND = union;
        this.exponent = exponent;
    }

    @Override
    public String translate(String value) {
        StringBuilder sb = new StringBuilder();

        String high, low;
        if (value.length() < getExponent()) {
            high = "";
            low = value;
        } else {
            int index = value.length() - getExponent();
            high = value.substring(0, index);
            low = value.substring(index);
        }

        String highName = getHighProcessor().translate(high);
        String lowName = getLowProcessor().translate(low);

        if (!highName.isEmpty()) {
            sb.append(highName);
            sb.append(SEPARATOR);
            sb.append(getTransaltion());

            if (!lowName.isEmpty()) {
                sb.append(SEPARATOR);
                sb.append(UNION_AND);
            }
        }

        if (!lowName.isEmpty()) {
            sb.append(lowName);
        }

        return sb.toString();
    }

    private int getExponent() {
        return exponent;
    }

    private GeneralNumbersProcessor getHighProcessor() {
        return hundredProcessor;
    }

    private GeneralNumbersProcessor getLowProcessor() {
        return lowProcessor;
    }

    private String getTransaltion() {
        return GroupNumbers.HUNDRED.tranlate(getExponent());
    }
}
