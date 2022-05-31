package oop.patternsdesign.behavioral.intepreter.context;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Context {

	private static Map<String, List<Row>> tables = new HashMap<String, List<Row>>();

	static {
		List<Row> list = new ArrayList<Row>();
		list.add(new Row("Jhon", "Dow"));
		list.add(new Row("Jan", "Kowalski"));
		list.add(new Row("Dominic", "Doom"));
		tables.put("people", list);
	}

	private String table;
	private String column;

	private int colIndex = -1;

	private static final Predicate<String> matchAnystring = s -> s.length() > 0;
	private static final Function<String, Stream<? extends String>> matchAllColumns = Stream::of;

	private Predicate<String> whereFilter = matchAnystring;
	private Function<String, Stream<? extends String>> columnMapper = matchAllColumns;

	public void setColumn(String column) {
		this.column = column;
		setColumnMapper();
	}

	public void setTable(String table) {
		this.table = table;
	}

	public void setFilter(Predicate<String> filter) {
		whereFilter = filter;
	}

	public void clear() {
		column = "";
		columnMapper = matchAllColumns;
		whereFilter = matchAnystring;

	}

	public List<String> search() {
		List<String> result = tables.entrySet()
				.stream()
				.filter(entry -> entry.getKey().equalsIgnoreCase(table))
				.flatMap(entry -> Stream.of(entry.getValue()))
				.flatMap(Collection::stream)
				.map(Row::toString)
				.flatMap(columnMapper)
				.filter(whereFilter).collect(Collectors.toList());
		clear();
		return result;
	}

	private void setColumnMapper() {
		switch (column) {
		case "*":
			colIndex = -1;
			break;
		case "name":
			colIndex = 0;
			break;
		case "surname":
			colIndex = 1;
			break;
		}
		if (colIndex != -1)
			columnMapper = s -> Stream.of(s.split(" ")[colIndex]);
	}
}
