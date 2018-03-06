package ru.job4j.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class MaxTest {
	@Test
	public void whenFirstLessSecond() {
		Max maxim = new Max();
		int result = maxim.max(1,2,4);
		assertThat(result,is(4));
	}
	@Test
	public void whenFirstLargeSecond() {
		Max maxim = new Max();
		int result = maxim.max(4,2,6);
		assertThat(result,is(6));
	}
	@Test
	public void whenFirstEqualySecond() {
		Max maxim = new Max();
		int result = maxim.max(3,3,3);
		assertThat(result,is(3));
	}
}