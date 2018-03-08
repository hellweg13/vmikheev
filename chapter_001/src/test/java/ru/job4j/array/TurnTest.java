package ru.job4j.array;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TurnTest {
    @Test
    public void whenTurnArrayThenEven(){
        Turn turn = new Turn();
        int[] resultArray = turn.back(new int[]{11,7,5,2});
        int[] expectArray = new int[]{2,5,7,11};
        assertThat(resultArray,is(expectArray));
    }
    @Test
    public void whenTurnArrayThenOdd(){
        Turn turn = new Turn();
        int[] resultArray = turn.back(new int[]{7,5,12,3,8});
        int[] expectArray = new int[]{8,3,12,5,7};
        assertThat(resultArray,is(expectArray));
    }
}
