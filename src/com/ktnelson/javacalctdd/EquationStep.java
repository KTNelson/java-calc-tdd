package com.ktnelson.javacalctdd;

import java.math.BigDecimal;

public class EquationStep {
	
	public enum eOperator{
		eOperator_Plus,
		eOperator_Subtract,
		eOperator_Multiply,
		eOperator_Divide
	}
	
	private BigDecimal lhs;
	private BigDecimal rhs;
	private eOperator operator;
	private BigDecimal result;
	
	
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
	
	public void execute(){
		switch(operator)
		{
		case eOperator_Plus: result = lhs.add(rhs);
			break;
		case eOperator_Subtract: result = lhs.subtract(rhs);
			break;
		case eOperator_Divide: result = lhs.divide(rhs);
			break;
		case eOperator_Multiply: result = lhs.multiply(rhs);
		}
	}
	
	public BigDecimal getResult(){
		return result;
	}
}
