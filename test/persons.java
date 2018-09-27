class persons{
   private byte no;
   private String name;
   private String fname;
   private void setno(byte s){
	   no=s;
   }
   private byte getno(){
	   return no;
   }
   private void setName(String l){
	   name=l;
   }
   private String getName(){
	   return name;
   }
   private void setFname(String h){
	   fname=h;
   }
   private String getfname(){
	   return fname;
   }
   public static void main(String...e){
	   persons n=new persons();
	   byte b= 1;
	     n.setno(b);
		 n.setName("murali");
		 n.setFname("Prasad");
		 printvalues(n);
   }
   public static void printvalues(persons a){
	   System.out.println(a.getno());
	   System.out.println(a.getName());
	   System.out.println(a.getfname());
   }
}