package it.challenge.anthea.main;

import java.util.Arrays;
import java.util.Scanner;

import it.challenge.anthea.domain.StringCalculator;

class MainApplication {

	public static void main(String[] args) {

		System.out.println("Inserisci input: ");
		Scanner scan= new Scanner(System.in);
		String inputString= scan.nextLine();

		try {
		StringCalculator stringCalculator= new StringCalculator(inputString);
		if(!stringCalculator.checkNoNegativeNumbers())
			System.out.print(stringCalculator.add());
		}
		catch(Exception e) {
			System.out.println("String not well formatted");
		}
	}

	
}
