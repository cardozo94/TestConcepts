package oop.patternsdesign.behavioral.intepreter.expresions;

import java.util.List;

import oop.patternsdesign.behavioral.intepreter.context.Context;

public interface Expression {
	List<String> interpret(Context ctx);
}
