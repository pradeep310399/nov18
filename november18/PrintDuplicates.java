package november18;

public class PrintDuplicates {

	public static void main(String[] args) {
		int[] arr =  {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int length = arr.length;
		int count;
		for(int i=0;i<=arr.length-1;i++) {
			count=0;
			 for(int j=i+1;j<=arr.length-1;j++) {
				 
				 if(arr[i]==arr[j]) {
					 count++;
					 
					 
				 }
					 
			 }
			if(count>0) {
				
				System.out.println("the duplicate number is" + arr[i]);
			}
			
		}
		
		
		

	}

}
