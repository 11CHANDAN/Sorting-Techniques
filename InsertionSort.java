package com.sort;

import java.util.Arrays;

public class InsertionSort {
	
	public static void main(String[] args) {
		InsertionSort sort = new InsertionSort();
		int[] arr = {3,2,1};
		System.out.println(Arrays.toString(sort.insertionSort(arr)));
	}
	
	public int[] insertionSort(int[] arr) {
		for(int i=1 ; i<arr.length ; i++) {
			int j=i;
			while(j>0 && arr[j-1]>arr[j]) {
				arr[j-1] = arr[j-1] + arr[j];
				arr[j]   = arr[j-1] - arr[j];
				arr[j-1] = arr[j-1] - arr[j];
				j--;
			}
		}
		return arr;
	}

}
