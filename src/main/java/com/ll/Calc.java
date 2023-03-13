package com.ll;

public class Calc {
    public static int run(String exp) {
        boolean needToMulti = exp.contains("*"); // exp에 *가 포함되어있으면 true
        boolean needToPlus = exp.contains("+");

        boolean needToCompound = needToMulti && needToPlus;

        if ( needToCompound ) {
            String[] bits = exp.split(" \\+ ");

            return Integer.parseInt(bits[0]) + run(bits[1]);
        }

        else if ( needToPlus ){
            exp = exp.replaceAll("- " , "+ -");

            String[] bits = exp.split(" \\+ ");

            int sum = 0;

            for (int i = 0; i < bits.length; i++) {
                sum += Integer.parseInt(bits[i]);
            }

            return sum;
        }

        if ( needToMulti ){

            String[] bits = exp.split(" \\* ");

            int sum = 1; //곱하기는 1부터 시작

            for (int i = 0; i < bits.length; i++) {
                sum *= Integer.parseInt(bits[i]);
            }

            return sum;
        }

        throw new RuntimeException("올바른 계산식이 아닙니다.");
        //예외처리가 꼭 있어야하나?
    }
}

