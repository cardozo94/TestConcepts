package oop.patternsdesign.behavioral.intepreter;

import java.util.List;

import oop.patternsdesign.behavioral.intepreter.context.Context;
import oop.patternsdesign.behavioral.intepreter.expresions.Expression;
import oop.patternsdesign.behavioral.intepreter.expresions.From;
import oop.patternsdesign.behavioral.intepreter.expresions.Select;
import oop.patternsdesign.behavioral.intepreter.expresions.Where;

public class InterpreterDemo {

	//This example is base on /OOP/resources/behavioral/Interpreter.webp
	public static void main(String[] args) {
		Expression query = new Select("name", new From("people"));
		Context ctx = new Context();
		List<String> result = query.interpret(ctx);
		System.out.println(result);

		Expression query2 = new Select("*", new From("people"));
		List<String> result2 = query2.interpret(ctx);
		System.out.println(result2);

		Expression query3 = new Select("name",
				new From("people", new Where(name -> name.toLowerCase().startsWith("d"))));
		List<String> result3 = query3.interpret(ctx);
		System.out.println(result3);
	}

}
