package org.inkglobal.enums;

/**
 * Created by GArlington on 24/08/2015.
 */

public enum UnitsNumbers implements Numbers {

    /**
     * The number 0 and its verbal representation
     */
    ZERO(0, "Zero"),

    /**
     * The number 1 and its verbal representation
     */
    ONE(1, "One"),

    /**
     * The number 2 and its verbal representation
     */
    TWO(2, "Two"),

    /**
     * The number 3 and its verbal representation
     */
    THREE(3, "Three"),

    /**
     * The number 4 and its verbal representation
     */
    FOUR(4, "Four"),

    /**
     * The number 5 and its verbal representation
     */
    FIVE(5, "Five"),

    /**
     * The number 6 and its verbal representation
     */
    SIX(6, "Six"),

    /**
     * The number 7 and its verbal representation
     */
    SEVEN(7, "Seven"),

    /**
     * The number 8 and its verbal representation
     */
    EIGHT(8, "Eight"),

    /**
     * The number 9 and its verbal representation
     */
    NINE(9, "Nine"),

    /**
     * The number 10 and its verbal representation
     */
    TEN(10, "Ten"),

    /**
     * The number 11 and its verbal representation
     */
    ELEVEN(11, "Eleven"),

    /**
     * The number 12 and its verbal representation
     */
    TWELVE(12, "Twelve"),

    /**
     * The number 13 and its verbal representation
     */
    THIRTEEN(13, "Thirteen"),

    /**
     * The number 14 and its verbal representation
     */
    FOURTEEN(14, "Fourteen"),

    /**
     * The number 15 and its verbal representation
     */
    FIFTEEN(15, "Fifteen"),

    /**
     * The number 16 and its verbal representation
     */
    SIXTEEN(16, "Sixteen"),

    /**
     * The number 17 and its verbal representation
     */
    SEVENTEEN(17, "Seventeen"),

    /**
     * The number 18 and its verbal representation
     */
    EIGHTEEN(18, "Eighteen"),

    /**
     * The number 19 and its verbal representation
     */
    NINETEEN(19, "Nineteen");

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
    UnitsNumbers(final int intValue, final String translation) {
        this.intValue = intValue;
        this.translation = translation;
    }

    public Numbers[] getValues() {
        return UnitsNumbers.values();
    }

    public int getIntValue() {
        return this.intValue;
    }

    public String getTranslation() {
        return this.translation;
    }
}
