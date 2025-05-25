package com.sort;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = {3,1,2,4,1};
		mergeSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void mergeSort(int[] arr,int low,int high) {
		if(low >= high) {
			return;
		}
		
		int mid = (low+high)/2;
		mergeSort(arr, low, mid);
		mergeSort(arr, mid+1, high);
		merge(arr, low, mid, high);
	}
	
	private static void merge(int[] arr,int low,int mid,int high) {
		int[] temp = new int[high-low+1];
		
		for(int i=0;i<temp.length;i++) {
			temp[i] = arr[i+low];
		}
		
		int left = 0;
		int right=mid-low+1;
		int k = low;
		
		int leftEnd = mid - low;
		int rightEnd = high - low;
		
		while(left <= leftEnd && right <= rightEnd) {
			if(temp[left]<=temp[right]) {
				arr[k++] = temp[left++];
			}else {
				arr[k++] = temp[right++];
			}
		}
		
		while(left <= leftEnd) {
			arr[k++] = temp[left++];
		}
		
		while(right <= rightEnd) {
			arr[k++] = temp[right++];
		}
		
	}
	
}
