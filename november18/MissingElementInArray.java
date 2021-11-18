package november18;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,7,6,8};
		//sort the array
	     Arrays.sort(arr);
		
		
		
		//loop condition
		for(int i=arr[0];i<arr.length;i++) {
			System.out.println("i:"+i);
			System.out.println("[i-1]:"+(i-1));
			System.out.println("arr[i-1]:"+arr[i-1]);
			
			if(i!=arr[i-1]) {
				System.out.println("The Missing Element is:"+i);
				break;
				
			}
			
			
		}
		
		
		

	}

}
