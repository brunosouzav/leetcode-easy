package aplication.easy;

import java.util.Scanner;

public class Exponencial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);	
		
		int t = sc.nextInt();
		
		for(int i = 0; i<t; i ++) {
			
			int a =sc.nextInt();
			int b = sc.nextInt();
			int n = sc.nextInt();
			
			int num =a;
			for(int j =0; j<n; j++) {
				 num += (int)Math.pow(2, j) *b ;
					
				System.out.print(num +" ");
			}
			 System.out.println();
			}
		
		
		sc.close();
		
		}
		
				
	}
	
	


