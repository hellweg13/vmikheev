package ru.job4j.array;

import java.util.Arrays;

public class ArraysChar {
    private char[] data;

    public ArraysChar(String line) {
        this.data = line.toCharArray();
    }
    public boolean startWith(String prefix) {
        boolean result = true;
        char[] value = prefix.toCharArray();
        for (int i = 0; i < prefix.length(); i++) {
                if (data[i]!=value[i]) {
                    result = false;
                    break;
                }
        }
        return result;
    }
}