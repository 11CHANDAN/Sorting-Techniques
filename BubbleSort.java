package com.sort;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		BubbleSort sort = new BubbleSort();
		int[] arr = {3,2,1};
		System.out.println(Arrays.toString(sort.bubbleSort(arr)));
	}
	
	public int[] bubbleSort(int[] nums) {
        for(int i=0;i<nums.length;i++){
            boolean swap = false;
            for(int j=0;j<nums.length-i-1;j++){
                if(nums[j]>nums[j+1]){
                    nums[j] = nums[j] + nums[j+1];
                    nums[j+1] = nums[j] - nums[j+1];
                    nums[j] = nums[j] - nums[j+1];
                    swap = true;
                }
            }
            if(!swap){
                break;
            }
        }
        return nums;
    }

}
