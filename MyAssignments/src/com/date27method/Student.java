package com.date27method;

public class Student {
	
	int sid;
	String sname;
	int Maths_marks;
	int Eng_marks;
	int Chem_marks;
	float percentage;
	
	
	public void StudDetails(int id ,String name, int M_marks,int E_marks,int Ch_marks) 
	{
			sid=id;
			sname=name;
			Maths_marks=M_marks;
			Eng_marks=E_marks;
			Chem_marks=Ch_marks;
			 
	}
	
	public void Percetange() 
	{
		  int Total=Maths_marks+Eng_marks+Chem_marks;
		 float Per=Total/3f;
		  System.out.println(Per);
		 
	}
	public void Alldetails() 
	{
		System.out.print (sid+" "+" "+sname+" ");
		System.out.print("Maths marks: "+Maths_marks+" Eng Marks: "+Eng_marks+" Chem Marks: "+Chem_marks+"  Student Per = ");
		Percetange();
	}
	
	public static void main(String[] args) {
		
		
		Student s=new Student();
		s.StudDetails(101,"Ram",74,75,76);
		s.Percetange();
		s.Alldetails();
		
	}

}
