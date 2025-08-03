package com.murari;

import java.math.BigDecimal;
import java.math.BigInteger;
public class BigInt {
    public static void main(String[] args) {
        int a = -120;

        int sign = 1;
        if (a < 0) {
            sign = -1;
            a = sign * a;
        }



        StringBuilder s = new StringBuilder(Integer.toString(a));



        s.reverse();

        System.out.println(s);

        String str = s.toString();

        a = Integer.parseInt(str);


        System.out.println(a * sign);

        BigInteger x = new BigInteger("123324354378574387857349877");
        BigInteger y = new BigInteger("392843093298374223423423423499999999999999999999999999999999999999999999999999999999999999999999999999999983748237");

        System.out.println(x.multiply(y));

        BigDecimal bd = new BigDecimal("33");
        BigDecimal bdd = new BigDecimal("3");
        System.out.println(bd.divide(bdd));

    }
}
