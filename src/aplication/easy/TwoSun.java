package aplication.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSun {

	public static void main(String[] args) {
	
		int [] nums = {2,7,11,15};
		int target = 9;
	
		int[] result = twoSun(nums, target); 
		
	
	}

	
	public static int [] twoSun(int [] nums, int target) {
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i<nums.length; i++) {
			int complement =  target - nums[i];
			if(map.containsKey(complement)) {
				return new int [] {map.get(complement), i};
			}
			map.put(nums[i], i);
		}
		return null;
	}

	
}