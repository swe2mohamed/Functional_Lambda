package org.MH;

public class BiggestString implements DoStringStuff{

    @Override
    public String operate(String s1, String s2) {
        return (s1.length() >= s2.length()) ? s1 : s2;
    }
}
