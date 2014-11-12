package com.ktnelson.javacalctdd.test;

import static org.junit.Assert.*;
import org.junit.Test;

import com.ktnelson.javacalctdd.EquationStep;

import java.math.BigDecimal;

public class EquationStepTest {
	
	public void runTests() {
		equationStepShouldCreateCorrectly();
	}

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
		
		stepTest.setLeftHandValue(new BigDecimal(12));
		stepTest.setRightHandValue(new BigDecimal(95));
		
		assertEquals("Left Hand Value should equal 12", new BigDecimal(12), stepTest.getLeftHandValue());
		assertEquals("Right hand value should equal 95", new BigDecimal(95), stepTest.getRightHandValue());
		
		System.out.println("valuesShouldSetCorrectly complete");

	}
}
