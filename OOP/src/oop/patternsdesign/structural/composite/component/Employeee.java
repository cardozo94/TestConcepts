package oop.patternsdesign.structural.composite.component;

import java.util.ArrayList;
import java.util.List;

public class Employeee {
	
	private String name;
	private String dept;
	private int salary;
	private List<Employeee> subordinates;
	
	public Employeee(String name, String dept, int salary) {
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		subordinates = new ArrayList<Employeee>();
	}
	
	public void add(Employeee e) {
		subordinates.add(e);
	}
	
	public void remove(Employeee e) {
		subordinates.remove(e);
	}
	
	public List<Employeee> getSubordinates() {
		return subordinates;
	}
	
	public String toString() {
		return ("Employee :[ Name : "+name+", dept: "+dept+", salary : "+salary+"]");
	}

}
