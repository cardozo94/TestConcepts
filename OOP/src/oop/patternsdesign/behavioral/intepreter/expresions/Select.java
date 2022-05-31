package oop.patternsdesign.behavioral.intepreter.expresions;

import java.util.List;

import oop.patternsdesign.behavioral.intepreter.context.Context;

public class Select implements Expression {
	
	private String column;
	private From from; 
	
	public Select(String column, From from) {
		this.column = column;
		this.from = from;
	}

	@Override
	public List<String> interpret(Context ctx) {
		ctx.setColumn(column);
		return from.interpret(ctx);
	}

}
