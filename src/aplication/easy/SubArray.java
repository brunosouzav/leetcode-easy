package aplication.easy;

public class SubArray {

	public static void main(String[] args) {
			
	
}


	public static int [] subArray(int[] numbs, int target) {
		int result = 0;
		int start = 0;
		
		
			for(int end =0;  end<numbs.length; end++) {
				result += numbs[end];
				
				while (result< target && start<= end) {
					result -= numbs[start];
					start ++;
				}
					
				if(result == target) {
					return new int[] {start, end};
				}
			}
			return null;

	} 
	

}
