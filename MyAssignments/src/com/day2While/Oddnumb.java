package com.day2While;
//Find out odd number between 30 to 20 using while loop........
public class Oddnumb {
	
	public static void main(String[] args) {
		
		int i=30; 
		
		while(i>=20)
		{
			if(i%2!=0) {
				
				System.out.println(i);
			}
			i--;
		}
	}

}
