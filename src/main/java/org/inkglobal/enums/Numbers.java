package org.inkglobal.enums;

/**
 * Created by GArlington on 24/08/2015.
 */

public interface Numbers {

    /**
     * Translate int value to word representation
     *
     * @param value The int value
     * @return The word representation of that value
     */
    default String tranlate(final int value) {
        String translation = "";
        for (Numbers number : getValues()) {
            if (value == number.getIntValue()) {
                translation = number.getTranslation();
                break;
            }
        }
        return translation;
    }

    /**
     * Gets an array of all values
     *
     * @return that array
     */
    Numbers[] getValues();

    /**
     * Gets the int value
     *
     * @return The int value
     */
    int getIntValue();

    /**
     * Gets the word representation of this value
     *
     * @return The word representation of this value
     */
    String getTranslation();
}
