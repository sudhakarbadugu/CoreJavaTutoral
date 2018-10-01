class User1{
	private String username;
	private String password;
	private String dob;
	private int age;
	private int id;
	public User1(String username,String password,String dob,int age,int id ){
		System.out.println("user details");
		this.username=username;
		this.password=password;
		this.dob=dob;
		this.age=age;
		this.id=id;
	}
	public void setUserName(String a){
		username=a;
	}
	public String getUserName(){
		return username;
	}
	public void setPassword(String b){
		 password=b;
	}
	public String getPassword(){
		return password;
	}
	public void setAge(int d){
		 age=d;
	}
	public int getAge(){
		return age;
	}
	public void setId(int e){
		 id=e;
	}
	public int getId(){
		return id;
	}
	
	public String toString(){
		return username+"\n "+password+"\n "+dob+" \n"+age+"\n "+id;
	}
	public static void main(String...m){
	User1 n=new User1("venky","rew","25-12-1995",22,765);
	  // n.setuserName("murali");
	  // n.setpassword("rocks");
	  // n.setdob("2-7-1545");
	  // n.setAge(22);
	  // n.setId(065);
	 System.out.println(n); 
	}
}