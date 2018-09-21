class Person{
	private int age;
    private String name;
	private String collegeName;
	
	public static void main(String args[]){
		System.out.println("main" + collegeName);
		Person p1=new Person();
		p1.age=22;
		p1.name="murali";
		p1.collegeName="narayana";
		Person p2=new Person();
		System.out.println("p1" +p1.collegeName);
		p1();
	}
		public static void p1(){
			System.out.println("p1: "+ collegeName);
		}
	}
