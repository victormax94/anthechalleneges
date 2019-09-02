package it.challenge.anthea.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import it.challenge.anthea.domain.StringCalculator;

class TestSteps {
	
	StringCalculator stepOneA= new StringCalculator("1,2,3");
	StringCalculator stepOneB= new StringCalculator("");
	StringCalculator stepTwo= new StringCalculator("23,45,72,34,52,12,1,5,654,231,12,32");
	StringCalculator stepThree=new StringCalculator("1,-2,-3,5");
	StringCalculator stepFour=new StringCalculator("1023,145,702,3400,520,12000,1,5,654,231,12,32");
	StringCalculator stepFive= new StringCalculator("//[***]//1***2***3");
	StringCalculator stepSix= new StringCalculator("//[*][%]//1*2%3");

	@Test
	void stepOneA() {
		assertTrue(stepOneA.add()==(1+2+3));;
	}
	
	@Test
	void stepOneB() {
		assertTrue(stepOneB.add()==0);;
	}
	
	@Test
	void stepTwo() {
		assertTrue(stepTwo.add()==(23+45+72+34+52+12+1+5+654+231+12+32));
	}
	
	@Test
	void stepFour() {
		assertTrue(stepFour.add()==(145+702+520+1+5+654+231+12+32));
	}
	
	@Test
	void stepThree() {
		assertTrue(stepThree.checkNoNegativeNumbers()==true);
	}
	
	@Test
	void stepFive() {
		assertTrue(stepFive.add()==(1+2+3));
	}
	
	@Test
	void stepSix() {
		assertTrue(stepSix.add()==(1+2+3));
	}

}
