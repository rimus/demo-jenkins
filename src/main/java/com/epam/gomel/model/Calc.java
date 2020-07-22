package com.epam.gomel.model;

public class Calc {
    public int sum(int... terms) {
        int sum = 0;
        for (int term : terms) {
            sum += term;
        }
        return sum;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int... multipliers) {
        int mul = 1;
        for (int multiplier : multipliers) {
            mul *= multiplier;
        }
        return mul;
    }
}
