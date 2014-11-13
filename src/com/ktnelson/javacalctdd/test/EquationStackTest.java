package com.ktnelson.javacalctdd.test;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

import com.ktnelson.javacalctdd.EquationStack;
import com.ktnelson.javacalctdd.EquationStep;


public class EquationStackTest {
	
	public void runTests(){}
	
	@Test
	public void stackShouldCreateCorrectly(){
		EquationStack stack = new EquationStack();
		stack.addEquation(new EquationStep(
				new BigDecimal(12), 
				EquationStep.eOperator.eOperator_Plus,
				new BigDecimal(40)));
		
		assertNotNull("EquationStack shouldn't be null", stack);
		assertNotNull("EquationStack.stack shouldn't be null", stack.getStack());
		
	}

}
