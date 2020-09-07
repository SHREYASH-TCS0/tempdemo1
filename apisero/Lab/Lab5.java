package com.apisero.Lab;

import java.util.Arrays;

public class Lab5 {

	public static void main(String[] args) {
		int[] arr  = new int[10];
		arr[3]=1100;
		System.out.println(Arrays.toString(arr));
		Emp[] emparr = new Emp[5];
		Emp e = new Emp();
		System.out.println(Arrays.toString(emparr));
		System.out.println(e);
		emparr[3] = new Emp();
		emparr[2]=e;
		System.out.println(emparr[3]);
		emparr[3].setSalary(5);
		System.out.println(Arrays.toString(emparr));
	/*	Emp  e1 = new Emp();
		e1.setEmpno(10);
		e1.setEname("vaishali");
		e1.setSalary(1111.00);
		System.out.println(e1.toString());*/
	}
}
