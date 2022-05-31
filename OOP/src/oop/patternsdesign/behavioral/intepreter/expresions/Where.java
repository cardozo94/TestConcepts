package oop.patternsdesign.behavioral.intepreter.expresions;

import java.util.List;
import java.util.function.Predicate;

import oop.patternsdesign.behavioral.intepreter.context.Context;

public class Where implements Expression{
	
	private Predicate<String> filter;
	
	public Where(Predicate<String> filter) {
		this.filter = filter;
	}

	@Override
	public List<String> interpret(Context ctx) {
		ctx.setFilter(filter);
		return ctx.search();
	}

}
