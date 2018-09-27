  class Family1{
    private int age;
	private String name;
	 String fatherName;
	 String motherName;
     String brotherName;
	private void setAge(int a){
		age=a;
	}
	private void setName(String s){
	name=s;
	}
	public void setFatherName(String h){
		fatherName=h;
	}
	public void setmotherName(String b){
		motherName=b;
	}
	public void setbrotherName(String d){
		brotherName=d;
	}
	public static void main(String...a){
		Family1 h=new Family1();
		   h.setAge(22);
		   h.setName("murali");
		   h.setFatherName("venkat");
		   h.setmotherName("ademma");
		   h.setbrotherName("venky");
		   printValues(h);
	}
	public static void printValues(Family1 h){
	System.out.println(h.getAge());
	System.out.println(h.getName());
	System.out.println(h.getFatherName());
	System.out.println(h.getmotherName());
	System.out.println(h.getbrotherName());
	}
	 private String getName(){
		return name;
	}
	 private int getAge(){
	 return age;
	
	}
	private String getFatherName(){
		return fatherName;
	}
	private String getmotherName(){
		return motherName;
	}
	private String getbrotherName(){
		return brotherName;
	}
  }