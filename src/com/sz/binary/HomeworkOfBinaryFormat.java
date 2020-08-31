package com.sz.binary;

import java.util.Arrays;
import java.util.Scanner;

public class HomeworkOfBinaryFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int [] bits = new int [32];
		
		while (true) {
			String Input = sc.nextLine();
			if ("STOP".equals(Input)) {
				break;
			}
			int counter = 0;
			int input = Integer.parseInt(Input);
			for (int i=0; i<bits.length; i++) {
				bits[i] = 0;
			}
			int remainder = 0;
			if (input > 0) {
				while (true) {
					remainder = input % 2;

					input /= 2;

					bits[31-counter] = remainder;
					++counter;

					if (input == 0) {
						break;
					}

				}

			}

			if (input < 0) {
				int n = input - input - input;
				while (true) {
					remainder = n % 2;

					n /= 2;

					bits[31-counter] = remainder;
					++counter;

					if (n == 0) {
						break;
					}
				}

				for (int i=0;i<bits.length-1; i++) {
					if (bits[i] == 1) {
						bits[i] = 0;
					}
					else if (bits[i] == 0) {
						bits[i] = 1;
					}

				}

			}

			for (int i =0; i<bits.length; i++) {
				int c = bits[i];
				System.out.format("%d ",c);
			}
			System.out.println();

		}

	}

}
