package com.ktnelson.javacalctdd.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ktnelson.javacalctdd.EqNumber;
import com.ktnelson.javacalctdd.EquationStep;

public class EquationStepTest {

	@Test
	public void equationStepShouldCreateCorrectly() {

	   // MyClass is tested
	   EquationStep stepTest = new EquationStep();

	   // Tests
	   assertNotNull("This should be null", stepTest);
	   System.out.println("equationStepShouldCreateCorrectly complete");
	 } 
	
	@Test
	public void valuesShouldSetCorrectly(){
		EquationStep stepTest = new EquationStep();
		
		stepTest.setLeftHandValue(new EqNumber("12"));
		stepTest.setRightHandValue(new EqNumber("95"));
		
		assertEquals("Left Hand Value should equal 12", new EqNumber("12"), stepTest.getLeftHandValue());
		assertEquals("Right hand value should equal 95", new EqNumber("95"), stepTest.getRightHandValue());
		
		System.out.println("valuesShouldSetCorrectly complete");

	}
	
	@Test
	public void operatorShouldSetCorrectly(){
		EquationStep stepTest = new EquationStep();
		
		stepTest.setOperator(EquationStep.eOperator.eOperator_Plus);
		
		assertEquals("Operator should equal eOperator_Plus", EquationStep.eOperator.eOperator_Plus, stepTest.getOperator());
		
		System.out.println("operatorShouldSetCorrectly complete");
	}
	
	@Test
	public void equationShouldCalculate(){
		EquationStep stepTest = new EquationStep();
		
		stepTest.setLeftHandValue(new EqNumber("10"));
		stepTest.setRightHandValue(new EqNumber("2"));
		
		stepTest.setOperator(EquationStep.eOperator.eOperator_Plus);
		stepTest.execute();
		assertEquals("Result should equal 12", new EqNumber("12"), stepTest.getResult());
		
		stepTest.setOperator(EquationStep.eOperator.eOperator_Subtract);
		stepTest.execute();
		assertEquals("Result should equal 8", new EqNumber("8"), stepTest.getResult());
		
		stepTest.setOperator(EquationStep.eOperator.eOperator_Divide);
		stepTest.execute();
		assertEquals("Result should equal 5", new EqNumber("5"), stepTest.getResult());
		
		stepTest.setOperator(EquationStep.eOperator.eOperator_Multiply);
		stepTest.execute();
		assertEquals("Result should equal 20", new EqNumber("20"), stepTest.getResult());
	}
}
