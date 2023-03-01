package com.day2While;

import java.util.Scanner;

public class Table {
	
	public static void main(String[] args) {
		int table=0;int i=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter U r number: ");
		int num=sc.nextInt();
		
		while(i<=10) {
			
			table=num*i;
			
			{
				System.out.println(table);
			}
			i++;
		}
		
	}

}
