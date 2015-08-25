package org.inkglobal.enums;

/**
 * Created by GArlington on 24/08/2015.
 */
public enum GroupNumbers implements Numbers {
    /**
     * Numbers in hundreds
     */
    HUNDRED(2, "Hundred"),

    /**
     * Numbers in thousands with an index assigned to the group of trailing
     * zeros
     */
    THOUSAND(3, "Thousand"),
    /**
     * Numbers in Millions with an index assigned to the group of trailing zeros
     */
    MILLION(6, "Million"),
    /**
     * Numbers in Billions with an index assigned to the group of trailing zeros
     */
    BILLION(9, "Billion"),
    /**
     * Numbers in Billions with an index assigned to the group of trailing zeros
     */
    TRILLION(12, "Trillion");


    /**
     * The int value of this enum
     */
    private int intValue;

    /**
     * The string value of this enum
     */
    private String translation;

    /**
     * Private constructor used internally to instantiate this enum type
     *
     * @param intValue    The int value of this enum
     * @param translation The String value of this enum
     */
    GroupNumbers(final int intValue, final String translation) {
        this.intValue = intValue;
        this.translation = translation;
    }

    public Numbers[] getValues() {
        return GroupNumbers.values();
    }

    public int getIntValue() {
        return this.intValue;
    }

    public String getTranslation() {
        return this.translation;
    }
}
