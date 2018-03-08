package ru.job4j.calculator;

public class Converter {
	public static final int euroRate = 70;
	public static final int dollarRate = 60;
	public int rubleToEuro(int value) {
		final int euro = value / euroRate;
		return euro;
	}
	public int rubleToDollar(int value) {
		final int dollar = value / dollarRate;
		return dollar;
	}
	public int euroToRuble(int value){
		final int ruble = value * euroRate;
		return ruble;
	}
	public int dollarToRuble(int value){
		final int ruble = value * dollarRate;
		return ruble;
	}
}