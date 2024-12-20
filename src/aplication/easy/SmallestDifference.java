package aplication.easy;

import java.util.Arrays;

public class SmallestDifference {

	public static void main(String[] args) {
	int[] array1 = {1,3,15,11,2};
	int[] array2 = {23,127,235,19,8};
	
	int[] result = smallDifference(array1, array2);
    System.out.println("Menor diferença entre: " + result[0] + " e " + result[1]);

	}
		
	// Força bruta
	public static int[] smallDifference(int [] arr1, int [] arr2) {
		int menor = Integer.MAX_VALUE;
		int number1 = 0;
		int number2 = 0;
		
		for(int i =0 ; i<arr1.length; i++) {
		
			for(int j =0 ; j<arr2.length; j++) {
				int diff =  Math.abs(arr1[i] - arr2[j]); 
				if(diff< menor) {
					menor = diff;
					number1 = arr1[i];
					number2 = arr2[j];
				}
			}
		}
		return new int[] {number1, number2};
	}
	
	// Otimizada
	public static int [] smallDifference2(int [] arr1, int arr2 []) {
		int menor = Integer.MAX_VALUE;
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int num1= 0, num2 = 0, i = 0, j = 0;
		
		while (i<arr1.length && j<arr2.length) {
			int diference = Math.abs(arr1[i] - arr2[j]);
				
			if(diference<menor) {
					menor = diference;
					num1 =  arr1[i];
					num2 =  arr1[j];
				}
		
			if(arr1[i] < arr2[j]) {
				i++;
			}
				j++;
		}
		return new int [] {num1, num2};
	}
		
}
