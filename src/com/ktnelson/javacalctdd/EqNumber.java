package com.ktnelson.javacalctdd;

import java.math.BigDecimal;

public class EqNumber {
	private BigDecimal value;
	
	public EqNumber(BigDecimal inVal){
		value = inVal;
	}
	
	public EqNumber(String inVal){
		value = new BigDecimal(inVal);
	}
	
	public BigDecimal getValue(){
		return value;
	}
	
	public void setValue(BigDecimal inVal){
		value = inVal;
	}
}
