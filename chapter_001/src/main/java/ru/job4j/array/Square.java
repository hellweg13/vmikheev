package ru.job4j.array;

import java.util.Arrays;

public class Square {
    public int[] calculate(int bound){
        int[] rsl = new int [bound];
        for (int i = 0; i<bound; i++) {
            rsl[i]=(int)Math.pow(i+1, 2);
        }
        return rsl;
    }
}
