package it.challenge.anthea.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringCalculator {

	private List<String> input;

	public StringCalculator(String input) {
		super();
		this.input = convertIntoNumberList(input);
	}

	public List<String> convertIntoNumberList(String s) {
		String stringOfNumbers = s.replaceAll("[^-?0-9]+", " "); 
		List<String>  listOfNumbers=Arrays.asList(stringOfNumbers.trim().split(" "));
		return listOfNumbers;
	}


	//pre-condition: no negatives numbers
	public int add() {

		

		int sum=0;

		for(String n: this.input) {
	      if(!n.trim().equals("")) {
			Integer intValue = Integer.valueOf(n);
			if(intValue<1000)
				sum+=intValue;
	      }
		}

		return sum;

	}

	public boolean checkNoNegativeNumbers() {

		List<Integer> negativeNumbers= new ArrayList<>();
	

		for(String n:this.input) {
		  if(!n.trim().equals("")) {
			Integer intValue = Integer.valueOf(n);
			if(intValue<0)
				negativeNumbers.add(intValue);
		  }
		}

		boolean existNegativeNumbers= negativeNumbers.size()>0;

		if(existNegativeNumbers)
			System.out.print("negatives not allowed: "+negativeNumbers);

		return existNegativeNumbers;

	}



}
