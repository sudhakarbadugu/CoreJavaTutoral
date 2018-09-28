class Students{
   private int age;
   private String name;
   private String collegeName;
   
   public Students(String n,String m){
	   System.out.println("Students details");
   }
   
   public int getAge(){
   return age;
   }
   public void setAge(int a){
   age=a;
   }
   public String getname(){
   return name;
   }
   public void setname( String g){
   name=g;
   }
   public String getcollegeName(){
   return collegeName;
   }
   public void setcollegeName(String v){
   collegeName=v;
   }
   public static void main(String...d){
   Students m=new Students("murali","suresh");
     m.setAge(22);
		m.setname("raja");
		m.setcollegeName("narayana");
	Students n=new Students("tony","jany");
        n.setAge(23);
        n.setname("rahul");
         n.setcollegeName("jntu");		
		System.out.println(m.getAge());
		System.out.println(m.getname());
		System.out.println(m.getcollegeName());
   } 
   
}