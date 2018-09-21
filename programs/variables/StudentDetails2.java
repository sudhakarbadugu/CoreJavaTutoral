class StudentDetails2{
   public byte sno;
	public byte age;
	public String name;
	public String college;
	public int fee;
	public static void main(String[] args){
		StudentDetails2 kf=new StudentDetails2();
				kf.sno=25;
				kf.age=22;
				kf.name="venky";
				kf.college="narayana";
				kf.fee=50000;
		System.out.println( kf.sno);
		System.out.println(kf.age);
		System.out.println(kf.name);
		System.out.println(kf.college);
		System.out.println(kf.fee);
	}
}
