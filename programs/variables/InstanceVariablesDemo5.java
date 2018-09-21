class InstanceVariablesDemo5{
	public int rollno=8;
	public static String college="sv arts";
	public int age=22;
	public int salary=100;
	public static void main(String[] args){
		// InstanceVariablesDemo5 person=new InstanceVariablesDemo5();
	   InstanceVariablesDemo5 object=new InstanceVariablesDemo5();
							object.murali();
		System.out.println(object.rollno);
		   System.out.println(college);
		    System.out.println(object.age);
		    System.out.println(object.salary);
		  
	}
	public void murali(){
		System.out.println("murali "+ rollno);
		System.out.println("murali "+ college);
		 System.out.println("murali "+ age);
		 System.out.println("murali "+ salary);
	}
}
