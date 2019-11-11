package com.codejayant.lambda;

interface IntAnotherPredicate {
    boolean test(int n);
}

class MyIntNum {
    private int v;

    MyIntNum(int x) {
        v = x;
    }

    int getNum() {
        return v;
    }

    boolean isFactor(int n) {
        return (v % n) == 0;
    }
}

public class InstanceMethodRefDemo {

    public static void main(String[] args) {
        boolean result;

        MyIntNum myNum = new MyIntNum(12);
        MyIntNum myNum2 = new MyIntNum(16);

        IntAnotherPredicate ip = myNum::isFactor;

        result = ip.test(3);

        System.out.println("Is 3 factor of  = " + myNum.getNum() + " : " + result);
    }

}
