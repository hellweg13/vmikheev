package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArraysCharTest {
    @Test
    public void whenStartWithPrefixThenTrue() {
        ArraysChar word = new ArraysChar("Hello");
        boolean result = word.startWith("He");
        assertThat(result, is(true));
    }

    @Test
    public void whenNotStartWithPrefixThenFalse() {
        ArraysChar word = new ArraysChar("Hello");
        boolean result = word.startWith("Hi");
        assertThat(result, is(false));
    }
}