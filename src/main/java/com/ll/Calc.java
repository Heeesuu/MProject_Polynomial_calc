package com.ll;

public class Calc {
    public static int run(String exp) {
        exp = exp.replaceAll("- ","+ -" );

        String[] bits = exp.split(" \\+ ");

        int a = Integer.parseInt(bits[0]);
        int b = Integer.parseInt(bits[1]);
        int c = 0;
        int d = 0;

        if (bits.length > 3 ) { // 쪼갯을때 길이가 3보다 크다
            c = Integer.parseInt(bits[2]);
            d = Integer.parseInt(bits[3]);
            return a + b + c + d;
        }

        if (bits.length > 2 ) { // 쪼갯을때 길이가 2보다 크다
                c = Integer.parseInt(bits[2]);
                return a + b + c;
        }


            return a + b;


    }
}

