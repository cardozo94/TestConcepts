package oop.patternsdesign.behavioral.intepreter.expresions;

import java.util.List;

import oop.patternsdesign.behavioral.intepreter.context.Context;

public class From implements Expression {

	private String table;
	private Where where;

	public From(String table) {
		this.table = table;
	}
	
	public From(String table, Where where) {
		this.table = table;
		this.where = where;
	}

	@Override
	public List<String> interpret(Context ctx) {
		ctx.setTable(table);
		if(where == null)
			return ctx.search();
		return where.interpret(ctx);
	}

}
