package com.sz.binary;

import java.util.Scanner;

public class HomeworkOfPrimeFactoring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);

		while (true) {
			String Input = sc.nextLine();
			if ("STOP".equals(Input)) {
				break;
			}
			try {
				//30
				int input = Integer.parseInt(Input);
				int [] prime = new int [(int) Math.sqrt(input)+1];
				int counter = 1;
				int primeCounter = 0;
				prime[0] = 2;
				for (int i = 2; i<input; i++) {
					int currentNumber = 0;
					for (int j = 3; j<input; j++) {
						currentNumber = j;
						if (currentNumber % i== 0) {
							primeCounter ++;
						}
						if (primeCounter < 1) {
							prime[counter] = currentNumber;
							counter++;
						}
					}

					primeCounter = 0;
				}
				for (int i=0; i<prime.length; i++) {
					System.out.println(prime[i]);
				}
				int quotient = input;
				for (int i = 2; i<=Math.sqrt(input)+1; i++) {

				}





			}catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println();
			}
		}
	}

}
