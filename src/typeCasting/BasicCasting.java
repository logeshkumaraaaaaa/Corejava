package typeCasting;

import sample.SingeInheritenceMain;

public class BasicCasting {

	public static void main(String[] args) {
		//Widening castig
		//Narrowing casting
		
		//byte,short,int,long,float,double,char,boolean
		byte b = 4;
		int c=b;
		long d = c;
		float e = d;
		double f = e;
		
		/*
		 * System.out.println("This is float value: " + e);
		 * System.out.println("This is int value: " + c);
		 */
		
		//2
		
		double df = 42.9;
		float ff = (float)df;
		
	//	System.out.println(ff);
		
		
		int ab = 97;
		
		
		char aaa = (char ) ab ;
		System.out.println(aaa);
		
		
		//ACII A=66, a=97
		
		
		
		

	}

}
