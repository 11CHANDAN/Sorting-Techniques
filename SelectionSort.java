package com.sort;

import java.util.Arrays;

public class SelectionSort {
	
	public static void main(String[] args) {
		SelectionSort sort = new SelectionSort();
		int[] arr = {4,5,2,3,1};
		System.out.println(Arrays.toString(sort.selectionSort(arr)));
	}
	
	public int[] selectionSort(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    nums[i] = nums[i] + nums[j];
                    nums[j] = nums[i] - nums[j];
                    nums[i] = nums[i] - nums[j];
                }
            }
        }
        return nums;
    }

}
