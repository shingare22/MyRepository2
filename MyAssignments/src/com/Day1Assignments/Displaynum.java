package com.Day1Assignments;

//take  1 to 5 number from user and display in words 
import java.util.Scanner;
public class Displaynum {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your numbers: ");
		int num=sc.nextInt();
		
		switch(num) {
		
		case 1:System.out.println("One");
		break;
		case 2:System.out.println("Two");
		break;
		case 3:System.out.println("Three");
		break;
		case 4:System.out.println("Four");
		break;
		case 5:System.out.println("Five");
		break;
		default:System.out.println("Invalid number");
		}
		
	}
}
