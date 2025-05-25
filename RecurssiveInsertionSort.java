package com.sort;

import java.util.Arrays;

public class RecurssiveInsertionSort {
	
	public static void main(String[] args) {
		RecurssiveInsertionSort sort = new RecurssiveInsertionSort();
		int[] arr = {3,2,1};
		System.out.println(Arrays.toString(sort.recurssiveInsertionSort(arr, 1)));
		
		arr = new int[]{1,2,1};
		System.out.println(Arrays.toString(sort.recurssiveInsertionSort(arr, 1)));
	}
	
	public int[] recurssiveInsertionSort(int[] arr,int n) {
		if(n>arr.length-1) {
			return arr;
		}
		int j = n;
		while(j>0 && arr[j-1]>arr[j]) {
			int a = arr[j];
			arr[j] = arr[j-1];
			arr[j-1] = a;
			j--;
		}
		return recurssiveInsertionSort(arr,n+1);
	}
}