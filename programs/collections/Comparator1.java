import java.util.*;
	public class Comparator1{
			public static void main(String[] args){
			
		
			EmployeeSalaryComparator k=new EmployeeSalaryComparator();
			TreeSet t=new TreeSet();
			Employee s=new Employee("abs",2900);
			Employee i=new Employee("ieyr",8900);
			t.add(s);
			t.add(i);
			System.out.println(t);
			}
	}
	class EmployeSalaryComparator implements Comparator{
	
		public int compare(Object o1,Object o2){
		Employee e1=(Employee) o1;
		Employee e2=(Employee) o2;
		return e1.compareTo(e2.salary);
		}
	}
	class Employee{
		String name;
		int salary;
		Employee(String name,int salary){
			this.name=name;
			this.salary=salary;
		}
		public String toString(){
			return"name"+name+"salary"+salary;
		}	
		}
	