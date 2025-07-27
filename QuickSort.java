package com.sort;

import java.util.Arrays;

public class QuickSort {
	
	public void quickSort(int[] arr,int low,int high) {
		if(low<high) {
			int partitionIndex = partition(arr, low, high);
			quickSort(arr, low, partitionIndex-1);
			quickSort(arr, partitionIndex+1, high);
		}
	}
	
	public int partition(int[] arr,int low,int high) {
		int i = low;
		int j = high;
		int pivot = arr[low];
		
		while(i<j) {
			//In first while i am using less than or equalto and in second while loop i am using greater than 
			//because i want all the value rightside which is greater than pivot if less than equal to left side
			
			// Move `i` to the right until an element greater than the pivot is found
			while(arr[i]<=pivot && i<high) {
				i++;
			}
			// Move `j` to the left until an element less than or equal to the pivot is found
			while(arr[j]>pivot && j>low) {
				j--;
			}
			if(i<j) {
				swap(arr, i, j);
			}
		}
		// j is a correct position of the pivot so we exchange low with j after rearranging elements
		swap(arr,low,j);
		return j;
	}
	
	public void swap(int[] arr,int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void main(String[] args) {
		QuickSort q = new QuickSort();
		int[] arr = new int[] {7, 4, 1, 5, 3};
		q.quickSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
		
		arr = new int[] {5, 4, 4, 1, 1};
		q.quickSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	 	
}
