package com.sz.binary;

import java.util.Arrays;
import java.util.Scanner;

public class HomeworkOfReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int [] arr = {100,5,6,8,9,10,11};
		//odd
		int countO = 1;
		System.out.println(Arrays.toString(arr));
		if (arr.length % 2 == 1) {
			int length = arr.length/2;
			for (int i=0; i <length; i++) {
				int first = arr[i];
				int last = arr[arr.length-countO];
				arr[arr.length-countO] = first;
				arr [i] = last;
				countO++;
			}	
			System.out.println(Arrays.toString(arr));
		}


		//even
		int countE = 1;
		if (arr.length % 2 == 0) {
			int length = arr.length/2;
			for (int i=0; i <length; i++) {
				int first = arr[i];
				int last = arr[arr.length-countO];
				arr[arr.length-countO] = first;
				arr [i] = last;
				countO++;
			}	
			System.out.println(Arrays.toString(arr));
		}

	}

}
