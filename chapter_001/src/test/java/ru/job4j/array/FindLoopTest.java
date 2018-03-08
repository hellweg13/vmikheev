package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {
    @Test
    public void whenFindLoopThenNotFind(){
        FindLoop findLoop = new FindLoop();
        int result = findLoop.indexOf(new int[]{0, 1, 2, 3},4);
        assertThat(result,is(-1));
    }
    @Test
    public void whenFindLoopThenFind(){
        FindLoop findLoop = new FindLoop();
        int result = findLoop.indexOf(new int[]{0, 1, 2, 3, 4, 5},2);
        assertThat(result,is(2));
    }
}
