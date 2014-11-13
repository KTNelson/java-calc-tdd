package com.ktnelson.javacalctdd;

import java.util.ArrayDeque;

public class EquationStack {
	private ArrayDeque<EquationStep> stack;
	
	public ArrayDeque<EquationStep> getStack(){
		return stack;
	}
	
	public EquationStack(){
		stack = new ArrayDeque<EquationStep>();
	}
	
	public void addEquation(EquationStep newStep){
		stack.add(newStep);
	}
	
	
}
