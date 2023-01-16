package br.com.erudio.utils;

import br.com.erudio.exceptions.UnsupportedMathOperationException;

public class NumberUtils {

    public static void validateNumber(String strNumber) {
        if (!isNumeric(strNumber))
            throw new UnsupportedMathOperationException("Please set a numeric value.");
    }

    public static String normalizeDecimalSeparator(String strNumber) {
        return strNumber.replaceAll(",", ".");
    }

    public static Double convertToDouble(String strNumber) {
        if (strNumber == null)
            return 0D;

        String numberUS = normalizeDecimalSeparator(strNumber);

        if (isNumeric(numberUS))
            return Double.parseDouble(numberUS);

        return 0D;
    }

    public static boolean isNumeric(String strNumber) {
        if (strNumber == null)
            return false;

        return normalizeDecimalSeparator(strNumber).matches("[+-]?[0-9]*\\.?[0-9]+");
    }
}
