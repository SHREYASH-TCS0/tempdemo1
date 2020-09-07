package com.apisero.Calculator;

public class Calc {
	public int add(int a, int b){
		System.out.print("Sum of "+a+" and "+b+" is: ");
		return a+b;
	}
	
	public int sub(int a, int b){
		System.out.print("Difference of "+a+" and "+b+" is: ");
		return a-b;
	}
	
	public int mult(int a, int b){
		System.out.print("Product of "+a+" and "+b+" is: ");
		return a*b;
	}
	
	public int div(int a, int b){
		System.out.print("Division of "+a+" and "+b+" is: ");
		return a/b;
	}
	
	public int div(int a){   
			int fact=1;
			for(i=1;i<=a;i++){    
				fact=fact*i;    
		}
		return fact;
	}
}
