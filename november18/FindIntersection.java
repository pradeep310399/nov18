package november18;

public class FindIntersection {

	public static void main(String[] args) {
		//declare the array 
		int[] arr1= {3,2,11,4,6,7};
		int[] arr2 = {1,2,8,4,9,7};
		
		// loop iterator 
		
		for(int i=0;i<arr1.length;i++) {
			
			for(int j=0;j<arr2.length;j++) {
				
				//compare both arrays
				
				if(arr1[i]==arr2[j]) {
					System.out.println("The intersection Elements:"+arr1[i]);
					
				}
			}
		}
		
    	
		
		
		
	

	}

}
