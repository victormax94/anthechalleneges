package it.challenge.anthea.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringCalculator {

	private String input;

	public StringCalculator(String input) {
		super();
		this.input=input;
	}
   	
	public String[] getDelimiters() {
		String[]  splitArray= this.input.split("//");
		String supportString= splitArray[1].replace("[","").replace("]",",");
		return supportString.split(",");
	}
	public String getStringWithNumberAndDelimiters() {
		return this.input.split("//")[2];
	}
	public boolean checkExistDelimiters() {
		return this.input.contains("//");
	}
	public List<String> getArrayOfNumbers() {
		List<String> resultArray;
		if(this.checkExistDelimiters()) {
			resultArray=this.getArrayOfNumberWithDelimitersFiltered();
		}
		else
			resultArray= new ArrayList<String>(Arrays.asList(this.input.split(",")));
	 return resultArray;	
	}
	public List<String> getArrayOfNumberWithDelimitersFiltered() {
		String[] delimiters=this.getDelimiters();
		String numbersWithDelimiters=this.getStringWithNumberAndDelimiters();
		List<String>  arrayResult;
		for(String delimiter:delimiters) {
			numbersWithDelimiters=numbersWithDelimiters.replace(delimiter,",");
		}
		arrayResult=new ArrayList<String>(Arrays.asList(numbersWithDelimiters.split(","))); 		
	  return arrayResult;
	}
	//pre-condition: no negatives numbers
	public int add() {
		int sum=0;
		List<String> arrayOfNumbers= this.getArrayOfNumbers();
		for(String n: arrayOfNumbers) {
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
		List<String> arrayOfNumbers= this.getArrayOfNumbers();
		for(String n:arrayOfNumbers) {
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
