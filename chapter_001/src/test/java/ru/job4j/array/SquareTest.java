package ru.job4j.array;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SquareTest {
    @Test
    public void whenCalculateSquareForFiveThenTwentyFive(){
        Square square = new Square();
        int[] result = square.calculate(5);
        int[] excepted = new int[]{0, 1, 4, 9, 16};
        assertThat(result,is(excepted));
    }
}
