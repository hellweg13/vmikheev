package ru.job4j.array;

import java.util.Arrays;

public class Square {
    public int[] calculate(int bound){
        int[] rst = new int [bound];
        int[] rsl = Arrays.copyOf(rst,1+rst.length);
        for (int i = 1; i<rsl.length; i++) {
            rsl[i] = i*i;
        }
        return rsl;
    }
}
