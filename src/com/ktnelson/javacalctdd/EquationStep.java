package com.ktnelson.javacalctdd;

import java.math.BigDecimal;

public class EquationStep {
	
	private BigDecimal lhs;
	private BigDecimal rhs;
	private eOperator operator;
	
	public enum eOperator{
		eOperator_Plus,
		eOperator_Subtract,
		eOperator_Multiply,
		eOperator_Divide
	}
	
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
	
	public void setOperator(eOperator op){
		operator = op;
	}
	public eOperator getOperator(){
		return operator;
	}
}
