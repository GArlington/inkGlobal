package org.inkglobal.enums;

/**
 * Created by GArlington on 24/08/2015.
 */

public enum TensNumbers implements Numbers {
    /**
     * The number 20 and its verbal representation
     */
    TWENTY(20, "Twenty"),

    /**
     * The number 30 and its verbal representation
     */
    THIRTY(30, "Thirty"),

    /**
     * The number 40 and its verbal representation
     */
    FOURTY(40, "Fourty"),

    /**
     * The number 50 and its verbal representation
     */
    FIFTY(50, "Fifty"),

    /**
     * The number 60 and its verbal representation
     */
    SIXTY(60, "Sixty"),

    /**
     * The number 70 and its verbal representation
     */
    SEVENTY(70, "Seventy"),

    /**
     * The number 80 and its verbal representation
     */
    EIGHTY(80, "Eighty"),

    /**
     * The number 90 and its verbal representation
     */
    NINETY(90, "Ninety");

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
    TensNumbers(final int intValue, final String translation) {
        this.intValue = intValue;
        this.translation = translation;
    }

    public Numbers[] getValues() {
        return TensNumbers.values();
    }

    public int getIntValue() {
        return this.intValue;
    }

    public String getTranslation() {
        return this.translation;
    }
}
