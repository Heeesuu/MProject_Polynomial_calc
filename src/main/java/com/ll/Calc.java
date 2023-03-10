package com.ll;

public class Calc {
    public static int run(String exp) {
        boolean needToPlus = exp.contains("+"); //테스트 문장에 포함되어있는지 파악 포함되어있다면 true
        boolean needToMinus = exp.contains("-");

        if (needToPlus) {
            String[] bits = exp.split(" \\+ ");

            int a = Integer.parseInt(bits[0]);
            int b = Integer.parseInt(bits[1]);

            return a + b;


        }
        if (needToMinus) {
            String[] bits = exp.split(" \\- ");

            int a = Integer.parseInt(bits[0]);
            int b = Integer.parseInt(bits[1]);

            return a - b;
        }

        return 0;

    }
}

