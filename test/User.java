class User{
    private String username;
	private String password;
	private String dob;
	private int age;
	private int id;
	private String firstname;
	private String lastname;
	private String address;
	private float salary;
   
   public User(String username, String password,String dob,int age,int id, String firstname,String lastname,String address,float salary){
	   this.username=username;
	   this.password=password;
	   this.dob=dob;
	   this.age=age;
	   this.firstname=firstname;
	   this.lastname=lastname;
	   this.address=address;
	   this.salary=salary;
	   
   }

    public void setUsername( String a){
		username=a;
	}
	public String getUsername(){
		return username;
	}
	public void setPassword(String b ){
		password=b;
	}
	public String getPassword(){
		return password;
	}
	public void setDob(String c){
		dob=c;
	}
	public String getDob(){
		return dob;
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
	public void setfirstName(String f){
		firstname=f;
	}
	public String getfirstName(){
		return firstname;
	}
	public void setlastName(String g){
		lastname=g;
	}
	public String getlastName(){
		return lastname;
	}
	public void setsalary(int h){
		salary=h;
	}
	public float getsalary(){
		return salary;
	}
	public void setaddress(String i){
		address=i;
	}
	public String getaddress(){
		return address;
	}
	
	
	public String toString(){
	return username+" "+password+" "+dob+" "+age+" "+firstname+" "+lastname+" "+address+ " "+salary;
	}
	public static void main(String...s){
		User n=new User( "murali","234","12_3_1996",22,768,"badugu","murali","ramnagar",700.7f);
		System.out.println(n);
		User m=new User("sudha","1234","24-4-1995",26,74/54,"badugu","sudha","velacherry",123.88f );
		System.out.println(m);
	}
	
}	