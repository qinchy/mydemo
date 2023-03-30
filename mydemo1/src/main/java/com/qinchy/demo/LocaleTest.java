package com.qinchy.demo;

import java.util.Locale;

public class LocaleTest {

    public static void main(String[] args) {
        Locale locale = Locale.US;
        System.out.println(locale.getCountry());
        System.out.println(locale.getDisplayCountry());
        System.out.println(locale.getDisplayLanguage());
        System.out.println(locale.getDisplayName());
        System.out.println(locale.getLanguage());

        System.out.println("#######################");

        locale = Locale.getDefault();
        System.out.println(locale.getCountry());
        System.out.println(locale.getDisplayCountry());
        System.out.println(locale.getDisplayLanguage());
        System.out.println(locale.getDisplayName());
        System.out.println(locale.getLanguage());
    }
}
