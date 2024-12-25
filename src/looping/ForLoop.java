package looping;

import java.util.Iterator;

public class ForLoop {

	public static void main(String[] args) {
	
		/*
		 * int[] a = {10,1,3,4,9,5,6,7};
		 * 
		 * 
		 * for(int i=0;i<a.length;i++) { System.out.println(a[3]); break; }
		 */
		
		String B = "Logesh";
		
		char[] charArray = B.toCharArray();
		
		for (int i = 0; i < charArray.length; i++) {
			
			System.out.println(charArray[i]);
			
		}
	}

}
// i=6; 6< 6;I++ //true 

//{System.out.println(charArray[0]); // console = L L L L L L
