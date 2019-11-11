package com.codejayant.lambda;

public class LambdaSample {

    public static void main(String[] args) {

        DisplayFunc upperCaseFunc = String::toUpperCase;
        DisplayFunc lowerCaseFunc = String::toLowerCase;
        DisplayFunc appendDefaultKeywordFunc = (str1) -> {
          str1 = str1 + " default";
          return str1;
        };

        String str = "Working World";

        display(upperCaseFunc.stringModification(str));
        display(lowerCaseFunc.stringModification(str));
        display(appendDefaultKeywordFunc.stringModification(str));
    }

    private static void display(String msg) {
        System.out.println(msg);
    }

}

interface DisplayFunc {
    String stringModification(String s);
}
