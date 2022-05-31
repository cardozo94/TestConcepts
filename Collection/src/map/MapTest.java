package map;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class MapTest {
	public static void main(String[] args) {
		Department IT = new Department("IT");
		Employee employee = new Employee("Camilo", IT, 680);
		Employee employee1 = new Employee("Briyith", new Department("HR"), 300);
		Employee employee2 = new Employee("Javier", IT, 700);
		Employee employee3 = new Employee("Andres", IT, 1000);
		Employee employee4 = new Employee("Cristian", IT, 680);

		List<Employee> employees = new ArrayList<Employee>();
		employees.add(employee);
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);

		Map<Department, List<Employee>> byDept = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment));
		
		System.out.println(byDept.size());
		for (Entry<Department, List<Employee>> employee5 : byDept.entrySet()) {
			System.out.println("key "+employee5.getKey()+" value: "+employee5.getValue());
		}
		
		Map<Department, Integer> totalByDept = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment,Collectors.summingInt(Employee::getSalary)));
		
		for (Entry<Department, Integer> salary : totalByDept.entrySet()) {
			System.out.println("key "+salary.getKey()+" value: "+salary.getValue());
		}

	}

}
