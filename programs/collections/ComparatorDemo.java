import java.util.*;

public class ComparatorDemo {

	public static void main(String s[]){
		StringBuilderComparator sc = new StringBuilderComparator();
		TreeSet ts = new TreeSet(sc);
		ts.add(new StringBuilder("bb"));
		ts.add(new StringBuilder("xb"));
		ts.add(new StringBuilder("Ab"));
		ts.add(1);	//because comparator 
		
		System.out.println(ts);
		
		EmployeeSalaryComparator ec = new EmployeeSalaryComparator();
		EmployeeNameComparator en = new EmployeeNameComparator();
		TreeSet ts2 = new TreeSet(en);
		
		Employee e1 = new Employee("Ab", 200);
		Employee e2 = new Employee("zd", 2000);
		Employee e3 = new Employee("ch", 1000);
		
		ts2.add(e1);
		ts2.add(e2);
		ts2.add(e3);
		
		System.out.println(ts2);
	}
}

class StringBuilderComparator implements Comparator {

	public int compare(Object o1, Object o2){
		String s1 = o1.toString();
		String s2 = o2.toString();
		
		return s1.compareTo(s2); //normal order
		// return s2.compareTo(s1); //reverse order
	}
}

class EmployeeSalaryComparator implements Comparator {

	public int compare(Object o1, Object o2){
		Employee e1 = (Employee) o1;
		Employee e2 = (Employee) o2;
		
		int salary1 = e1.salary;
		int salary2 = e2.salary;
		
		if(salary1 == salary2){
			return 0;
		} else if(salary1 > salary2){
			return 1;
		}else {
			return -1;
		}
	}
}

class EmployeeNameComparator implements Comparator {

	public int compare(Object o1, Object o2){
		Employee e1 = (Employee) o1;
		Employee e2 = (Employee) o2;
		
		return e1.name.compareTo(e2.name);
	}
}

class Employee {
	String name;
	int salary;
	
	Employee(String name, int salary){
		this.name = name;
		this.salary = salary;
	}
	
	public String toString(){
		return "name="+name + " salary="+salary;
	}
}