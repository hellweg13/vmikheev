package ru.job4j.array;

import java.util.Arrays;

public class ArrayDuplicate {
    public String[] remove(String [] array){
        int resultSize = array.length;
        for (int out = 0; out < resultSize; out++){
            for (int in = out+1; in < resultSize; in++){
                if (array[out].equals(array[in])) {
                    array[in] = array[--resultSize];
                    in--;
                }
            }
        }
        return Arrays.copyOf(array, resultSize);
    }
}
