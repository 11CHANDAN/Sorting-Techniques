package com.sort;

import java.util.Arrays;

public class RecurssiveBubbleSort {

	public static void main(String[] args) {
		RecurssiveBubbleSort sort = new RecurssiveBubbleSort();
		int[] arr = {3,2,1};
		System.out.println(Arrays.toString(sort.recurssiveBubbleSort(arr, 0)));
		
		arr = new int[]{1,2,1};
		System.out.println(Arrays.toString(sort.recurssiveBubbleSort(arr, 0)));
	}
	
	public int[] recurssiveBubbleSort(int[] arr,int i) {
		
		if(i == arr.length) {
			return arr;
		}
		
		boolean swapped = false;
		for(int j=0;j<arr.length-i-1;j++) {
			if(arr[j]>arr[j+1]) {
				int a = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = a;
				swapped = true;
			}
		}
		
		if(swapped == false) {
			return arr;
		}
		
		return recurssiveBubbleSort(arr, i++);
	}

}
