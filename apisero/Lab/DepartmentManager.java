package com.apisero.Lab;

public class DepartmentManager {
	//private  Dept[5];
	void modify(int i,Dept d){
		dpt[i]= d;
	}
	
	void print(Dept[] dpt){
		for(int i=0;i<=dpt.length;i++){
			System.out.println(dpt[i].toString());
		}
	}
	
	private Dept[] dpt = new Dept[2] ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//private Dept[5]  = new Dept[5];
		DepartmentManager dm= new DepartmentManager();
	}

}
