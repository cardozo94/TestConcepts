package oop.patternsdesign.creational.factorymethod.factory;

import oop.patternsdesign.creational.factorymethod.products.CommercialPlan;
import oop.patternsdesign.creational.factorymethod.products.DomesticPlan;
import oop.patternsdesign.creational.factorymethod.products.InstitutionalPlan;
import oop.patternsdesign.creational.factorymethod.products.Plan;

public class PlanFactory {
	
	public Plan getPlan(String planType) {
		Plan plan;
		
		if(planType == null)
			plan = null;
		
		if(planType.equalsIgnoreCase("DOMESTICPLAN"))
			plan = new DomesticPlan();
		else if(planType.equalsIgnoreCase("COMMERCIALPLAN"))
			plan = new CommercialPlan();
		else if(planType.equalsIgnoreCase("INSTITUTIONALPLAN"))
			plan = new InstitutionalPlan();
		else 
			plan = null;
		
		return plan;
	}

}
