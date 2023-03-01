package com.AssignDowhile;

import java.util.Scanner;

public class AreaCal {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char ch;
		
		do
		 {
			System.out.println("Enter Your case for 1.rectangle 2.circle 3.triangle: ");
			System.out.println("Enter Your Choise:  ");
			int ope=sc.nextInt();
			switch (ope) {

			case 1:
				System.out.println("Enter your Length and breadth:");
				int l = sc.nextInt();
				int b = sc.nextInt();
				System.out.println("Area of rectangle : " + l * b);
				break;
			case 2:
				System.out.println("Enter your circle Radius:");
				float r = sc.nextFloat();
				float area = 3.14f * r * r;
				System.out.println(area);
				break;
			case 3:
				System.out.println("Enter your Height and base");
				float height = sc.nextFloat();
				float base = sc.nextFloat();
				float triarea = 0.5f * height * base;
				System.out.println(triarea);
				break;
			default:
				System.out.println("Inavalid choise !");
			}
			System.out.println("Do you want Continue.."	);
			ch = sc.next().charAt(0);

		} while (ch == 'y' || ch == 'Y');

	}

}
