package ru.job4j.calculator;

public class Converter {
	public static final int EURO_RATE = 70;
	public static final int DOLLAR_RATE = 60;
	public int rubleToEuro(int value) {
		final int euro = value / EURO_RATE;
		return euro;
	}
	public int rubleToDollar(int value) {
		final int dollar = value / DOLLAR_RATE;
		return dollar;
	}
	public int euroToRuble(int value){
		final int ruble = value * EURO_RATE;
		return ruble;
	}
	public int dollarToRuble(int value){
		final int ruble = value * DOLLAR_RATE;
		return ruble;
	}
}