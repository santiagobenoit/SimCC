package org.concordcarlisle.codingclub.simcc.people;


public class Student extends Person
{
	double gpa;
	int yog, motivationLevel;
	boolean attendingClass;

	public Student(double g, int y, int m)
	{
		super();
		gpa = g;
		yog = y;
		motivationLevel = m;
	}

	public void skipClass()
	{
		attendingClass = false;
	}
}
