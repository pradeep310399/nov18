package november18;

public class ChangeEvenIndexToUpperCase {

	public static void main(String[] args) {
		String Test="changeme";
		
		char[] ch = Test.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			 
			if(i%2==0) {
				
				System.out.println(Character.toUpperCase(ch[i]));
			}else {
				System.out.println(ch[i]);
				
			}
			
		}
			
		}
}