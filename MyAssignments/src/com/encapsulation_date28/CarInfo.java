package com.encapsulation_date28;

public class CarInfo {
	
	public static void main(String[] args) {
		
			CarDetails d=new CarDetails();
			
			d.setId(101);
			d.setName("Thar");
			d.setPrice(150000);
			d.setColour("Black");
			
			System.out.println(d.getId()+" \n"+d.getName()+" \n"+d.getPrice()+"\n"+d.getColour());
	}

}
