import java.io.Serializable;

class Person implements Serializable {
	String name;
	int age;
	transient int salary; //this value will not participate in serialization process.
	Mobile phone;
	
	transient final String address = "Karur";	//no impact
	transient static String address1 = "Karur";	//no impact
	
	Person(String name, int age, int sal){
		this.name = name;
		this.age = age;
		salary = sal;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public int getAge(){
		return this.age;
	}
	
	public String getName(){
		return this.name;
	}	
}

class Mobile implements Serializable {
	long phoneNumber;
	Telephone tele;
}

class Telephone extends Mobile {
	long telephoneNumber;
}