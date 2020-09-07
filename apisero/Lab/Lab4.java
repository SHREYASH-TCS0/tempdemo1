package com.apisero.Lab;

import java.util.Scanner;

public class Lab4 {

	static int getAverageLength(String[] set){
		 int averageLength = 0,  average=0;
		if (set == null || set.length == 0 ) {
            return 0;
        } else {
        	for (int a = 0; a < set.length; a++) {
               
				if (set[a] == null) {
                    averageLength += 0;
                }
                else {
                    if (set[a] != null) {
                        averageLength += set[a].length();
                        
                    }
                }
                 average =  averageLength / set.length;
            }
        }
		return average;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = new String[5];
		Scanner input = new Scanner(System.in);
		for(int i=0;i<str .length;i++){
			str[i]=input.next();
		}
		 
		int avgLength=getAverageLength(str);
		System.out.println("avgLength: "+avgLength);
		
		for(int i=0; i<str .length;i++){
			System.out.println("length of String: "+str[i]+" "+str[i].length());
		}
		input.close();
	}
	
}
