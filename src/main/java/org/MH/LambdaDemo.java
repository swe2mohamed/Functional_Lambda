package org.MH;

import java.util.UUID;

public class LambdaDemo {

    static DoStringStuff concatenate = (s1, s2) -> {
        return s1 + s2;
    };
    static DoStringStuff biggestString = (s1,s2) -> s1.length() >= s2.length() ? s1:s2;

    static DoubleOperator addition = (n1, n2) -> n1 + n2;
    static DoubleOperator subtraction = (n1, n2) -> n1 - n2;
    static Printer printerString = (s) -> System.out.println(s);
    public static void main(String[] args) {
        System.out.println(concatenate.operate("www.","google.com"));
        System.out.println(biggestString.operate("Hello","Hi"));
        System.out.println(addition.apply(5,3));
        System.out.println(subtraction.apply(5,3));
        printerString.print("Goodbye Java :D :D :D");
        StringRandomNumber randomNumber = () -> UUID.randomUUID().toString();
        System.out.println(randomNumber.generate());
        printerString.print(randomNumber.generate());
    }
}
