package com.xebia.refactoring.bad;

import org.apache.commons.lang.StringUtils;


/**
 * This class classifies strings having 
 *  
 * all upper case
 * all lower case
 * contains numeric
 * contains hyphen
 * 
 * as Error 
 * 
 *  And it transforms strings which are all lower case and all upper case in correct case i.e. First letter capital and other small.(eg. Maria).
 *  In case of input contains hyphen(which is error state) nothins is transformed
 *  
 *  A valid name is one having Correct casing and no Error
 */
public class StringNormalizer {

    public static void main(String[] args) { 
        String validName = "Maria";
        String allUpperCase = "MARIA";
        String invalidContainsHyphen = "Maria-Sarapova";
        String allLowerCase = "maria";

        if (isValid(validName)) {
            System.out.println(validName+" "+getState(validName));
        } else {
            if (getState(validName).equals("UpperCaseError") || getState(validName).equals("LowerCaseError")) {
                System.out.print("Error State : "+ getState(validName) + " , input was : "+validName+ "    -- ");
                validName = StringUtils.capitalize(validName.toLowerCase());
                System.out.println(" Transformed: " + validName+" ," +getState(validName));
            }
        }
        
        if (isValid(allUpperCase)) {
            System.out.println(allUpperCase+" "+getState(allUpperCase));
        } else {
            if (getState(allUpperCase).equals("UpperCaseError") || getState(allUpperCase).equals("LowerCaseError")) {
                System.out.print("Error State : "+ getState(allUpperCase) + " , input was : "+allUpperCase+ "    -- ");
                allUpperCase = StringUtils.capitalize(allUpperCase.toLowerCase());
                System.out.println(" Transformed: " + allUpperCase+" ,"+getState(allUpperCase));
            }
        }
        
        if (isValid(invalidContainsHyphen)) {
            System.out.println(invalidContainsHyphen+" "+getState(invalidContainsHyphen));
        } else {
            if (getState(validName).equals("UpperCaseError") || getState(validName).equals("LowerCaseError")) {
                System.out.print("Error State : "+ getState(validName) + " , input was : "+invalidContainsHyphen+ "    -- ");
                invalidContainsHyphen = StringUtils.capitalize(invalidContainsHyphen.toLowerCase());
                System.out.println(" Transformed: " + invalidContainsHyphen+" ,"+getState(invalidContainsHyphen));
            }
        }
        
        if (isValid(allLowerCase)) {
            System.out.println(allLowerCase+" "+getState(allLowerCase));
        } else {
            if (getState(allLowerCase).equals("UpperCaseError") || getState(allLowerCase).equals("LowerCaseError")) {
                System.out.print("Error State : "+ getState(allLowerCase) + " , input was : "+allLowerCase+ "    -- ");
                allLowerCase = StringUtils.capitalize(allLowerCase.toLowerCase());
                System.out.println(" Transformed: " + allLowerCase+" ,"+getState(allLowerCase));
            }
        }
    }

    private static boolean isValid(String state) {
        if (getState(state).equals("NumericError")) {
            return false;
        }
        if (getState(state).equals("AsciiError")) {
            return false;
        }
        if (getState(state).equals("NumericError")) {
            return false;
        }
        if (getState(state).equals("UpperCaseError")) {
            return false;
        }
        if (getState(state).equals("LowerCaseError")) {
            return false;
        }
        if (getState(state).equals("Valid")) {
            return true;
        }
        return false;
    }

    private static String getState(String representation) {
        if (StringUtils.containsAny(representation, new char[]{'0','1','2','3','4','5','6','7','8','9'})) {
            return "NumericError";
        }
        if (StringUtils.containsAny(representation, new char[]{'-'})) {
            return "AsciiError";
        }
        if (StringUtils.isAllLowerCase(representation)) {
        	return "LowerCaseError";
        }
        if (StringUtils.isAllUpperCase(representation)) {
        	return "UpperCaseError";
        }
        return "Valid";
    }

}
