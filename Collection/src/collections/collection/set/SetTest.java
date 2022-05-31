package collections.collection.set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SetTest {

	public static void main(String[] args) {
		
		Collection<Type> collection = new ArrayList<>();

		Type type1 = new Type("type 1");
		Type type2 = new Type("type 2");
		Type type3 = new Type("type 3");
		Type type4 = new Type("type 4");
		Type type5 = new Type("type 5");
		
		collection.add(type1);
		collection.add(type1);
		collection.add(type2);
		collection.add(type2);
		collection.add(type3);
		collection.add(type3);
		collection.add(type4);
		collection.add(type4);
		collection.add(type5);
		collection.add(type5);
		
		collection.stream().forEach(e -> System.out.println(e));
		System.out.println("set");
//		Collection<Type> set = new HashSet<Type>(collection);

//		Collection<Type> set = collection.stream().collect(Collectors.toSet());
		
//		Set<String> set = collection.stream()
//				.map(Type::getName)
//				.collect(Collectors.toCollection(TreeSet::new));
		
		Collection<Type> set = new LinkedHashSet<Type>(collection);
		
		System.out.println(set.getClass().getName());
		set.stream().forEach(e -> System.out.println(e));
		
		
	}

}
