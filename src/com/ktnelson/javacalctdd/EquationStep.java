package com.ktnelson.javacalctdd;

import java.math.BigDecimal;

public class EquationStep {
	
	public enum eOperator{
		eOperator_Plus,
		eOperator_Subtract,
		eOperator_Multiply,
		eOperator_Divide
	}
	
	private EqNumber lhs;
	private EqNumber rhs;
	private eOperator operator;
	private EqNumber result;
	
	public EquationStep(){
		lhs = new EqNumber("0");
		rhs = new EqNumber("0");
		result = new EqNumber("0");
	}
	
	public EquationStep(EqNumber leftHandSide, eOperator op, EqNumber rightHandSide){
		lhs = leftHandSide;
		rhs = rightHandSide;
		operator = op;
	}
	
	public void setLeftHandValue(EqNumber leftHandSide) {
		lhs = leftHandSide;
	}

	public EqNumber getLeftHandValue() {
		return lhs;
	}

	
	public void setRightHandValue(EqNumber rightHandSide){
		rhs = rightHandSide;
	}

	public EqNumber getRightHandValue() {
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
		case eOperator_Plus: result = new EqNumber(lhs.getValue().add(rhs.getValue()));
			break;
		case eOperator_Subtract: result = new EqNumber(lhs.getValue().subtract(rhs.getValue()));
			break;
		case eOperator_Divide: result = new EqNumber(lhs.getValue().divide(rhs.getValue()));
			break;
		case eOperator_Multiply: result = new EqNumber(lhs.getValue().multiply(rhs.getValue()));
		}
	}
	
	public EqNumber getResult(){
		return result;
	}
}
