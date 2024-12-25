package aplication.easy;

import java.util.HashMap;

public class RomanInteger {

	public static void main(String[] args) {
	

	}

	public int romanToInt(String str) {
		HashMap<Character, Integer> maps = new HashMap<>();
		
		maps.put('I', 1);
		maps.put('V', 5);
		maps.put('X', 10);
		maps.put('L', 50);
		maps.put('C', 100);
		maps.put('D', 500);
		maps.put('M', 1000);
		
		int total = 0; 
		int prevValue =0;
		
		for(int i = str.length()-1; i>=0; i--) {
			char current = str.charAt(i); 
			int currentValue = maps.get(current); 
			
			if(currentValue< prevValue ) {
				total -= currentValue;
			}
			else {
			total += currentValue;
		}
			prevValue = currentValue;
		}
		return total;
	}
}
