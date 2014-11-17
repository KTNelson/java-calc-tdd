package com.ktnelson.javacalctdd.test;

import org.junit.Test;

import com.ktnelson.javacalctdd.EqNumber;
import com.ktnelson.javacalctdd.EquationStep;
import com.ktnelson.javacalctdd.StringParser;

import static org.junit.Assert.*;


public class StringParserTest {
	
	@Test
	public void stringParserShouldCreateEquationStepCorrectly(){
		StringParser parser = new StringParser();
		//Control
		EquationStep controlStep = new EquationStep(new EqNumber("5"), EquationStep.eOperator.eOperator_Plus, new EqNumber("3"));
		
		controlStep.execute();
		EqNumber controlStepResult = controlStep.getResult();
		
		EquationStep testStep = parser.readStep("5+3");
		testStep.execute();
		EqNumber testStepResult = testStep.getResult();
		
		assertEquals("control and test should be equal at 8", controlStepResult.getValue(), testStepResult.getValue());
	}
	
	@Test
	public void stringParserShouldIgnoreWhitespace(){
		StringParser parser = new StringParser();
		//Control
		EquationStep controlStep = new EquationStep(new EqNumber("5"), EquationStep.eOperator.eOperator_Plus, new EqNumber("3"));
		
		controlStep.execute();
		EqNumber controlStepResult = controlStep.getResult();
		
		EquationStep testStep = parser.readStep(" 5 + 3 ");
		testStep.execute();
		EqNumber testStepResult = testStep.getResult();
		
		assertEquals("control and test should be equal at 8", controlStepResult.getValue(), testStepResult.getValue());
	}

}
