package com.task_epam_5.Exceptions_Logger;

public class CompoundInterest {
	public double calculate(double principle, double time, double rate) {
	    double amount = principle * (Math.pow((1 + rate / 100), time));
	    double compoundinterest = amount - principle;
	    return compoundinterest;
	   }
}
