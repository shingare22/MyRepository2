package com.Day1Assignments;
//print table of given number 
import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
	
	int table=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Your Number: ");
	int num=sc.nextInt();
	
	for(int i=1;i<=10;i++) {
		
		 table=num*i;
		
	
	System.out.println(table);
	
}
    }

}