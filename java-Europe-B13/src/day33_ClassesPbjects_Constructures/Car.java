package day33_ClassesPbjects_Constructures;

public class Car {

	
	String model;
	String make;
	int year;
	double mile;
	String color;
	
	/*
	public Car(String m,String ma,int yr,double ml,String cl) {
		model=m;
		make=ma;
		year=yr;
		mile=ml;
		color=cl;
		
	}
	*/
	public Car(String model,String make,int year,double mile,String color) {
		this.model=model;
		this.make=make;
		this.year=year;
		this.mile=mile;
		this.color=color;
}
}