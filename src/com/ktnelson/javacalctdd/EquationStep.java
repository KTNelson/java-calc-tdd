package com.ktnelson.javacalctdd;

import java.math.BigDecimal;

public class EquationStep {
	
	private BigDecimal lhs;
	private BigDecimal rhs;
	
	public EquationStep() {
		
	}
	
	public void setLeftHandValue(BigDecimal leftHandSide) {
		lhs = leftHandSide;
	}
	public BigDecimal getLeftHandValue() {
		return lhs;
	}
	
	public void setRightHandValue(BigDecimal rightHandSide){
		rhs = rightHandSide;
	}
	public BigDecimal getRightHandValue() {
		return rhs;
	}
}
