class Family{
	private int age;
	private String name;
	 String motherName;
	 String fatherName;
	 String brotherName;
	 String sisterName;
	 static String villageName="karuru"; 
	 
		 private int getAge(){
			 return age;
		 }
		 private String getName(){
			 return name;
		 }
		 private String getmotherName(){
			 return motherName;
		 }
		 private String getfatherName(){
			 return fatherName;
		 } 
		 private String motherName(){
			 return motherName;
		 }
		 public static void main(String...a){
		 Family a1=new Family();
		    printvalues(a1);
			
			a1.age=22;
			a1.name="murali";
			a1.motherName="ademma";
			a1.fatherName="venkata";
			a1.motherName="ademma";
			a1.brotherName="venky";
			
			printvalues(a1);
			System.out.println("***************");
			Family a2=new Family();
			a2.age=22;
			a2.name="prasad";
			a2.motherName="ranemma";
			a2.fatherName="chandra";
			a2.brotherName="pavan";
			printvalues(a2);
			System.out.println("**************");
			Family a3=new Family();
			a3.age=27;
			a3.name="sudha";
			a3.fatherName="madhav";
			a3.motherName="lakshmi";
			a3.sisterName="sunitha";
			// printvalues(a3);
			System.out.println("************");
			Family a4=new Family();
			a4.age=29;
			a4.motherName="lalita";
			a4.fatherName="sahool";
			a4.brotherName="anil";
			a4.sisterName="asifa";
			printvalues(a4);
			System.out.println("***********");
			Family a5=new Family();
			a5.age=22;
			a5.motherName="vijaya";
			a5.fatherName="tony";
			a5.sisterName="jany";
			printvalues(a5);
	 }
	 public static void printvalues(Family a){
		 System.out.println(a.age);
		 System.out.println(a.name);
		 System.out.println(a.motherName);
		 System.out.println(a.fatherName);
		 System.out.println(a.brotherName);
		 System.out.println(villageName);
		 System.out.println(a.sisterName);
	 }
}	 