package com.clsa;

public class CalcyImpl implements Calcy{
	@Override
	public int sum(int... args) {
		if(args.length < 2) {
			throw new IllegalArgumentException("Please pass atleast two arguments.");
		}
		int sum = 0;
		for(int n : args) {
			sum = sum + n;
		}
		return sum;
	}
}
