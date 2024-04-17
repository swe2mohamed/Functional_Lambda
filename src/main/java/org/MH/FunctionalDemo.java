package org.MH;

public class FunctionalDemo {
    static DoStringStuff concatOperator = new DoStringStuff() {
        @Override
        public String operate(String s1, String s2) {
            return s1 + s2;
        }
    };

    static DoubleOperator additionOperator = new DoubleOperator() {
        @Override
        public double apply(double s1, double s2) {
            return s1 + s2;
        }
    };

    static DoubleOperator subtractionOperator = new DoubleOperator() {
        @Override
        public double apply(double s1, double s2) {
            return s1 - s2;
        }
    };

    static StringValidator notNullValidator = new StringValidator() {
        @Override
        public boolean validate(String input) {
            return input != null;
        }
    };

    public static double calcOperator(double n1, double n2, DoubleOperator operator){
        return operator.apply(n1,n2);
    }

    public static boolean doValidOperator(String input, StringValidator operator){
        return operator.validate(input);
    }


    public static void main(String[] args) {
        System.out.println(concatOperator.operate("Hello ", "World"));
        System.out.println(concatOperator.operate("Hello ", "Functional Programming"));
        System.out.println("additionOperator: " + additionOperator.apply(10d,20d));
        System.out.println("subtractionOperator: " + subtractionOperator.apply(10d, 5d));
        System.out.println(notNullValidator.validate("s"));
        System.out.println(calcOperator(5d,10d,subtractionOperator));
        System.out.println(calcOperator(10,12,additionOperator));
        System.out.println(doValidOperator("asd",notNullValidator));
    }
}

