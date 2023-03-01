package com.Day1Assignments;
import java.util.Scanner;
//Find Out Char is Vowel or Consonant
public class Vowelconsonant {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your char");
		char ch=sc.next().charAt(0);
		
		switch(ch) {
		
		case 'i': 		
		case 'o':	
		case 'u':
		case 'e':
		case 'a':
			System.out.println("char is Vowel");
		break;
		default :System.out.println("Char is Consonant");
		}		
	}
}
