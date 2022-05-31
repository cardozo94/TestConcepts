package oop.patternsdesign.structural.composite.component;

public class CompositeDemo {

	public static void main(String[] args) {
		Department salesDepartment = new SalesDepartment(1,"Sales Department");
		Department financialDepartment = new FinancialDepartment(2,"Financial Department");
		HeadDepartment headDepartment = new HeadDepartment(3, "Head Department");
		
		headDepartment.addDepartment(salesDepartment);
		headDepartment.addDepartment(financialDepartment);
		headDepartment.printDepartmentName();

	}

}
