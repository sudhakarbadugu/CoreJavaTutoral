class MethodReturnTypeDto{
 public static void main(String...k){
 MethodReturnTypeDto h=new MethodReturnTypeDto();
 String s=h.getName();
 System.out.println(s);
 int a=h.getAge();
 System.out.println(a);
 long l=h.getSalary();
 System.out.println(l);
 }
 public String getName(){
	 return"murali";
 }
 public int getAge(){
	 int a=22;
  return a;	 
 }
 public long getSalary(){
	 long k=5000;
	 return k;
 }
 public void m1(){
	 System.out.println("m1");
 }
}