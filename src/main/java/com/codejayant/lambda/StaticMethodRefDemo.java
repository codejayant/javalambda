package com.codejayant.lambda;

interface IntPredicate {
    boolean test(int n);
}

class IntPredicates {
    static boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i  <= n/i; i++) {
            if ((n % i) == 0) {
                return false;
            }
        }
        return true;
    }

    static boolean isEven(int n) {
        return (n % 2) == 0;
    }

    static boolean isPositive(int n) {
        return n > 0;
    }
}


public class StaticMethodRefDemo {

    private static boolean numTest(IntPredicate p, int v) {
        return p.test(v);
    }

    public static void main(String[] args) {
        boolean result;

        result = numTest(IntPredicates::isPrime, 17);
        System.out.println("17 isPrime = " + result);

        result = numTest(IntPredicates::isPrime, 18);
        System.out.println("18 isPrime = " + result);


        result = numTest(IntPredicates::isEven, 9);
        System.out.println("9 isEven = " + result);


        result = numTest(IntPredicates::isPositive, 87);
        System.out.println("87 isPositive = " + result);
    }

}


