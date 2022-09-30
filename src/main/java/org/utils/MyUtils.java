package org.utils;

import org.utils.exceptions.InvalidStringInputException;
import org.utils.stringutils.StringParser;

import java.util.Arrays;
import java.util.List;

public class MyUtils {

    public static void main(String[] args) {
        StringParser sp = new StringParser();

        String str = "Hello|World|How are|you all";

        try{
            List<String> stringParts = sp.splitString(str, "\\|");

            for (String part : stringParts) {
                System.out.println(part);
            }
        } catch (InvalidStringInputException e) {
            System.out.println(e.getMessage());
        }

    }

}
