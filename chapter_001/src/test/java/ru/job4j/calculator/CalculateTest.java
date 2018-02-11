package ru.job4j.calculator;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Vladimir Mikheev (hellweg69@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class CalculateTest {
	@Test
	public void whenAddOnePlusOneThenTwo() {
		Calculator calc = new Calculator();
		calc.add(1D, 1D);
		double result = calc.getResult();
		double expected = 2D;
		assertThat(result, is(expected));
	}
	@Test
	public void whenSubtractFourMinusTwoThenTwo() {
		Calculator calc = new Calculator();
		calc.subtract(4D, 2D);
		double result = calc.getResult();
		double expected = 2D;
		assertThat(result, is(expected));
	}
	@Test
	public void whenDivSixDivideThreeThenTwo() {
		Calculator calc = new Calculator();
		calc.div(6D, 3D);
		double result = calc.getResult();
		double expected = 2D;
		assertThat(result, is(expected));
	}
	@Test
	public void whenMultipleTwoMultiplyTwoWhenFour() {
		Calculator calc = new Calculator();
		calc.multiple(2D, 2D);
		double result = calc.getResult();
		double expected = 4D;
		assertThat(result, is(expected));
	}
}