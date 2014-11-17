package com.ktnelson.javacalctdd;

public class StringParser {
		
	public EquationStep readStep(String input){
		
		EqNumber lhs = null;
		EqNumber rhs = null;
		EquationStep.eOperator op = null;
		
		int rhsStart = 0;
		String potentialLhs = "";
		String potentialRhs = "";
		
		//lhs and operator
		for (int i = 0; i < input.length(); i++){
			char toCheck = input.charAt(i);
			if(isNum(toCheck)){
				potentialLhs += input.charAt(i);
			}else {
				if(isOperator(toCheck))
				{
					lhs = new EqNumber(potentialLhs);
					op = setOperator(toCheck);
					rhsStart = i+1;
				}
			}
		}
		
		//rhs
		for(int i = rhsStart; i < input.length(); i++){
			char toCheck = input.charAt(i);
			if(isNum(toCheck)){
				potentialRhs += toCheck;
			}
		}
		if(rhs == null){
			rhs = new EqNumber(potentialRhs);
		}
		
		return new EquationStep(lhs, op, rhs);
	}
	
	private boolean isNum(char c){
		if(!isSpace(c) && !isOperator(c)){
			return true;
		}
		return false;
	}
	
	private boolean isSpace(char c){
		if(c == ' '){
			return true;
		}
		return false;
	}
	
	private boolean isOperator(char c){
		if(c == '+' || c == '-' || c == '/' || c == '*'){
			return true;
		}
		return false;
	}
	
	private EquationStep.eOperator setOperator(char op){
		EquationStep.eOperator newOp = null;
		switch(op)
		{
		case '+': newOp = EquationStep.eOperator.eOperator_Plus;
			break;
		case '-': newOp = EquationStep.eOperator.eOperator_Subtract;
			break;
		case '/': newOp = EquationStep.eOperator.eOperator_Divide;
			break;
		case '*': newOp = EquationStep.eOperator.eOperator_Multiply;
		}
		return newOp;
	}
}
