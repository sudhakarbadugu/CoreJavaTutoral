public class SchoolMembers{
		private int age=45;
		static String name="vasdev";
		
	public static void main(String args[]){
		 SchoolMembers n=new SchoolMembers();
		SchoolMembers.TeacherClass o=n.new TeacherClass();
		
		SchoolMembers.TeacherClass o1=new SchoolMembers().new TeacherClass();
		o.s1();
		o1.s1();
	}
	public void children(){
		System.out.println("m1");
	}
   private   class TeacherClass{
		  
		  public void s1(){
			  children();
		  System.out.println("age: " +age+"name:" +name);
	  }
	
	}
	
}
