package com.AssignOper;

public class LogicalOperator {

	public static void main(String[] args) {
		
		System.out.println((4>3)&&(8>5));
		System.out.println((4>3)&&(8<5));
		
		System.out.println((4>3)||(8>5));
		System.out.println((4>3)||(8<5));
		System.out.println((4<3)||(8<5));
	
		System.out.println(!(4==3));
		System.out.println(!(4>3));

	}

}
